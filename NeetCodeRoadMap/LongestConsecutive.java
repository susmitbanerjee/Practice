package NeetCodeRoadMap;

import java.util.Arrays;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        int count=0;
        int maxCount=0;

        for(int i = 0;i<nums.length-1;i++){
            if (nums[i + 1] == nums[i] + 1) {
                count++;
            }else if(nums[i+1]==nums[i]){
                count +=0;
            }else
                count=0;
            if(count>maxCount){
                maxCount = count;
            }
        }
        return maxCount+1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,0,1};
        System.out.println(longestConsecutive(arr));
    }
}
