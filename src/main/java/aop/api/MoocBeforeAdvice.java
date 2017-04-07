package aop.api;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by zhanghe on 2017/3/13.
 * 6.1 Spring AOP API的Pointcut、advice概念及应用
 * before advice,前置通知
 */
public class MoocBeforeAdvice implements MethodBeforeAdvice{
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("MoocBeforeAdvice:" + method.getName() + "，" + target.getClass().getName());
    }
}
