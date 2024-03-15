package com.oddfar.campus.huluwa.task;

import com.oddfar.campus.huluwa.domain.ActionLogInfo;
import com.oddfar.campus.huluwa.entity.RequestLog;
import com.oddfar.campus.huluwa.repository.HuluwaLogRepository;
import com.oddfar.campus.huluwa.service.IActionLogService;
import com.oddfar.campus.huluwa.service.IRequestLogService;
import java.util.List;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling
@Component
public class HuluwaLogTask {
    private static final Logger log = LoggerFactory.getLogger(com.oddfar.campus.huluwa.task.HuluwaLogTask.class);

    @Resource
    private IRequestLogService requestLogService;

    @Resource
    private IActionLogService actionLogService;

    @Scheduled(cron = "*/5 * * * * * ")
    public void dealLog() {
        List<RequestLog> list = HuluwaLogRepository.popAll();
        if (!list.isEmpty())
            try {
                for (RequestLog requestLog : list)
                    this.requestLogService.insert(requestLog);
            } catch (Exception e) {
                log.error("写入请求日志出现异常", e);
            }
        List<ActionLogInfo> actionLogList = HuluwaLogRepository.popAllActionLog();
        if (!actionLogList.isEmpty())
            try {
                this.actionLogService.insert(actionLogList);
            } catch (Exception e) {
                log.error("写入操作日志出现异常", e);
            }
    }
}
