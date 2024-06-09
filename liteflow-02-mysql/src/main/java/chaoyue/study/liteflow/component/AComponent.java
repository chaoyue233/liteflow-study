package chaoyue.study.liteflow.component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

/**
 * 注解@LiteflowComponent 本质上就是Spring的Component注解
 */
@LiteflowComponent("a")
public class AComponent extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("组件A任务执行...");
    }
}
