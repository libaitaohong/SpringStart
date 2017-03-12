package SpringBean2.atImportValue_atValue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by zhanghe on 2017/3/9.
 * 4.6 基于Java容器注解说明——@ImportResource和@Value
 */
@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig1 {

    @Value("${url}")
    private String url;

    //@Value("${username}")
    @Value("${jdbc.username}")
    private String username;
    @Value("${password}")
    private String password;

    @Bean
    public MyDriverManager myDriverManager(){
        return new MyDriverManager(url, username, password);
    }

}
