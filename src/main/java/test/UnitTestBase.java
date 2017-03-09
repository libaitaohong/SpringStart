package test;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.util.StringUtils;

/**
 * Created by zhanghe on 2017/3/5.
 */
public class UnitTestBase {
    private ClassPathXmlApplicationContext context;
    private String springXmlpath;
    public UnitTestBase(){}
    //通过构造器传入路径
    public UnitTestBase(String springXmlpath){
        this.springXmlpath = springXmlpath;
    }

    @Before
    //@before是@Test这个单元测试执行前要执行的方法
    public void before(){
        //首先执行判断springXml路径
        if (StringUtils.isEmpty(springXmlpath)){
            springXmlpath = "classpath*:spring-*.xml";

        }
        try{
            //加载xml文件，创建文件上下文context，context就是我们说的容器
            context = new ClassPathXmlApplicationContext(springXmlpath.split("[,\\s]+"));
            //当它启动后会去查找spring的文件，并把里面的信息加载到上下文中
            context.start();
        }catch(BeansException e){
            e.printStackTrace();
        }
    }

    @After
    public void after(){
        context.destroy();
    }

    @SuppressWarnings("unchecked")
    //使用context.getBean方法来获取相应的对象
    protected <T extends Object> T getBean(String beanId){
        return (T)context.getBean(beanId);
    }

    protected <T extends Object> T getBean(Class<T> clazz){
        return (T)context.getBean(clazz);
    }


}
