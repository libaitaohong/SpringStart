package SpringIOC.injection.service;

import SpringIOC.injection.DAO.InjectionDAO;

/**
 * Created by zhanghe on 2017/3/4.
 * servic就是我们处理业务逻辑的部分。在service中对业务逻辑进行处理，调用DAO把数据保存到数据库
 *
 */
public class InjectionServiceImpl implements InjectionService{
    private InjectionDAO injectionDAO;
     //构造器注入
    public InjectionServiceImpl(InjectionDAO injectionDAO){
        this.injectionDAO = injectionDAO;
    }
    //设值注入
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }


    public void save(String arg) {
        //模拟业务操作
        System.out.println("Service接收参数：" + arg);
        arg = arg + ":" + this.hashCode();
        injectionDAO.save(arg);
    }
}
