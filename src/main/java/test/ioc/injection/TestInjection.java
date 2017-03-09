package test.ioc.injection;

/**
 * Created by zhanghe on 2017/3/4.
 * 单元测试
 */
import SpringIOC.injection.service.InjectionService;
import SpringIOC.interfaces.OneInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {
    //构造器调用super传入xml文件的位置
    public TestInjection(){
        super("classpath*:spring-config.xml");
    }

    @Test
    public void testHello(){
        //getBean里面的参数是我们配置的bean id
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save("adf");

    }

}
