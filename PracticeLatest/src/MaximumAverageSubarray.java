//Leetcode 643: 643. Maximum Average Subarray
//You are given an integer array nums consisting of n elements, and an integer k.
//Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Example 1:
//
//Input: nums = [1,12,-5,-6,50,3], k = 4
//Output: 12.75000
//Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
//Example 2:
//
//Input: nums = [5], k = 1
//Output: 5.00000
public class MaximumAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        List<Double> results = new ArrayList<Double>();
        int windowStart = 0;
        int windowSum = 0;

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            //add the next element
            windowSum += nums[windowEnd];

            //now check the size
            if (windowEnd >= k - 1) {
                results.add((windowSum / (double) k));

                //subtract the element going out
                windowSum -= nums[windowStart];

                //slide the window forward
                windowStart++;
            }
        }
        return Collections.max(results);
    }

    public static void main(String[] args) {
        int[] sample = new int[]{1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(sample, k));
    }
}