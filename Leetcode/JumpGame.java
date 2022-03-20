package Leetcode;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        int lastGoodIndex=nums.length-1;//traverse from last
        for(int i=nums.length-1;i>=0;i--){
            if(i+nums[i]>=lastGoodIndex){//index plus the element should be greater or equals to mark the jump can be possible
                lastGoodIndex=i;
            }
        }
        return lastGoodIndex==0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,1,4};
        System.out.println(canJump(arr));
    }
}
