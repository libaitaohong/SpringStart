package test.ioc.interfaces;

/**
 * Created by zhanghe on 2017/3/4.
 * 单元测试
 */
import SpringIOC.interfaces.OneInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {
    //构造器调用super传入xml文件的位置
    public TestOneInterface(){
        super("classpath*:spring-config.xml");
    }

    @Test
    public void testHello(){
        //getBean里面的参数是我们配置的bean id
        OneInterface oneInterface = super.getBean("oneInterface");
        System.out.println(oneInterface.hello("我的输入参数"));
    }

}
