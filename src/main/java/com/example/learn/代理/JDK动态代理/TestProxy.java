package com.example.learn.代理.JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-09-16 18:00
 **/

public class TestProxy {
    public static void main(String[] args) {
        TargetObject targetObject = new TargetObject("测试参数是否能传入");
        TargetObjectI targetObjectI = (TargetObjectI)Proxy.newProxyInstance(TargetObject.class.getClassLoader(), TargetObject.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("代理前置通知");
                Object res = method.invoke(targetObject,args);
                System.out.println("代理后置通知");
                return res;
            }
        });

        //执行
        targetObjectI.sout();

        targetObjectI.sout2();
    }
}
