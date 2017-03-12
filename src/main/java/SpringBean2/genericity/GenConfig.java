package SpringBean2.genericity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhanghe on 2017/3/10.
 * 4.8 基于Java容器注解说明——基于泛型的自动装配
 */
@Configuration
public class GenConfig {

    @Autowired
    private StringGen s1;
    //private GenInterface<String> s1;
    //与视频里面spring版本不一样，只有这样写才能运行

    @Autowired
    private IntegerGen s2;
    ////private GenInterface<Integer> s1;

    @Bean
    public StringGen stringGen(){
        return new StringGen();
    }

    @Bean
    public IntegerGen integerGen(){
        return new IntegerGen();
    }

   @Bean(name = "stringGenTest")
    public GenInterface stringGenTest(){
        System.out.println("s1:" + s1.getClass().getName());
        System.out.println("s2:" + s2.getClass().getName());
        return new StringGen();
    }

}
