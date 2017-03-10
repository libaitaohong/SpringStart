package test.autowiring;

import SpringBean1.autowiring.AutoWiringDAO;
import SpringBean1.autowiring.AutoWiringService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.UnitTestBase;

/**
 * Created by zhanghe on 2017/3/7.
 * 3.4 Bean自动装配
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutoWiring extends UnitTestBase{
    public TestAutoWiring(){
        super("classpath*:spring-autowiring.xml");
    }

    /**输出：
     * AutoWiringService
     * AutoWiringDAO:this is a test
     * 1. 得到AutoWiringService的实例
     * 2. 调用service.say方法
     * 3. service的say方法传入word:"this is a test"
     * 4. 调用autoWiringDAO.say(word)
     * 5. 输出文字
     */
    @Test
    public void testsay(){
        AutoWiringService service = super.getBean("autoWiringService");
        service.say("this is a test");
    }
}
