import java.util.Stack;

public class MaxSteal {
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

    public static void main(String[] args) {
        int[] arr = new int[]{2, 21, 4, 7, 17, 35};
        System.out.println(maxSteal(arr));
        String s = "()[}{}";
        System.out.println(validParentheses(s));
    }
}
