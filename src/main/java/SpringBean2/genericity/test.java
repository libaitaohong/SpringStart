package SpringBean2.genericity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by zhanghe on 2017/3/12.
 */
@Component
public class test {
    @Autowired
    private StringGen s1;
    //private GenInterface<String> s1;
    //与视频里面spring版本不一样，只有这样写才能运行

    @Autowired
    private IntegerGen s2;
    ////private GenInterface<Integer> s1;

    @Bean(name = "stringGenTest")
    public GenInterface stringGenTest(){
        System.out.println("s1:" + s1.getClass().getName());
        System.out.println("s2:" + s2.getClass().getName());
        return new StringGen();
    }
}
