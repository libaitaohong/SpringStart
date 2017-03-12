package SpringBean2.atScope;

import SpringBean2.atbean.Store;

/**
 * Created by zhanghe on 2017/3/10.
 * 4.7 基于Java容器注解说明——@Bean和@Scope
 * 在实现类中定义init()和destory()方法
 */
public class StringStore1 implements Store1{

    public void init(){
        //System.out.println("This is init...");
    }

    public void destory(){
       // System.out.println("This is destory");
    }
}
