package SpringBean2.jsr;

import org.springframework.stereotype.Repository;

/**
 * Created by zhanghe on 2017/3/12.
 * 4.9 基于Java容器注解说明——Spring对JSP支持的说明
 */
@Repository
public class JsrDAO {

    public void sava(){
        System.out.println("JsrDAO invoked");
    }
}
