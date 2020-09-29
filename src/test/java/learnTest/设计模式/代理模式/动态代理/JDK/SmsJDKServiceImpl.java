package learnTest.设计模式.代理模式.动态代理.JDK;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-09-29 18:45
 **/

public class SmsJDKServiceImpl implements SmsJDKService {
    @Override
    public String send(String message) {
        System.out.println("JDK动态代理发短信，短信内容为："+message);
        return message;
    }
}
