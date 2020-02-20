package watchDemo;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


import java.util.Date;

@Aspect
public class RecordAspect {
    @Pointcut("execution(* watchDemo.Service*.*(..))")
    public void record() {

    }
    @Around("record()")
    public Object recordTimer(ProceedingJoinPoint thisJoinPoint) throws
            Throwable{

            String className = thisJoinPoint.getTarget().getClass().getName();
            String methodName = thisJoinPoint.getSignature().getName();
            long startTime = System.currentTimeMillis();
            Object result = thisJoinPoint.proceed();
            long time = System.currentTimeMillis() - startTime;
            Record record = new Record();
            record.setClassName(className);
            record.setMethodName(methodName);
            record.setExpendTime(time);
            record.setRecordTime(new Date());
            System.out.println(record.toString());
            return result;

    }
}
