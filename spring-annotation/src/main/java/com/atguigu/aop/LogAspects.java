package com.atguigu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @author k
 * @create 2021-09-27 19:00
 */

@Aspect
public class LogAspects {

    @Pointcut("execution(public int com.atguigu.aop.MathCalculator.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void logStart(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("@Before" + joinPoint.getSignature().getName() + "运行。。。参数列表是：{" + Arrays.asList(args) + "}");
    }

    @After("pointcut()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "结束。。。@After");
    }

    @AfterReturning(value = "pointcut()", returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result) {
        System.out.println("@AfterReturning" + joinPoint.getSignature().getName() + "正常返回。。。运行结果是：{" + result + "}");
    }

    @AfterThrowing(value = "pointcut()", throwing = "exception")
    public void logException(JoinPoint joinPoint, Exception exception) {
        System.out.println("@AfterThrowing" + joinPoint.getSignature().getName() + "异常。。。异常信息是：{" + exception.getMessage() + "}");
    }
}
