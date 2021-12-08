package ProductCompanies;

import java.util.*;

public class SumTriplet {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        if(nums.length == 0) return new ArrayList<>(set);
        Arrays.sort(nums);
        for(int i=0; i< nums.length-2; i++){
            int j = i+1;     //j starts at i+1
            int k= nums.length-1;  //k starts at the end
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0)
                    set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                else if(sum > 0)
                    k--;
                else if(sum <0)
                    j++;
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
}
