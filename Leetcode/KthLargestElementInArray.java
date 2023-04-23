package Leetcode;

import java.util.PriorityQueue;

public class KthLargestElementInArray {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();//by default min heap is implemented for max heap =new PriorityQueue<>(Collections.reverseOrder())
        for(int i: nums){
            minHeap.add(i);
            if(minHeap.size()>k){
                minHeap.remove();
            }
        }
        return minHeap.remove();//
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1,5,6,4};
        System.out.println(findKthLargest(arr,2));
    }
}
