package com.library.librarymanagement.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* com.library.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed(); // execute the method
        long timeTaken = System.currentTimeMillis() - start;
        System.out.println("Execution of " + joinPoint.getSignature() + " took " + timeTaken + " ms");
        return proceed;
    }
}
