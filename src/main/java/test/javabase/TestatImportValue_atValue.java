package test.javabase;

import SpringBean2.atImportValue_atValue.MyDriverManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.UnitTestBase;

/**
 * Created by zhanghe on 2017/3/9.
 * 4.6 基于Java容器注解说明——@ImportResource和@Value
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class TestatImportValue_atValue extends UnitTestBase{
    public TestatImportValue_atValue(){
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void testMyDriverManager(){
        MyDriverManager manager = super.getBean("myDriverManager");
        System.out.println(manager.getClass().getName());
    }
    /**运行结果：
     * url:127.0.0.1
     * userName:zhanghe
     * password:root
     * SpringBean2.atImportValue_atValue.MyDriverManager
     *
     * 这里会发现我们明明配置的用户名是root，为什么变成了我的名字
     * 这是因为在StoreConfig1里面的${username}会获取当前登录的用户名，
     * 把${username}改成${jdbc.username}就可以了。输出结果：
     * url:127.0.0.1
     * userName:root
     * password:root
     * SpringBean2.atImportValue_atValue.MyDriverManager
     *
     * 这里出了一个小bug
     * Annotation-specified bean name 'storeConfig' for bean class [SpringBean2.atImportValue_atValue.StoreConfig]
     * conflicts with existing, non-compatible bean definition of same name and class [SpringBean2.atbean.StoreConfig]
     * 本来atImportValue_atValue包里的StoreConfig1类没有1，与atbean包里面的类名是一样的。
     * 然后因为这两个都使用了@Configuration注解，这两个类都注册成bean，所以这两个bean重名了，
     * 虽然不是在一个包里面，但是是在同一个xml文件spring-beanannotation.xml中配置的context:component-scan，
     * 所以本质上他们是一个IOC容器初始化的bean，所以重名是不可以的，遂把类名改了一下
     *
     * 还有一个就是我在运行testMyDriverManager函数时，atbean里面的初始化和销毁函数执行了，
     * 还是因为IOC容器初始化时把所有的bean都初始化了，所以也会执行atbean里面的初始化和销毁函数
     */
}
