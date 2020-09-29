package learnTest.设计模式.代理模式.动态代理.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-09-29 18:48
 **/

public class TestJDKMain {
    public static void main(String[] args) {

        try {
            SmsJDKService smsJDKService = (SmsJDKService)Proxy.newProxyInstance(SmsJDKServiceImpl.class.getClassLoader(), SmsJDKServiceImpl.class.getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("JDK动态代理前置通知");
                    Object res = method.invoke(new SmsJDKServiceImpl(),args);
                    System.out.println("JDK动态代理后置通知");
                    return res;
                }
            });
            smsJDKService.send("yaoshiyu");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
