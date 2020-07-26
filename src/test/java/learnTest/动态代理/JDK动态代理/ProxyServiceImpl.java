package learnTest.动态代理.JDK动态代理;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-07-06 23:03
 **/

public class ProxyServiceImpl implements ProxyService {
    @Override
    public void testProxy() {
        System.out.println("这是执行测试jdk动态代理的service");
    }
}
