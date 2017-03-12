package test.jsr;

import SpringBean2.jsr.JsrService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.jmx.export.UnableToRegisterMBeanException;
import test.UnitTestBase;

/**
 * Created by zhanghe on 2017/3/12.
 * 4.9 基于Java容器注解说明——Spring对JSP支持的说明
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestJsr extends UnitTestBase{
    public TestJsr(){
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void testSave(){
        JsrService service = getBean("jsrService");
        service.say();
    }
    /**
     * JsrService-init
     * JsrDAO invoked
     * JsrService-destory
     */
}

