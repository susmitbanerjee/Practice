package Tree;

import java.util.Stack;

public class KthHighestNode {
    private static int count = 0;
    private static  int result = -1;

    public static int kthHighest(Node root, int k) {
        if (root == null)
            return -1;

        reverseInorder(root, k);
        return result;
    }

    private static  void reverseInorder(Node root, int k) {
        if (root == null || count >= k)
            return;

        // Traverse right first
        reverseInorder(root.right, k);

        // Process current node
        count++;
        if (count == k) {
            result = root.key;
            return;
        }

        // Traverse left if not found yet
        reverseInorder(root.left, k);
    }
}

