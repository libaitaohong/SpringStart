package test.aware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.UnitTestBase;

/**
 * Created by zhanghe on 2017/3/6.
 * 3.3 Aware接口测试类
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware extends UnitTestBase {
    public TestAware(){
        super("classpath*:spring-aware.xml");
    }
    @Test
    //获取ApplicationContext
    public void testMoocApplicationContext(){
        System.out.println("testMoocApplicationContext:" + super.getBean("moocApplicationContext").hashCode());
    }
    /**输出结果：
     * ApplicationContextAware:1022308509
     * testMoocApplicationContext:1022308509
     * 结果说明使用ApplicationContextAware接口获得的ApplicationContext，与我们使用getBean方法得到的是一个。
     */
    @Test
    public void testMoocBeanName(){
        System.out.println("testMoocBeanName:" + super.getBean("moocBeanName"));
    }
    /**输出结果：
     * setBeanName:moocBeanName
     * applicationContext:SpringBean1.Aware.MoocBeanName@50b494a6
     * testMoocBeanName:SpringBean1.Aware.MoocBeanName@50b494a6
     *
     */
}
