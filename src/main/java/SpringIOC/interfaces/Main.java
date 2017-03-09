package SpringIOC.interfaces;

/**
 * Created by zhanghe on 2017/3/4.
 * Spring入门篇：第二章 Spring IOC容器：2.1 IOC及Bean的容器。
 * 例子1：面向接口编程的例子。
 * 接口使用的测试类
 * 输出：Word from interface"OneInterface":hi
 */
public class Main {
    public static void main(String[] args) {
        OneInterface oif = new OneInterfaceImpl();
        System.out.println(oif.hello("hi"));
    }
}
