package leetCode;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-01-08 11:35
 **/

public class 滑动窗口最大值 {

    Deque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) {
        int nums[] = new int[]{0, 1, 2, 3};
        System.out.println(nums.length);

    }

    /*
     * @Author yaoshiyu
     * @Description  大顶堆实现方式
     * @Date 11:37 2020/1/10
     * @Param [nums, k]
     * @return int[]
     **/
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }
        int n = (nums.length >= k) ? k : nums.length;
        int[] results = new int[nums.length - n + 1];
        int index = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k, Comparator.reverseOrder());

        for (int i = 0; i < nums.length; i++) {

            priorityQueue.offer(nums[i]);

            if (priorityQueue.size() > k) {
                priorityQueue.remove(nums[i - k]);
            }
            if (priorityQueue.size() == k) {
                results[index] = priorityQueue.peek();
                index++;
            }

        }

        return results;
    }

    /*
     * @Author yaoshiyu
     * @Description  双端队列实现方式
     * @Date 11:37 2020/1/10
     * @Param [nums, k]
     * @return int[]
     **/
    public int[] maxSlidingWindow2(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }

        for (int i = 0; i < k; i++) {
            clearDeque(deque,nums,i,k);
            deque.addLast(i);

        }
        int n = (nums.length >= k) ? k : nums.length;
        int[] results = new int[nums.length - n + 1];
        int index = 1;

        results[0] = nums[deque.peekFirst()];
        for (int i = k; i < nums.length; i++) {
            clearDeque(deque,nums,i,k);
            deque.addLast(i);
            results[index] = nums[deque.peekFirst()];
            index++;
        }
        return results;
    }

    private void clearDeque(Deque<Integer> deque, int[] nums, int i, int k) {
        if (!deque.isEmpty() && deque.getFirst() == i - k) {
            deque.removeFirst();
        }

        while (!deque.isEmpty() && nums[deque.getLast()] < nums[i]) {
            deque.removeLast();
        }
    }


}
