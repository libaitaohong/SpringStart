package SpringBean1.bean;

/**
 * Created by zhanghe on 2017/3/4.
 * 测试bean的作用域
 */
public class BeanScope {
    public void say(){
        System.out.println("BeanScope say:" + this.hashCode()); //使用hashcode来确定是不是同一个实例
    }
}
