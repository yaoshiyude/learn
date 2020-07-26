package learnTest.动态代理.JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-07-06 23:11
 **/

public class ProxyClient {

    public static void main(String[] args) {
        ProxyServiceImpl proxyServiceImpl = new ProxyServiceImpl();

        //1、获取类加载器
        ClassLoader classLoader = proxyServiceImpl.getClass().getClassLoader();

        //2、获取实现的接口
        Class [] interfaces = proxyServiceImpl.getClass().getInterfaces();

        //3、创建日志处理器
        InvocationHandler invocationHandler = new LogHandler(proxyServiceImpl);

        //4、调用jdk动态代理类、生成动态代理类

        ProxyService proxyService = (ProxyService) Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);

        proxyService.testProxy();

    }
}
