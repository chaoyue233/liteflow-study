package chaoyue.study.liteflow.component.normal;

import chaoyue.study.liteflow.component.context.MyCustomContext;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

@LiteflowComponent("b")
public class BComponent extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("B组件执行...");
        MyCustomContext myContext = this.getContextBean(MyCustomContext.class);
        System.out.println(myContext.getName());
    }
}
