package test.javabase;

import SpringBean2.atbean.Store;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.UnitTestBase;
/**
 * Created by zhanghe on 2017/3/9.
 * 4.5 基于Java容器注解说明——@Bean
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestJavabased extends UnitTestBase{
    public TestJavabased(){
        super("classpath*:spring-beanannotation.xml");
    }
    @Test
    public void test(){
        /**
         * 当@bean没有指定bean id时，bean名称是方法名称
         * 不要忘记在xml文件中配置context:component-scan
         * 输出：
         * SpringBean2.javabase.StringStore
         */
        Store store = super.getBean("store");
        System.out.println(store.getClass().getName());

        /**
         * 设置init与destory方法后的执行结果
         * This is init
         * SpringBean2.javabase.StringStore
         * This is destory
         */
    }
}
