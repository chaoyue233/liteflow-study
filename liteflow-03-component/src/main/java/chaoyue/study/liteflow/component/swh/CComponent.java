package chaoyue.study.liteflow.component.swh;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

@LiteflowComponent("c")
public class CComponent extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("C组件执行...");
    }
}
