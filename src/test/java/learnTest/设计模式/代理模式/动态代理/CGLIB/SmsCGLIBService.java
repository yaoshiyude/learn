package learnTest.设计模式.代理模式.动态代理.CGLIB;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-09-29 21:31
 **/

public class SmsCGLIBService {

    public String send(String message) {
        System.out.println("CGLIB动态代理发短信,短信内容为:" + message);
        return message;
    }
}
