package Array;

public class MaxSteal {
    public static int findMaxSteal(int[] arr){
        int n = arr.length;
        if (n == 0) return 0;
        if (n == 1) return arr[0];

        // Create an array to store the maximum stolen value
        int[] dp = new int[n];

        // Base cases
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        // Fill the dp array
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
        }

        // Return the maximum stolen value
        return dp[n - 1];
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5};
        System.out.println(findMaxSteal(arr));

    }
}
