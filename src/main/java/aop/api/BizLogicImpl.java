package aop.api;

/**
 * Created by zhanghe on 2017/3/13.
 * 6.1 Spring AOP API的Pointcut、advice概念及应用
 * Pointcut
 */
public class BizLogicImpl implements BizLogic{
    public String save() {
        System.out.println("BizLogicImpl:BizLogicImpl save");
        return "BizLogicImpl save";
    }
}
