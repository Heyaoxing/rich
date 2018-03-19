package com.rich.Metrics;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MetricsCounter {

//    @Pointcut("")
//    private void controller(){}

    @Before("execution(* com.rich.services.TestService.method(..))")
    public void before(JoinPoint point){
        System.out.println("拦截前:");
    }
}
