package SpringBean1.autowiring;

/**
 * Created by zhanghe on 2017/3/7.
 * 3.4 Bean自动装配
 */
/*正常应该在autoWiringService bean中设置property来对DAO进行注入，
    但是这里使用了自动装配default-autowire="byName"，这时就不需要再手动设置注入，
    只要在引用类中设置被引用类的set方法和属性，被引用类中不用做任何操作
* */
/**在xml文件中，由于设置了default-autowire="byName"，
 * 所以会在IOC容器中寻找与autoWiringDAO完全一致的Bean的id
 * 然后把找到的这个autoWiringDAO对应的实例，赋值给这里( private AutoWiringDAO autoWiringDAO)声明的这个对象。
 */
//当default-autowire="byType"时，是与类型相匹配，与bean id是什么没有关系

public class AutoWiringService {
    //属性
    private AutoWiringDAO autoWiringDAO;
    //当使用default-autowire="constructor"时，需要写构造函数。
    //这种方法是IOC容器查找构造函数传入的类型，并在IOC容器中找是不是有相应类型的bean的实例
    //由于是根据类型，所以跟bean id没有什么关系
    public AutoWiringService(AutoWiringDAO autoWiringDAO){
        System.out.println("AutoWiringService");
        this.autoWiringDAO = autoWiringDAO;
    }
    //set方法
    public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
        this.autoWiringDAO = autoWiringDAO;
    }

    public void say(String word){
        this.autoWiringDAO.say(word);
    }
}
