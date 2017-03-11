package SpringBean2.atbean;

/**
 * Created by zhanghe on 2017/3/9.
 * 4.5 基于Java容器注解说明——@Bean
 * 在实现类中定义init()和destory()方法
 */
public class StringStore implements Store{

    public void init(){
        System.out.println("This is init...");
    }

    public void destory(){
        System.out.println("This is destory");
    }
}
