package com.oddfar.campus.huluwa.task;
import com.oddfar.campus.huluwa.service.IUserPlatformService;
import com.oddfar.campus.huluwa.util.CommonUtils;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@EnableScheduling
@Component
public class HuluwaUserTask {
    private static final Logger log = LoggerFactory.getLogger(com.oddfar.campus.huluwa.task.HuluwaUserTask.class);

    @Resource
    private IUserPlatformService userPlatformService;

    @Scheduled(cron = "42 6 */8 * * * ")
    public void refreshUser() {
        CommonUtils.sleepSeconds(120);
        try {
            log.info("开始刷新用户信息");
            int cnt = this.userPlatformService.refreshAllUserPlatform();
            log.info("刷新所有用户信息完成，用户数量：{}", Integer.valueOf(cnt));
        } catch (Exception e) {
            log.error("刷新所有用户信息出现异常", e);
        }
    }
}
