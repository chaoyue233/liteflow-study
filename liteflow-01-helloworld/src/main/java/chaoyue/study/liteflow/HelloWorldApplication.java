package chaoyue.study.liteflow;

import com.yomahub.liteflow.core.FlowExecutor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
        // 通过flowExecutor来触发任务的执行
        FlowExecutor executor = context.getBean(FlowExecutor.class);
        executor.execute2Resp("helloworldChain");
    }
}
