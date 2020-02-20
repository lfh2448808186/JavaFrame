package demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AnnoAdvice {

    @Pointcut("execution( * demo.UserServiceImpl*.*(..))")
    public void pointcut(){

    }

    @Before("pointcut()")
    public void before(){
        System.out.println("这是前置通知");
    }
    @AfterReturning("pointcut()")
    public void afterReturning(){
        System.out.println("这是后置通知,不出现异常是调用");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) throws
            Throwable{
        System.out.println("这是环绕通知之前的部分");
        Object object = point.proceed();
        System.out.println("这是环绕通知之后的部分");
        return object;
    }

    @AfterThrowing("pointcut()")
    public void afterException(){
        System.out.println("异常通知");
    }

    @After("pointcut()")
    public void after(){
        System.out.println("这是后置通知");
    }
}
