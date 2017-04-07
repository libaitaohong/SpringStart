package aop.api;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by zhanghe on 2017/3/13.
 * 6.1 Spring AOP API的Pointcut、advice概念及应用
 * Interception around advice 环绕通知
 */
public class MoocMethodInterceptor implements MethodInterceptor{
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("MoocMethodInterceptor 1:" + invocation.getMethod().getName() + "，" +
        invocation.getStaticPart().getClass().getName());
        Object obj = invocation.proceed();
        System.out.println("MoocMethodInterceptor 2:" + obj);
        return obj;
    }
}
