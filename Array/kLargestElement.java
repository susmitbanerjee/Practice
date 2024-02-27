package Array;

import java.util.PriorityQueue;

public class kLargestElement {
    public static int findKLargest(int[] nums, int k){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int n: nums){
            if(priorityQueue.size()<k){
                priorityQueue.offer(n);
            }else if(n>priorityQueue.peek()){
                priorityQueue.poll();
                priorityQueue.offer(n);
            }
        }
        return priorityQueue.peek();
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,5,6,7,8,5};
        System.out.println(findKLargest(arr, 2));
    }
}
