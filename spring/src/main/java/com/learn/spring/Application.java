package com.learn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.out.println("springBoot开始加载");
        SpringApplication.run(Application.class, args);
        System.out.println("springBoot加载结束");
    }

}
