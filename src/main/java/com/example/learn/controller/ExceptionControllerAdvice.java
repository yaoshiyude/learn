package com.example.learn.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2019-12-30 11:47
 **/

//@ControllerAdvice
public class ExceptionControllerAdvice {

    //@ExceptionHandler
    public String testControllerAdvice(){

        return "error/exception";
    }
}
