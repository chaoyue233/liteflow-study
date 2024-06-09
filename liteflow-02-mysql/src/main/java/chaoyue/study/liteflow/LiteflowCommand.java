package chaoyue.study.liteflow;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import com.yomahub.liteflow.slot.DefaultContext;
import com.yomahub.liteflow.util.JsonUtil;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LiteflowCommand implements CommandLineRunner {
    @Resource
    private FlowExecutor flowExecutor;

    @Override
    public void run(String... args) throws Exception {
        while(true){
            // 执行chain1任务，任务链定义在数据库中 链条的最后一步执行了脚本，往上下文中放了Student对象
            LiteflowResponse response = flowExecutor.execute2Resp("chain1", "arg");
            // 从上下文中获取Student对象
            DefaultContext context = response.getFirstContextBean();
            System.out.println(JsonUtil.toJsonString(context.getData("student")));
            if (response.isSuccess()){
                log.info("执行成功");
            }else{
                log.info("执行失败");
            }
            Thread.sleep(1000);
        }
    }
}
