import java.util.Stack;

public class TargetPractice {
    public static int maxSteal(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return 0;
        if (n == 1)
            return arr[0];
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[n - 1];

    }

    static boolean validParentheses(String s) {
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'))
                return false;
            else {
                if (s.charAt(i) == ')' && stack.peek() == '(')
                    stack.pop();
                else if (s.charAt(i) == '}' && stack.peek() == '{')
                    stack.pop();
                else if (s.charAt(i) == ']' && stack.peek() == '[')
                    stack.pop();
                else
                    stack.add(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

    static int trapRainWater(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int total = 0;

        int max = arr[0];
        for (int i = 0; i < left.length; i++) {
            left[i] = Math.max(arr[i], max);
            max = left[i];
        }
        max = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            right[i] = Math.max(arr[i], max);
            max = right[i];
        }
        for (int i = 0; i < arr.length; i++) {
            total += (Math.min(left[i], right[i])) - arr[i];
        }
        return total;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 21, 4, 7, 17, 35};
        System.out.println(maxSteal(arr));
        String s = "()[}{}";
        System.out.println(validParentheses(s));
        int[] arr1 = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trapRainWater(arr1));
    }
}
