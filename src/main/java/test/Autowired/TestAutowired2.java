package test.Autowired;

import SpringBean2.Autowired.service.InjectionService;
import SpringBean2.multibean.BeanInvoker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.UnitTestBase;

/**
 * Created by zhanghe on 2017/3/8.
 * 4.3 Autowired注解说明-2
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutowired2 extends UnitTestBase{
    public TestAutowired2(){
        super("classpath*:spring-autowired.xml");
    }

    @Test
    public void testMultiBean(){
        BeanInvoker invoker = super.getBean("beanInvoker");
        invoker.say();
    }
    /**输出：
     *
     list...
     SpringBean2.multibean.BeanImplTwo
     SpringBean2.multibean.BeanImplOne
     map...
     beanImplOne SpringBean2.multibean.BeanImplOne
     beanImplTwo SpringBean2.multibean.BeanImplTwo
     * 这说明Autowired的确能把BeanInterface的两个实现类注解到list与map中去。代码在SpringBean2.multibean.BeanInvoker
     * list是把类的实例放进来
     * map是把bean id作为key，类的实例作为value
     *
     * 使用@Order(value = num) 来设置顺序，我们把One设置为@Order(value = 1)，two设置为@Order(value = num)
     * 但是发现只有list遵循了这一顺序，map没有遵循这一顺序，说明Order对list有效对map无效。
     *
     * 4.4 Autowired注解说明-3
     * 输出：
     * SpringBean2.multibean.BeanImplOne
     * 在SpringBean2.multibean.BeanInvoker中设置了BeanInterface的对象，
     * 并使用 @Qualifier("beanImplOne")注解来确定使用beanImplOne实现类
     * 说明了@Qualifier能够缩小范围，确定具体的bean
     */
}
