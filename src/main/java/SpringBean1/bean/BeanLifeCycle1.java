package SpringBean1.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by zhanghe on 2017/3/6.
 *实现InitializingBean接口，覆盖afterPropertiesSet方法初始化bean
 * 实现DisposableBean接口，覆盖destroy方法销毁bean
 */
public class BeanLifeCycle1 implements InitializingBean,DisposableBean{

    public void destroy() throws Exception {
        System.out.println("Bean destroy.");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean afterPropertiesSet.");
    }
}
