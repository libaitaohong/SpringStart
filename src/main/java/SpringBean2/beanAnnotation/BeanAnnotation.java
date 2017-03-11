package SpringBean2.beanAnnotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by zhanghe on 2017/3/7.
 * 4.1 Bean的定义及作用域的注解实现
 */
//@Component("bean") 定义bean id
@Component  //先定义一个通用的注解component
@Scope //设置bean的作用域 默认是singleton
public class BeanAnnotation {
    public void say(String arg){
        System.out.println("BeanAnnotation" + arg);
    }

    public void myHashcode(){
        System.out.println("BeanAnnotation:" + this.hashCode());
    }
}
