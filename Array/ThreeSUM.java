package Array;

import java.util.*;

public class ThreeSUM {
    private static List<List<Integer>> threeSum(int[] nums){
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            //two pointer approach
            int j=i+1;//next index
            int k=nums.length-1;
            while(j<k) {
                int sum =nums[i]+nums[j]+nums[k];
                if(sum==0) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if(sum>0) {
                    k--;
                } else
                    j++;
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(arr);
        System.out.println(result.toString());
    }
}
