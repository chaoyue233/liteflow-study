package chaoyue.study.liteflow.component;

import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;


@Component("B")
public class BComponent extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("组件B任务执行");
    }
}
