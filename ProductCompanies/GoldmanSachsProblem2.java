package ProductCompanies;

import java.util.Stack;

public class GoldmanSachsProblem2 {

    public static String decode(String seq)
    {
        if (seq == null || seq.length() == 0) {
            return seq;
        }
        // `result` store the output string
        StringBuilder result = new StringBuilder();
        // create an empty stack of integers
        Stack<Integer> stack = new Stack<>();
        // run `n+1` times, where `n` is the length of the input sequence
        for (int i = 0; i <= seq.length(); i++)
        {
            // push number `i+1` into the stack
            stack.push(i + 1);
            // if all characters of the input sequence are processed, or
            // the current character is 'I' (increasing)
            if (i == seq.length() || seq.charAt(i) == 'N')
            {
                // run till stack is empty
                while (!stack.empty())
                {
                    // remove a top element from the stack and add it to the solution
                    result.append(stack.pop());
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String seq = "MNM";

        System.out.println("The minimum number is " + decode(seq));

    }
}
