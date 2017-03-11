package SpringBean2.atbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhanghe on 2017/3/9.
 * 4.5 基于Java容器注解说明——@Bean
 */
@Configuration
public class StoreConfig {
    //没有设置那么，那么bean id就是函数名
    @Bean(name = "store", initMethod = "init", destroyMethod = "destory")
    public Store getStringStore(){
        return new StringStore();
    }
}
