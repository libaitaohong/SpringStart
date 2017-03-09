package test.bean;

import SpringBean1.bean.BeanScope;
import SpringIOC.interfaces.OneInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.UnitTestBase;

/**
 * Created by zhanghe on 2017/3/5.
 * 单元测试BeanScope
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase{
    public TestBeanScope(){
        super("classpath*:spring-beanscope.xml");
    }

    //使用scope="singleton"时。单例，指每个Bean中只存在一份
    //同一个textSay里面不同的BeanScope对象输出的hashcode是一样的
    //不同的textSay方法里面的BeanScopr对象输出的hashcode是不一样的
    //这是因为每次执行单元测试@Text之前都要执行@Before，之后都要执行@After，
    // 所以两个方法是从两个Spring的ICO容器中获取的beanScope ，所以两个hashcode是不一样的.

    //使用scope="prototype"时，每次请求创建新的实例，destroy方式不生效
    // 同一个testSay方法里面相同的、不同的BeanScope对象输出的hashcode都是不一样的
    @Test
    public void testSay(){
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

        beanScope = super.getBean("beanScope");
        beanScope.say();
    }

    @Test
    public void testSay1(){
        BeanScope beanScope3 = super.getBean("beanScope");
        beanScope3.say();

        BeanScope beanScope4 = super.getBean("beanScope");
        beanScope4.say();
    }
}
