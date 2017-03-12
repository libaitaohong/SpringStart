package test.javabase;

import SpringBean2.atImportValue_atValue.MyDriverManager;
import SpringBean2.atScope.Store1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.UnitTestBase;

/**
 * Created by zhanghe on 2017/3/9.
 * 4.7 基于Java容器注解说明——@Bean和@Scope
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class TestaScope extends UnitTestBase{
    public TestaScope(){
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void testScope(){
        Store1 store1 = super.getBean("store1");
        System.out.println(store1.hashCode());

        Store1 store2 = super.getBean("store1");
        System.out.println(store2.hashCode());
    }

    /**Scope设置为prototype
     * 输出：
     * 1822971466
     * 1354003114
     * 说明scope起作用了
     */

}
