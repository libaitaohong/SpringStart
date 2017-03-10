package SpringBean1.Aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by zhanghe on 2017/3/6.
 * 3.3 Aware接口
 * ApplicationContextAware测试类
 */
public class MoocApplicationContext implements ApplicationContextAware{
    //（1）在实际的使用中可以这样获取applicationContext
   // private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //（2）给applicationContext赋值
        //this.applicationContext = applicationContext;

        System.out.println("ApplicationContextAware:" + applicationContext.getBean("moocApplicationContext").hashCode());
    }

    /*//(3)在其它方法中使用applicationContext来进行操作
    public void a(){
        this.applicationContext.
    }*/

}
