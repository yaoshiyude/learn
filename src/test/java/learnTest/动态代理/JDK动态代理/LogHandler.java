package learnTest.动态代理.JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-07-06 23:04
 **/

public class LogHandler implements InvocationHandler {

    Object target;

    public LogHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        Object rest = method.invoke(target,args);
        after();
        return rest;
    }

    private void before(){
        System.out.println("这是动态代理处理日志类中的before");
    }

    private void after(){
        System.out.println("这是动态代理处理日志类中的after");
    }
}
