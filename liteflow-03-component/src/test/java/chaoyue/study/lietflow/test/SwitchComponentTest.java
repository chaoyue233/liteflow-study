package chaoyue.study.lietflow.test;

import chaoyue.study.liteflow.ComponentApplication;
import com.yomahub.liteflow.core.FlowExecutor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ComponentApplication.class)
public class SwitchComponentTest {
    @Autowired
    private FlowExecutor flowExecutor;

    @Test
    public void testSwitch() {
        for (int i = 0; i < 10; i++) {
            flowExecutor.execute2Resp("chain2");
        }
    }
}
