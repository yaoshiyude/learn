package learnTest.java数据结构;

import java.util.*;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-01-07 15:06
 **/

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("1");
        stringStack.push("2");
        stringStack.push("3");
        stringStack.push("4");
        stringStack.push("5");
        stringStack.push("6");
        System.out.println(stringStack);
        System.out.println(stringStack.pop());
        System.out.println(stringStack.peek());
        System.out.println(stringStack.contains("5"));
        System.out.println(stringStack);
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Deque<Integer> deque = new LinkedList<>();

        String s = "aassdff";
        System.out.println("a".equals(s.charAt(0)));
    }
}
