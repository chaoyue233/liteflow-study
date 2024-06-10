package chaoyue.study.liteflow.component.swh;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;

import java.util.Random;

@LiteflowComponent("mySwitchComponent")
public class MySwitchComponent extends NodeSwitchComponent {
    /**
     * 返回内容为另外一个组件的ID
     */
    @Override
    public String processSwitch() throws Exception {
        Random random = new Random();
        int i = random.nextInt(2);
        if (i % 2 == 0) {
            System.out.println("路由选择B组件");
            return "b";
        }
        System.out.println("路由选择C组件");
        return "c";
    }
}
