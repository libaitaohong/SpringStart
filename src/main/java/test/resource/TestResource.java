package test.resource;

import SpringBean1.resource.MOOCResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.UnitTestBase;

import java.io.IOException;

/**
 * Created by zhanghe on 2017/3/7.
 * 3.5 Resources
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class TestResource extends UnitTestBase{
    public TestResource(){
        super("classpath*:spring-resource.xml");
    }

    @Test
    public void  testResource(){
        MOOCResource resource = super.getBean("MOOCResource");
        try {
            resource.resource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
