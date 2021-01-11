package task.JobHandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
//import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Component;

/**
 * @Classname JobHandlerDemo
 * @Description TODO
 * @Date 2021/1/11 9:56
 * @Author lichengshuai
 */
//@JobHandler(value = "demoJobHandler")
@Component
public class JobHandlerDemo extends IJobHandler {

    @Override
    @XxlJob(value = "demoJobHandler")
    public ReturnT<String> execute(String s) throws Exception {
        System.out.println("xxl-job开始执行。。。。。。。");
        XxlJobLogger.log("Hello~~~xxl-job");
        return SUCCESS;
    }
}
