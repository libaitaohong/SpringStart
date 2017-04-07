package test.aop.aspectj;

import aop.api.BizLogic;
import aop.aspectj.biz.MoocBiz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.UnitTestBase;

/**
 * Created by zhanghe on 2017/3/15.
 * 第七章 Spring对AspectJ的支持
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAspectj extends UnitTestBase{
    public TestAspectj(){
        super("classpath*:spring-aop-aspectj.xml");
    }

    @Test
    public void test(){
        MoocBiz biz = getBean("moocBiz");
        biz.save("This is test");
    }
    /**输出：
     * Before
     * MoocBiz save:This is test
     * afterReturning:Save success
     *
     * 抛出异常后输出：
     * Before
     * MoocBiz save:This is test
     * afterThrowing:save failed
     *
     * 加上After后的输出
     * Before
     * MoocBiz save:This is test
     * After
     * afterReturning:Save success
     *
     * 加入环绕通知
     * Around 1
     * Before
     * MoocBiz save:This is test
     * Around 2
     * Around:Save success
     * After
     * afterReturning:Save success
     */

}
