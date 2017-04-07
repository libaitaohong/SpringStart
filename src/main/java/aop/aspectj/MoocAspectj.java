package aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by zhanghe on 2017/3/15.
 * 第七章 Spring对AspectJ的支持
 * 切面类
 */
@Component
@Aspect
public class MoocAspectj {

    //执行包aop.aspectj.biz中任何以Biz结尾的类的任何方法时，都会匹配当前切入点
    @Pointcut("execution(* aop.aspectj.biz.*Biz.*(..))")
    public void pointcut(){

    }

    //用的within，这句话的意思是aop.aspectj.biz这个包下的任何类都会匹配到这个切入点
    @Pointcut("within(aop.aspectj.biz.*)")
    public void bizPointcut(){

    }

    //@Before("execution(* aop.aspectj.biz.*Biz.*(..))")
    @Before("pointcut()")  //使用上面切点函数的名称来匹配切入点
    public void before(){
        System.out.println("Before");
    }


    @Before("pointcut() && args(arg)")  //7.3 Advice扩展,advice传入参数
    public void beforeWithParam(String arg){
        System.out.println("beforeWithParam" + arg);
    }

    @Before("pointcut() && @annotation(moocMethod)")  //7.3 Advice扩展,advice传入参数第三种，使用注解的方式
    public void beforeWithAnnotation(MoocMethod moocMethod){
        System.out.println("beforeWithParam" + moocMethod.value());
    }


    @AfterReturning(pointcut = "bizPointcut()", returning = "returnValue")
    public void afterReturning(Object returnValue){
        System.out.println("afterReturning:" + returnValue);
    }

    @AfterThrowing(pointcut = "pointcut()", throwing = "e")
    public void afterThrowing(RuntimeException e){
        System.out.println("afterThrowing:" + e.getMessage());
    }

    @After("pointcut()")
    public void after(){
        System.out.println("After");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("Around 1");
        Object obj = pjp.proceed();
        System.out.println("Around 2");
        System.out.println("Around:" + obj);
        return obj;
    }
}
