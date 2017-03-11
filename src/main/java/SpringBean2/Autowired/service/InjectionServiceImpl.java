package SpringBean2.Autowired.service;

import SpringBean2.Autowired.DAO.InjectionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by zhanghe on 2017/3/8.
 * 4.2 Autowired注解说明-1
 * 使用3种@Autowired注解的方式注入bean
 */

@Service
public class InjectionServiceImpl implements InjectionService {
    //1. @Autowired注解成员变量
    @Autowired
    private InjectionDAO injectionDAO;

    //2. 为dao生成set方法，使用@Autowired注解set方法
    //@Autowired
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    //3. 使用@Autowired注解构造方法
    //@Autowired
    public InjectionServiceImpl(InjectionDAO injectionDAO){
        this.injectionDAO = injectionDAO;
    }

    public void save(String arg) {
        //模拟业务操作
        System.out.println("Service接收参数：" + arg);
        arg = arg + ":" + this.hashCode();
        injectionDAO.save(arg);
    }
}
