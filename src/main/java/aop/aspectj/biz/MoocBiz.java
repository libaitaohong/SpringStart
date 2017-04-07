package aop.aspectj.biz;

import aop.aspectj.MoocMethod;
import org.springframework.stereotype.Service;

/**
 * Created by zhanghe on 2017/3/15.
 * 第七章 Spring对AspectJ的支持
 */
@Service
public class MoocBiz {

    @MoocMethod("Mooc BIZ save with MoocMethod")  //7.3 Advice扩展,advice传入参数，使用注解的方式，MoocMethod是自己创建的注解
    public String save(String arg){
        System.out.println("MoocBiz save:" + arg);
        //throw new RuntimeException("save failed");
        return "Save success";
    }
}
