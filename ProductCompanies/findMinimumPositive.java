package ProductCompanies;

public class findMinimumPositive {
    public static int findMinMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0 && nums[i] <= n) {
                int index = nums[i] - 1;
                nums[index] = -nums[index];
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n+1;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {-10, -20, 1, 3, 4, -40};

        System.out.println("Minimum missing positive number for nums1: " + findMinMissingPositive(nums1)); // Output: 6
        System.out.println("Minimum missing positive number for nums2: " + findMinMissingPositive(nums2)); // Output: 2
    }
}
