package SpringBean2.Autowired.DAO;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by zhanghe on 2017/3/4.
 * 4.2 Autowired注解说明-1
 */
@Repository
public class InjectionDAOImpl implements InjectionDAO {

    //模拟数据库进行保存操作
    public void save(String arg) {
        System.out.println("保存数据：" + arg);
    }
}
