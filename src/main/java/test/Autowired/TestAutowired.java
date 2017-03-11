package test.Autowired;

import SpringBean1.autowiring.AutoWiringService;
import SpringBean2.Autowired.service.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.UnitTestBase;

/**
 * Created by zhanghe on 2017/3/8.
 * 4.2 Autowired注解说明-1
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutowired extends UnitTestBase{
    public TestAutowired(){
        super("classpath*:spring-autowired.xml");
    }

    @Test
    public void testAutowired(){
        //没有显示的指定bean的名称，这时的bean id是首字母小写

        InjectionService service = super.getBean("injectionServiceImpl");
        service.save("This is autowired");

    }
    /**三种使用@Autowired注入方式的运行结果运行结果：
     * Service接收参数：This is autowired
     * 保存数据：This is autowired:158453976
     */
}
