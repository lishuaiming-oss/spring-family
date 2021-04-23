package com.example.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

/**
 * @programe: spring-family
 * @Description:
 * @Author: li shuai ming
 * @Create: 2021/4/16-16:03
 */
@Aspect
@Component("loggerAdvice")
public class LoggerAdvice {

    /*切面范围*/
    @Pointcut("execution(* com.example.aop.service.impl.*.*(..))")
     public void methodPointcut(){}
    @After("methodPointcut()")
       public void after(){
        System.out.println("注解Aop 切面通知");
    }

   /* *//*定义方法*//*
    public void logger(ProceedingJoinPoint point) throws Throwable {
        *//*System.out.println("当前时间:"+ LocalTime.now());
        point.proceed();
        System.out.println("当前时间:"+ LocalTime.now());*//*
        point.proceed();
        System.out.println("after advice");
    }
    public void after(){
        System.out.println("after advice");
    }*/
}
