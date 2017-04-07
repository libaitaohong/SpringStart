package aop.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by zhanghe on 2017/3/12.
 * 5.2 配置切面aspect
 * MoocAspect类为切面类
 */
public class MoocAspect {
    public void before(){
        System.out.println("MoocAspect before");
    }

    public void afterReturning(){
        System.out.println("MoocAspect afterReturning");
    }

    public void afterThrowing(){
        System.out.println("MoocAspect afterThrowing");
    }

    public void after(){
        System.out.println("MoocAspect after");
    }

    public Object around(ProceedingJoinPoint pjp){
        Object obj = null;
        try {
            System.out.println("MoocAspect around1");
            obj = pjp.proceed();
            System.out.println("MoocAspect around2");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return obj;
    }

    //Advice parameters
    public Object aroundInit(ProceedingJoinPoint pjp, String bizName, int times){
        System.out.println("aroundInit:" + bizName + " " + times);
        Object obj = null;
        try {
            System.out.println("MoocAspect around1");
            obj =  pjp.proceed();
            System.out.println("MoocAspect around2");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return obj;
    }
}
