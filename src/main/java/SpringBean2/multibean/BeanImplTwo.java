package SpringBean2.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by zhanghe on 2017/3/8.
 * 4.3 Autowired注解说明-2
 */
@Order(value = 1) // 设置顺序
@Component
public class BeanImplTwo implements BeanInterface{
}
