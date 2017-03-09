package SpringIOC.interfaces;

/**
 * Created by zhanghe on 2017/3/4.
 * Spring入门篇：第二章 Spring IOC容器：2.1 IOC及Bean的容器。
 * 例子1：面向接口编程的例子。
 * 实现接口OneInterface
 */
public class OneInterfaceImpl implements OneInterface{

    public String hello(String word) {
        return "Word from interface\"OneInterface\":" + word;
    }
}
