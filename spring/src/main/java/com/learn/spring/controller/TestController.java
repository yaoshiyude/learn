package com.learn.spring.controller;

import com.learn.spring.dto.req.SoutReqDTO;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-13 21:29
 **/

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    ApplicationContext applicationContext;

    @ResponseBody
    @RequestMapping("/t")
    public String test() {

        TestReflectService testReflectService = null;
        String res = null;
        try {
            testReflectService = applicationContext.getBean("test", TestReflectService.class);
            Method method = testReflectService.getClass().getMethod("test1", String.class);
            res = method.invoke(testReflectService, "reflectTest").toString();


        } catch (BeansException e) {
            System.out.println("根据bean名在spring容器中获取bean异常");
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            System.out.println("反射 根据方法名获取对象方法异常");
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            System.out.println("反射 根据反射获取的方法 invoke异常");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("反射 根据反射获取的方法 invoke异常2");
            e.printStackTrace();
        }

        return res;
    }

    @RequestMapping("/sout")
    @ResponseBody
    public String sout(@RequestBody SoutReqDTO reqDTO) throws InterruptedException {
        System.out.println(reqDTO.getId() + reqDTO.getName() + Thread.currentThread().getName());
        Thread.sleep(3600);
        return "hello word";
    }
}
