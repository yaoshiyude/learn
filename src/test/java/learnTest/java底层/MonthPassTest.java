package learnTest.java底层;

import learnTest.多线程.ReentrantLockTest;

import java.io.Serializable;
import java.lang.reflect.Proxy;
import java.math.BigInteger;
import java.util.*;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2019-12-16 14:48
 **/

public class MonthPassTest extends ReentrantLockTest implements Serializable, Runnable {

    public static void main(String[] args) {
//        ItemDTO itemDTO = new ItemDTO();
//        System.out.println(itemDTO.getNum());
//        itemDTO.setNum(1);
//
//        ItemDTO itemDTO1 = itemDTO;
//        itemDTO1.setNum(2);
//
//        System.out.println(itemDTO.getNum());
//        System.out.println(itemDTO1.getNum());
//        MonthPassTest monthPassTest = new MonthPassTest();
//        monthPassTest.testMonthPass(itemDTO);
//        System.out.println(itemDTO.getNum());
        BigInteger bigInteger = new BigInteger("124345");
        BigInteger bigInteger1 = new BigInteger("124345");
        System.out.println(bigInteger.equals(bigInteger1));
        MonthPassTest monthPassTest = new MonthPassTest();
        System.out.println(monthPassTest.getClass().getClassLoader());
        Class[] interfaces = monthPassTest.getClass().getInterfaces();
        System.out.println(interfaces.length);
        for (int i = 0; i < interfaces.length; i++) {
            System.out.println(interfaces[i]);
        }

    }

    public void testMonthPass(ItemDTO itemDTO) {

        /*itemDTO = new ItemDTO();*/
        itemDTO.setNum(2);
        System.out.println(itemDTO.getNum());
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> wordCache = new HashSet<>();
        wordCache.addAll(wordList);

        if (!wordCache.contains(endWord)) {
            return 0;
        }
        char[] az = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new ArrayDeque<>();
        queue.add(beginWord);
        visited.add(beginWord);
        int res = 1;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String temStr = queue.poll();
                if (temStr.equals(endWord)) {
                    return res;
                }

                for (int j = 0; j < temStr.length(); j++) {
                    char[] temArray = temStr.toCharArray();
                    for (char c : az) {
                        temArray[j] = c;
                        String key = String.valueOf(temArray);
                        if (wordCache.contains(key) && !visited.contains(key)) {
                            queue.add(key);
                            visited.add(key);
                        }
                    }
                }
            }
            res++;
        }
        return 0;
    }

    @Override
    public void run() {

    }
}
