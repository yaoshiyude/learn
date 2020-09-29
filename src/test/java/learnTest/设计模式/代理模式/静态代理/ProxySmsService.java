package learnTest.设计模式.代理模式.静态代理;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-09-29 18:37
 **/

public class ProxySmsService implements SmsService {

    private SmsService smsService;

    public ProxySmsService(SmsService smsService){
        this.smsService = smsService;
    }

    @Override
    public String send(String message) {
        System.out.println("前置增强");
        String res = smsService.send(message);
        System.out.println("后置增强");
        return res;
    }
}
