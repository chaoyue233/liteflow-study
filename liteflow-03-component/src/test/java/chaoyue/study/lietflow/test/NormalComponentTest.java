package chaoyue.study.lietflow.test;

import chaoyue.study.liteflow.ComponentApplication;
import com.yomahub.liteflow.core.FlowExecutor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ComponentApplication.class)
public class NormalComponentTest {
    @Autowired
    private FlowExecutor flowExecutor;

    @Test
    public void testNormal() {
        flowExecutor.execute2Resp("chain1");
    }
}
