package Array;

import java.util.Arrays;

public class TwoSUM {
    private static int[] twoSum(int[] nums, int target) {
        if(nums.length==0) return new int[]{};
        int[] result = new int[2];
        int resultIndex=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,3}, 6)));
    }
}
