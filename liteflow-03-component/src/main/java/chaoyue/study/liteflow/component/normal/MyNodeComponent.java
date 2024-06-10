package chaoyue.study.liteflow.component.normal;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

/**
 * 普通组件节点
 */
@LiteflowComponent("normalComponent")
public class MyNodeComponent extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("普通业务节点执行逻辑");
        // 通过this关键字可以获取上下文信息，从上下文中可以获取自定义数据
        // 获取组件ID
        System.out.println(this.getNodeId());
        // 获取执行流程名称
        System.out.println(this.getChainName());
    }

    /**
     * 表示是否进入该节点，用于业务参数的预先判断
     */
    @Override
    public boolean isAccess() {
        return super.isAccess();
    }

    /**
     * 表示如果当前节点出错是否继续执行下一个组件，默认为false
     */
    @Override
    public boolean isContinueOnError() {
        return super.isContinueOnError();
    }

    /**
     * 表示当前流程是否正常结束
     * 可用用来根据逻辑判断是否提前结束整个流程
     */
    @Override
    public boolean isEnd() {
        return super.isEnd();
    }

    /**
     * 当前节点process方法执行前的前置处理方法
     */
    @Override
    public void beforeProcess() {
        super.beforeProcess();
    }

    /**
     * 当前节点process方法执行后的后置处理方法
     */
    @Override
    public void afterProcess() {
        super.afterProcess();
    }

    /**
     * 当前节点执行成功回调方法
     */
    @Override
    public void onSuccess() throws Exception {
        super.onSuccess();
    }

    /**
     * 当前节点执行失败回调方法
     */
    @Override
    public void onError(Exception e) throws Exception {
        super.onError(e);
    }

    /**
     * 如果当前节点执行失败的回滚方法
     */
    @Override
    public void rollback() throws Exception {
        super.rollback();
    }
}
