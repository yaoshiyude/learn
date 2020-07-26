package learnTest.动态代理.CGLIB;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-07-07 01:28
 **/

public class LogInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        before();
        Object rest = methodProxy.invokeSuper(o,objects);
        after();
        return rest;
    }

    private void before(){
        System.out.println("CGLIB之前");
    }

    private void after(){
        System.out.println("CGLIB之后");
    }
}
