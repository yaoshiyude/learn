package learnTest.设计模式.代理模式.静态代理;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-09-29 18:39
 **/

public class ProxyTest {
    public static void main(String[] args) {
        SmsService smsService = new ProxySmsService(new SmsServiceImpl());
        smsService.send("yaoshiyu");
    }
}
