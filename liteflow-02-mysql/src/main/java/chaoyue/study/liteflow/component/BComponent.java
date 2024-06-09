package chaoyue.study.liteflow.component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

@LiteflowComponent("b")
public class BComponent extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("组件B任务执行...");
    }
}
