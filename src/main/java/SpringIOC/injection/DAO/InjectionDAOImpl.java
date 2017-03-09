package SpringIOC.injection.DAO;

/**
 * Created by zhanghe on 2017/3/4.
 * DAO就是data access Object，与数据库有关的访问
 */
public class InjectionDAOImpl implements InjectionDAO {

    //模拟数据库进行保存操作
    public void save(String arg) {
        System.out.println("保存数据：" + arg);
    }
}
