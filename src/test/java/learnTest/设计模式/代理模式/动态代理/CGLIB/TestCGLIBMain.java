package learnTest.设计模式.代理模式.动态代理.CGLIB;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-09-29 21:33
 **/

public class TestCGLIBMain {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SmsCGLIBService.class);
        enhancer.setClassLoader(SmsCGLIBService.class.getClassLoader());
        enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
            System.out.println("CGLIB前置通知");
            Object res = methodProxy.invokeSuper(o, objects);
            System.out.println("CGLIB后置通知");
            return res;
        });
        //生成被代理类的子类 实现CGLIB代理
        SmsCGLIBService smsCGLIBService = (SmsCGLIBService) enhancer.create();
        smsCGLIBService.send("yaoshiyu");
    }
}
