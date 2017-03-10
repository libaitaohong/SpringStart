package SpringBean1.bean;

import java.security.PublicKey;

/**
 * Created by zhanghe on 2017/3/6.
 * 3.2 Bean的生命周期
 * 配置init-method初始化bean，配置destroy-method销毁bean
 */
public class BeanLifeCycle {
    //IOC容器在加载配置文件并初始化bean时会调用这里的start方法，销毁bean时会执行stop方法
    //这是因为在spring-lifecycle.xml文件中配置了两个方法作为初始化和销毁
    public void start(){
        System.out.println("Bean start.");
    }
    public void stop(){
        System.out.println("Bean stop.");
    }

    //使用默认初始的bean加载与销毁方法
    //在spring-lifecycle.xml文件中配置两个默认方法
    public void defaultInit(){
        System.out.println("Bean defaultInit.");
    }
    public void defaultDestroy(){
        System.out.println("Bean defaultDestroy.");
    }

}
