package com.library.librarymanagement.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.library.librarymanagement.service.*.*(..))")
    public void BeforeService()
    {
        System.out.println("Before service");
    }

    @Around("execution(* com.library.librarymanagement.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {



        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed(); // execute the method
        long timeTaken = System.currentTimeMillis() - start;
        System.out.println("Execution of " + joinPoint.getSignature() + " took " + timeTaken + " ms");
        return proceed;
    }

    @After("execution(* com.library.librarymanagement.service.*.*(..))")
    public void AfterService()
    {
        System.out.println("After Service");
    }
}
