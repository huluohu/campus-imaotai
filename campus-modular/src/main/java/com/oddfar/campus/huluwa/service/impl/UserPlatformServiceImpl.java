package com.oddfar.campus.huluwa.service.impl;

import com.oddfar.campus.common.domain.PageResult;
import com.oddfar.campus.common.utils.StringUtils;
import com.oddfar.campus.huluwa.domain.ChannelActivity;
import com.oddfar.campus.huluwa.domain.ChannelInfo;
import com.oddfar.campus.huluwa.domain.CustomerInfo;
import com.oddfar.campus.huluwa.domain.CustomerInfoDto;
import com.oddfar.campus.huluwa.entity.UserPlatform;
import com.oddfar.campus.huluwa.entity.UserPlatformHistory;
import com.oddfar.campus.huluwa.enums.PlatformEnum;
import com.oddfar.campus.huluwa.mapper.IUserPlatformHistoryMapper;
import com.oddfar.campus.huluwa.mapper.IUserPlatformMapper;
import com.oddfar.campus.huluwa.repository.HuluwaLogRepository;
import com.oddfar.campus.huluwa.service.IChannelInfoService;
import com.oddfar.campus.huluwa.service.ICustomerService;
import com.oddfar.campus.huluwa.service.IPromotionActivityService;
import com.oddfar.campus.huluwa.service.IUserPlatformService;
import com.oddfar.campus.huluwa.util.CommonUtils;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserPlatformServiceImpl implements IUserPlatformService {
    private static final Logger log = LoggerFactory.getLogger(com.oddfar.campus.huluwa.service.impl.UserPlatformServiceImpl.class);

    @Resource
    private IUserPlatformMapper userPlatformMapper;

    @Resource
    private IUserPlatformHistoryMapper userPlatformHistoryMapper;

    @Resource
    private IChannelInfoService channelInfoService;

    @Resource
    private ICustomerService customerService;

    @Resource
    private IPromotionActivityService promotionActivityService;

    public int insert(UserPlatform userPlatform) {
        return this.userPlatformMapper.insert(userPlatform);
    }

    public UserPlatform findByToken(String token) {
        return (UserPlatform)this.userPlatformMapper.selectOne("token", token);
    }

    public UserPlatform findUniqueUser(PlatformEnum platformEnum, String phone) {
        return (UserPlatform)this.userPlatformMapper.selectOne("platform", platformEnum, "phone", phone);
    }

    public PageResult<UserPlatform> page(UserPlatform userPlatform) {
        return this.userPlatformMapper.selectPage(userPlatform);
    }

    @Transactional(rollbackFor = {Exception.class})
    public CustomerInfoDto addUserPlatform(PlatformEnum platformEnum, String token) {
        CustomerInfoDto customerInfoDto = new CustomerInfoDto();
        ChannelInfo channelInfo = this.channelInfoService.getChannelInfo(platformEnum, token);
        String message = null;
        if (channelInfo == null) {
            message = "平台和Token不匹配，请重新确认";
        } else if (channelInfo.isSuccess()) {
            CustomerInfo customerInfo = this.customerService.queryInfo(platformEnum, token);
            if (customerInfo == null || !customerInfo.isSuccess()) {
                message = "获取用户信息失败";
            } else {
                message ="绑定成功";
                createOrUpdate(platformEnum, token, customerInfo, 1, message);
                BeanUtils.copyProperties(customerInfo, customerInfoDto);
            }
        } else {
            message = channelInfo.getMessage();
        }
        customerInfoDto.setMessage(message);
        HuluwaLogRepository.cacheActionLog(platformEnum, token, message);
        return customerInfoDto;
    }

    public boolean refreshUserPlatform(PlatformEnum platformEnum, String token) {
        log.info("准备刷新用户信息：platform[{}], token[{}]", platformEnum, token);
        CustomerInfo customerInfo = this.customerService.queryInfo(platformEnum, token);
        if (customerInfo == null)
            return false;
        String message = customerInfo.getMessage();
        int status = 1;
        String logMessage = null;
        if (!customerInfo.isSuccess()) {
            logMessage = "刷新用户信息失败："+ message;
            status = 0;
        } else if (message != null) {
            logMessage = "刷新用户信息成功："+ message;
        } else {
            logMessage = "刷新用户信息成功";
        }
        HuluwaLogRepository.cacheActionLog(platformEnum, token, logMessage);
        createOrUpdate(platformEnum, token, customerInfo, status, message);
        return customerInfo.isSuccess();
    }

    private void createOrUpdate(PlatformEnum platformEnum, String token, CustomerInfo customerInfo, int status, String message) {
        if (StringUtils.isNotBlank(customerInfo.getPhone())) {
            UserPlatform dbUserPlatform = findUniqueUser(platformEnum, customerInfo.getPhone());
            if (dbUserPlatform != null) {
                UserPlatformHistory userPlatformHistory = new UserPlatformHistory();
                BeanUtils.copyProperties(dbUserPlatform, userPlatformHistory);
                this.userPlatformHistoryMapper.insert(userPlatformHistory);
                this.userPlatformMapper.deleteById(dbUserPlatform.getId());
            }
        }
        UserPlatform userPlatform = new UserPlatform();
        userPlatform.setNickName(customerInfo.getNickname());
        userPlatform.setPhone(customerInfo.getPhone());
        userPlatform.setPlatform(platformEnum);
        userPlatform.setRealName(customerInfo.getRealName());
        userPlatform.setToken(token);
        userPlatform.setStamp(new Date());
        userPlatform.setStatus(Integer.valueOf(status));
        userPlatform.setMessage(message);
        insert(userPlatform);
    }

    public int refreshAllUserPlatform() {
        List<UserPlatform> list = this.userPlatformMapper.selectList();
        int cnt = 0;
        for (UserPlatform userPlatform : list) {
            if (StringUtils.isAnyBlank(new CharSequence[] { userPlatform.getToken() }) || userPlatform.getPlatform() == null) {
                log.warn("用户信息不完整：{}", userPlatform);
                continue;
            }
            boolean status = refreshUserPlatform(userPlatform.getPlatform(), userPlatform.getToken());
            if (status)
                cnt++;
            CommonUtils.sleepSeconds(10);
        }
        return cnt;
    }

    public List<UserPlatform> queryAll() {
        return this.userPlatformMapper.selectList();
    }

    public List<UserPlatform> queryByPlatform(PlatformEnum platformEnum) {
        return this.userPlatformMapper.selectList("platform", platformEnum);
    }

    @Transactional
    public int delete(Long id) {
        UserPlatform userPlatform = (UserPlatform)this.userPlatformMapper.selectById(id);
        if (userPlatform == null)
            return 0;
        UserPlatformHistory userPlatformHistory = new UserPlatformHistory();
        BeanUtils.copyProperties(userPlatform, userPlatformHistory);
        this.userPlatformHistoryMapper.insert(userPlatformHistory);
        return this.userPlatformMapper.deleteById(id);
    }

    public boolean appoint(PlatformEnum platformEnum, String token) {
        ChannelActivity channelActivity = this.promotionActivityService.queryChannelActivity(platformEnum, token);
        if (channelActivity == null || !channelActivity.isSuccess()) {
            HuluwaLogRepository.cacheActionLog(platformEnum, token, (channelActivity == null) ? "请求预约信息失败": channelActivity.getMessage());
            return false;
        }
        int activityId = channelActivity.getId().intValue();
        Integer channelId = this.channelInfoService.getChannelId(platformEnum, token);
        if (channelId == null) {
            HuluwaLogRepository.cacheActionLog(platformEnum, token, "请求频道信息失败");
            return false;
        }
        return this.promotionActivityService.appoint(platformEnum, token, activityId, channelId.intValue());
    }

    public boolean checkDraw(PlatformEnum platformEnum, String token) {
        ChannelActivity channelActivity = this.promotionActivityService.queryChannelActivity(platformEnum, token);
        if (channelActivity == null || !channelActivity.isSuccess()) {
            HuluwaLogRepository.cacheActionLog(platformEnum, token, (channelActivity == null) ? "请求预约信息失败": channelActivity.getMessage());
            return false;
        }
        int activityId = channelActivity.getId().intValue();
        return this.promotionActivityService.queryActivityIsDraw(platformEnum, token, activityId);
    }
}
