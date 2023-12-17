package Array;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> setCheck = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            setCheck.add(nums[i]);
        }
        return setCheck.size() != nums.length;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
}
