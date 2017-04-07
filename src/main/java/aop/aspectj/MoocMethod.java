package aop.aspectj;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zhanghe on 2017/3/15.
 * 7.3 Advice扩展，advice传入参数第三种，使用注解的方式
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MoocMethod {
    String value();
}
