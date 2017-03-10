package SpringBean1.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by zhanghe on 2017/3/7.
 * 3.5 Resources
 */
public class MOOCResource implements ApplicationContextAware{
    private ApplicationContext applicationContext ;
    public void setApplicationContext(  ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void resource()throws IOException{
        Resource resource = applicationContext.getResource("classpath:config.txt");
        /**路径还可以写为：
         * file:C:\\Users\\zhanghe\\IdeaProjects\\SpringStart\\src\\main\\resources\\config.txt
         * url:http://www.baidu.com
         * config.txt  没有前缀
         * 没有前缀的时候，这时候getResource就是依赖于applicationContext的创建方式，
         * 我们这里的applicationContext是通过单元测试类super方法传入的，也就是用classpath的方式来加载
         */

        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
}
