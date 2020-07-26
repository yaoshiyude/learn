package com.example.learn.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-11 12:45
 **/

public class TestException {

    public static void main(String[] args) {


        try {
            try {
                List<Student> students = new ArrayList<>();
                Student s1 = new Student();
                s1.setId(1);
                s1.setName("hhhhh");
                Student s2 = new Student();
                s2.setId(1);
                s2.setName("hhhhh");
                students.add(s1);
                students.add(s2);
                students.stream().collect(Collectors.toMap(Student::getId,Student::getName));
                throw new IOException();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println("djdjjdjdj");
        }


        System.out.println("哈哈哈哈哈");
    }
}
