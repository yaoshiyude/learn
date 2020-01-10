package leetCode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-01-08 11:35
 **/

public class 滑动窗口最大值 {

    public static void main(String[] args) {
        int nums[] = new int[]{0,1,2,3};
        System.out.println(nums.length);
       
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k == 0){
            return new int[0];
        }
        int n = (nums.length>=k)?k:nums.length;
        int []results = new int[nums.length-n+1];
        int index = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k, Comparator.reverseOrder());

        for(int i = 0;i<nums.length;i++){

            priorityQueue.offer(nums[i]);

            if(priorityQueue.size() > k){
                priorityQueue.remove(nums[i-k]);
            }
            if(priorityQueue.size() == k){
                results[index] = priorityQueue.peek();
                index++;
            }

        }

        return results;
    }

}
