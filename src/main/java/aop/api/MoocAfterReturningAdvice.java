package aop.api;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by zhanghe on 2017/3/13.
 * 6.1 Spring AOP API的Pointcut、advice概念及应用
 * AfterReturningAdvice
 */
public class MoocAfterReturningAdvice implements AfterReturningAdvice{
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("MoocAfterReturningAdvice:" + method.getName() + "，" +
        target.getClass().getName() + "，" + returnValue);
    }
}
