package chaoyue.study.liteflow.component;

import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

@Component("a")
public class AComponent extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("组件A任务执行...");
    }
}
