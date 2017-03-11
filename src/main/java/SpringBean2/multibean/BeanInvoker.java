package SpringBean2.multibean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;

/**
 * Created by zhanghe on 2017/3/8.
 * 4.3 Autowired注解说明-2、3
 */
@Component
public class BeanInvoker {
    @Autowired
    //这个list里面会被注解进来类的实例，应该是实现类one、two
    private List<BeanInterface> list;
    @Autowired
    //测试@Autowired注解进map的实例
    private Map<String, BeanInterface> map;


    // 4.4 Autowired注解说明-3
  // @Autowired
   //@Qualifier("beanImplOne")  //使用@Qualifier注解来确定beanInterface具体使用哪一个实现类，否则会报错
    private BeanInterface beanInterface;

    public void say(){
        if(null != list && list.size() != 0){
            System.out.println("list...");
            for (BeanInterface bean : list){
                System.out.println(bean.getClass().getName());
            }
        }else {
            System.out.println("List<BeanInterface> list is null!!!");
        }
        System.out.println();

        if(null != map && map.size() != 0){
            System.out.println("map...");
            for (Map.Entry<String,BeanInterface> entry : map.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue().getClass().getName());
            }
        }else {
            System.out.println("Map<String, BeanInterface> map is null!!!");
        }

        System.out.println();
        if(null != beanInterface){
            System.out.println(beanInterface.getClass().getName());
        }else{
            System.out.println("beanInterface is null...");
        }
    }
}
