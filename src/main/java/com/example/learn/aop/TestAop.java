package com.example.learn.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2019-12-29 11:04
 **/

@Component
@Aspect
public class TestAop {

    @Pointcut("execution(* com.example..TestAopServiceImpl.*(..))")
    public void pointcut(){}

    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void pointcut2(){}

    @Before("pointcut()")
    public void befor(){
        System.out.println("前置通知");
    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint joinPoint){

        System.out.println("这是环绕通知中的前置通知");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            System.out.println("这是环绕通知中的异常通知");
            throwable.printStackTrace();
        }
        System.out.println("这是环绕通知中的后置通知");
    }

    @Around("pointcut2()")
    public Object aroundAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("这是环绕通知annotation方式中的前置通知");
        return joinPoint.proceed();
    }

}
