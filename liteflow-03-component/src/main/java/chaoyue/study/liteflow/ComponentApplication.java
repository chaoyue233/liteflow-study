package chaoyue.study.liteflow;

import com.yomahub.liteflow.core.FlowExecutor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ComponentApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ComponentApplication.class, args);
        FlowExecutor executor = context.getBean(FlowExecutor.class);
        executor.execute2Resp("chain1");
    }
}
