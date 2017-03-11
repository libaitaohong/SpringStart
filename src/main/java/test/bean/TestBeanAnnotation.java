package test.bean;

import SpringBean2.beanAnnotation.BeanAnnotation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.UnitTestBase;

/**
 * Created by zhanghe on 2017/3/7.
 * 4.1 Bean的定义及作用域的注解实现
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase{
    public TestBeanAnnotation(){
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void testSay(){
        BeanAnnotation bean = super.getBean("beanAnnotation");
        bean.say(" This is test");
    }
    /**
     * 输出BeanAnnotation This is test。
     * 这是因为虽然没有设置bean的名称，但是这个beanAnnotation与类名的唯一区别就是首字母大小写，所以能识别
     * 如果在类BeanAnnotation中的标签设置了bean id，那么这里就一定要使用设置的那个bean id
     */

    @Test
    public void testScope(){
        BeanAnnotation bean = super.getBean("beanAnnotation");
        bean.myHashcode();

        bean = super.getBean("beanAnnotation");
        bean.myHashcode();
    }
    /**
     * Scope设置为prototype的输出结果：
     * BeanAnnotation:2011482127
     * BeanAnnotation:905735620
     * Scope为默认值时的输出结果：
     * BeanAnnotation:2011482127
     * BeanAnnotation:2011482127
     */
}
