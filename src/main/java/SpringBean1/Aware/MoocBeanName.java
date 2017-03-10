package SpringBean1.Aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by zhanghe on 2017/3/6.
 * 3.3 Aware接口
 * BeanName Aware
 */
public class MoocBeanName implements BeanNameAware, ApplicationContextAware{

    private String beanName;

    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("setBeanName:" + name);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext:" + applicationContext.getBean(this.beanName));
    }
}
