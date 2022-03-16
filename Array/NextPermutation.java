package Array;

import java.util.Arrays;

public class NextPermutation {
    static void swap(int[] arr, int i, int j){
        int c=arr[i];
        arr[i]=arr[j];
        arr[j]=c;
    }
    static void reverse(int[] arr, int start){
        int end = arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void nextPermutation(int[] nums) {
        int i=nums.length-2;
        //traversing from end till the previous element is less than the next element
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=nums.length-1;
            while(j>=0 && nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums, i+1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,5,4,1};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
