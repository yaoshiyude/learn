package learnTest.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-15 12:47
 **/

public class List2List {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student student1 = new Student(1,"aa");
        Student student2 = new Student(2,"bb");
        list.add(student1);
        list.add(student2);

        list.forEach(item ->System.out.println(item.getName()));


        List<Integer> list1 = list.stream().map(Student::getAge).collect(Collectors.toList());

        list.forEach(item ->System.out.println(item.getName()));
        list1.forEach(item ->System.out.println(item));


    }
}
