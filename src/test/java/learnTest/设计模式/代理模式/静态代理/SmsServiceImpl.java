package learnTest.设计模式.代理模式.静态代理;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-09-29 18:36
 **/

public class SmsServiceImpl implements SmsService{
    @Override
    public String send(String message) {
        System.out.println("发送短信，内容为："+message);
        return message;
    }
}
