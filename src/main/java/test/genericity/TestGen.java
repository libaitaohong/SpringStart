package test.genericity;

import SpringBean2.atScope.Store1;
import SpringBean2.genericity.GenInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.UnitTestBase;

/**
 * Created by zhanghe on 2017/3/9.
 * 4.7 基于Java容器注解说明——@Bean和@Scope
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class TestGen extends UnitTestBase{
    public TestGen(){
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void testGen(){
       /*
        把stringGenTest函数注释了使用下面代码输出与现在的代码输出一样
        s1:SpringBean2.genericity.StringGen
        s2:SpringBean2.genericity.IntegerGen

       GenInterface genInterface = super.getBean("integerGen");
        System.out.println(genInterface.getClass().getName());

        GenInterface genInterface1 = super.getBean("stringGen");
        System.out.println(genInterface1.getClass().getName());*/

        GenInterface genInterface = super.getBean("stringGenTest");
    }
}
