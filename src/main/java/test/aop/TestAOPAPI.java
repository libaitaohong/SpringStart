package test.aop;

import aop.api.BizLogic;
import aop.schema.advice.Fit;
import aop.schema.advice.biz.AspectBiz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.UnitTestBase;

/**
 * Created by zhanghe on 2017/3/11.
 * 第六章 Spring AOP的API介绍
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPAPI extends UnitTestBase{
    public TestAOPAPI(){
        super("classpath*:spring-aop-api.xml");
    }

    @Test
    public void testSave(){
        BizLogic logic = super.getBean("bizLogicImpl");
        logic.save();
    }
    /**输出结果：
     * MoocBeforeAdvice:save  aop.api.BizLogicImpl
       MoocMethodInterceptor 1:save  java.lang.reflect.Method
       BizLogicImpl:BizLogicImpl save
       MoocMethodInterceptor 2:BizLogicImpl save
       MoocAfterReturningAdvice:save  aop.api.BizLogicImpl  BizLogicImpl save
     */

}
