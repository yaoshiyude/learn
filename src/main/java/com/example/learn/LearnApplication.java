package com.example.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnApplication {

	public static void main(String[] args) {
		System.out.println("SpringBoot开始加载");
		SpringApplication.run(LearnApplication.class, args);

		System.out.println("SpringBoot加载完成");
	}

}
