package learnTest.设计模式.代理模式.动态代理.JDK;

import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-09-29 18:48
 **/

public class TestJDKMain {
    public static void main(String[] args) {

        try {
            //生成与代理类实现相同的接口实现类 JDK动态代理
            SmsJDKService smsJDKService = (SmsJDKService) Proxy.newProxyInstance(SmsJDKServiceImpl.class.getClassLoader(), SmsJDKServiceImpl.class.getInterfaces(), (proxy, method, args1) -> {
                System.out.println("JDK动态代理前置通知");
                Object res = method.invoke(new SmsJDKServiceImpl(), args1);
                System.out.println("JDK动态代理后置通知");
                return res;
            });
            smsJDKService.send("yaoshiyu");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

}
