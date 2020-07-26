package learnTest.Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-03-08 17:26
 **/

public class 比较类中属性排序 {
    public static void main(String[] args) {
        List<Student> students = null;
        for (Student s:students) {
            System.out.println(s.getAge());
        }

        Student s1 = new Student(1,"a");
        Student s2 = new Student(2,"b");
        Student s3 = new Student(3,"c");
        Student s4 = new Student(4,"d");

        students.add(s4);
        students.add(s3);
        students.add(s2);
        students.add(s1);

        students.stream().forEach(t->{
            System.out.println(t.getAge());
        });

        Collections.sort(students, Comparator.comparing(Student::getAge));

        students.stream().forEach(t->{
            System.out.println(t.getAge());
        });


    }
}
