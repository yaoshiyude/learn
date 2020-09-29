package com.example.learn.代理.CGLIB;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-09-29 15:01
 **/

public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("前置通知");

        Object object = methodProxy.invokeSuper(o,objects);

        System.out.println("后置通知");
        return object;
    }
}
