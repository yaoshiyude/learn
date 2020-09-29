package com.example.learn.代理.CGLIB;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-09-29 15:04
 **/

class ProxyFactory {
    public static Object getProxy(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(clazz.getClassLoader());
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new MyMethodInterceptor());
        return enhancer.create();
    }
}
