package demo;

import org.aspectj.lang.ProceedingJoinPoint;


public class XmlAdvice {

    public void before(){
        System.out.println("这是前置通知");
    }

    public void afterReturning(){
        System.out.println("这是后置通知,不出现异常是调用");
    }

    public Object around(ProceedingJoinPoint point) throws
            Throwable{
        System.out.println("这是环绕通知之前的部分");
        Object object = point.proceed();
        System.out.println("这是环绕通知之后的部分");
        return object;
    }

    public void afterException(){
        System.out.println("异常通知");
    }

    public void after(){
        System.out.println("这是后置通知");
    }
}
