package SpringBean2.atImportValue_atValue;

/**
 * Created by zhanghe on 2017/3/9.
 * 4.6 基于Java容器注解说明——@ImportResource和@Value
 */
public class MyDriverManager {

    public MyDriverManager(String url, String userName, String password){
        System.out.println("url:" + url);
        System.out.println("userName:" + userName);
        System.out.println("password:" + password);
    }
}
