package SpringBean2.jsr;

import javafx.beans.NamedArg;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by zhanghe on 2017/3/12.
 * 4.9 基于Java容器注解说明——Spring对JSP支持的说明
 */

/*1. @Resource，@PostConstruct，@PreDestroy
@Service
public class JsrService {
   //两种方式来给DAO赋值，对象注解Resource和set方法注解resource，无论哪一种方法都能把DAO的实例注入到jsrDAO中来
    @Resource
    private JsrDAO jsrDAO;

    //@Resource
    public void setJsrDAO(JsrDAO jsrDAO) {
        this.jsrDAO = jsrDAO;
    }
    //初始化bean
    @PostConstruct
    public void init(){
        System.out.println("JsrService-init");

    }
    //销毁bean
    @PreDestroy
    public void destory(){
        System.out.println("JsrService-destory");
    }

    public void say(){
        jsrDAO.sava();
    }
}*/
//2. @Inject， @Named
@Named
public class JsrService {
    //两种方式配置，一种是在对象上，一种是在set函数里。。
    //在set函数里还可以直接配置named名字，这是因为如果有多个相同类型的bean，那么可以使用named属性来确定是哪一个。
    //@Inject
    private JsrDAO jsrDAO;

    @Inject
    public void setJsrDAO(@Named("jsrDAO") JsrDAO jsrDAO) {
        this.jsrDAO = jsrDAO;
    }
    //初始化bean
    @PostConstruct
    public void init(){
        System.out.println("JsrService-init");

    }
    //销毁bean
    @PreDestroy
    public void destory(){
        System.out.println("JsrService-destory");
    }

    public void say(){
        jsrDAO.sava();
    }
}