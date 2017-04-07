package test.aop;

import SpringBean2.Autowired.service.InjectionService;
import aop.api.BizLogic;
import aop.schema.advice.Fit;
import aop.schema.advice.biz.AspectBiz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.UnitTestBase;

/**
 * Created by zhanghe on 2017/3/8.
 * 5.2 配置切面aspect
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPSchemaAdvice extends UnitTestBase{
    public TestAOPSchemaAdvice(){
        super("classpath*:spring-aop-schema-advice.xml");
    }

    @Test
    public void testBiz(){
        AspectBiz biz = super.getBean("aspectBiz");
        biz.biz();

    }
    /**运行结果：
     * MoocAspect before
     * AspectBiz biz
     * MoocAspect afterReturning
     *
     * 抛出异常后的输出结果：
     * MoocAspect before
     * AspectBiz biz
     * MoocAspect afterThrowing
     * 没有afterReturning输出，这是因为抛出异常后，方法没有办法再执行return了，所以没有没有afterReturning输出
     *
     *添加After后的输出：
     * MoocAspect before
     AspectBiz biz
     MoocAspect afterReturning
     MoocAspect after
     * 所有的都执行完毕后，最后再执行after，抛出异常后也同样after在最后被执行
     *
     *
     * 添加环绕通知之后的运行结果：
     * MoocAspect before
     MoocAspect around1
     AspectBiz biz
     MoocAspect around2
     MoocAspect after
     MoocAspect afterReturning
     *这里发现一个问题，怎么afterReturning在after之后执行了呢，然后发现afterReturning和after的执行顺序与配置顺序有关
     * 当配置了around时，afterReturning配置在after前面时，after先执行，afterReturning后执行
     *                   afterReturning配置在after后面时，after后执行，afterReturning先执行
     *  当没有配置around时，先配置的那个先执行。。。尴尬。。。为什么呢？
     *
     *
     * 一开始运行出了个错，什么无法创建bean巴拉巴拉的。。然后发现需要jar包，用maven下载了
     * aspectjweaver包后运行正确了。
     */

    //环绕通知的带参数形式
    @Test
    public void testAroundInit(){
        AspectBiz biz = super.getBean("aspectBiz");
        biz.init("moocService", 3);

    }
    /**输出结果：
     * MoocAspect before
     MoocAspect around1
     aroundInit:moocService 3
     MoocAspect around1
     AspectBiz:moocService 3
     MoocAspect around2
     MoocAspect around2
     MoocAspect after
     MoocAspect afterReturning
     */

    //5.6 Introductions应用（简介）
    @Test
    public void testFit(){
        Fit fit =(Fit)super.getBean("aspectBiz");
        fit.filter();
    }
    /**
     * 输出结果：FitImpl filter
     *
     */

}
