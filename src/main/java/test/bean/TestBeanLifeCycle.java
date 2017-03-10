package test.bean;

import SpringBean1.bean.BeanLifeCycle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.UnitTestBase;

/**
 * Created by zhanghe on 2017/3/6.
 * 3.2 Bean的生命周期
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanLifeCycle extends UnitTestBase{
    public TestBeanLifeCycle(){
        super("classpath*:spring-lifecycle.xml");
    }

    @Test
    //配置init-method初始化bean，配置destroy-method销毁bean
    public void test1(){
        super.getBean("beanLifeCycle");
    }
    /*
    * 输出结果：
    * 信息: Loading XML bean definitions from URL [file:/C:/Users/zhanghe/IdeaProjects/SpringStart/target/classes/spring-lifecycle.xml]
    * Bean start.
    * 信息: Closing org.springframework.context.support.ClassPathXmlApplicationContext@6fdb1f78: startup date [Mon Mar 06 10:20:50 CST 2017]; root of context hierarchy
    * Bean stop.
    * 这是因为调用@Test之前要调用@Before，在这个方法里面会启动IOC容器，
    * @Test之后调用@After，我们在这个方法里面调用了IOC容器的destroy方法。
    * 在配置文件中还设置了初始化和销毁时需要调用的方法start和stop，所以会输出Bean start.和Bean stop.
    * */

    @Test
    //这是继承接口实现bean的初始化和销毁
    /**
     * Bean afterPropertiesSet.
     * 三月 06, 2017 10:51:40 上午 org.springframework.context.support.ClassPathXmlApplicationContext doClose
     * 信息: Closing org.springframework.context.support.ClassPathXmlApplicationContext@5479e3f: startup date [Mon Mar 06 10:51:40 CST 2017]; root of context hierarchy
     * Bean destroy.
     */
    public void test2(){
        super.getBean("beanLifeCycle1");
    }

    @Test
    //这是使用默认的bean的初始化和销毁
    /*
    * 信息: Loading XML bean definitions from URL [file:/C:/Users/zhanghe/IdeaProjects/SpringStart/target/classes/spring-lifecycle.xml]
    * Bean defaultInit.
    * 三月 06, 2017 10:49:31 上午 org.springframework.context.support.ClassPathXmlApplicationContext doClose
    * 信息: Closing org.springframework.context.support.ClassPathXmlApplicationContext@6fdb1f78: startup date [Mon Mar 06 10:49:30 CST 2017]; root of context hierarchy
    * Bean defaultDestroy.
    **/
    public void test3(){
        super.getBean("beanLifeCycle");
    }
    /**
     * 最后，如果同时使用这三种方法，那么实现接口方法要早于配置xml文件方法
     * 如果实现接口与配置xml文件两种方法有一种，那么默认的初始化和销毁方法将不会执行
     * 并且如果只有默认的方法，并且在类里面没有实现默认的初始化与销毁方法，在测试时并不会报错
     * 依旧正确的初始化并且销毁了bean。
     */

}
