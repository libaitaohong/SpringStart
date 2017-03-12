package SpringBean2.atScope;

import org.springframework.context.annotation.*;

/**
 * Created by zhanghe on 2017/3/10.
 * 4.7 基于Java容器注解说明——@Bean和@Scope
 */
@Configuration
public class StoreConfig2 {

    @Bean(name = "store1", initMethod = "init", destroyMethod = "destory")
    @Scope(value="prototype", proxyMode = ScopedProxyMode.NO)
    public Store1 getStringStore(){
        return new StringStore1();
    }

}
