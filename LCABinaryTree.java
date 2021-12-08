package ProductCompanies;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class LCABinaryTree {
    Node root;

    Node findLCA(Node root, int n1, int n2) {
        if (root == null) return null;
        if (root.data == n1 || root.data == n2) {
            return root;
        }
        Node left = findLCA(root.left, n1, n2);
        Node right = findLCA(root.right, n1, n2);
        if (left != null && right != null) return root;
        if (left != null) return left;
        else
            return right;
    }

    public static void main(String[] args) {
        LCABinaryTree tree = new LCABinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("LCA(4, 5): " + tree.findLCA(tree.root, 4, 5).data);
        System.out.println("LCA(4, 5): " + tree.findLCA(tree.root, 4, 5).data);
        System.out.println("LCA(4, 6): " + tree.findLCA(tree.root, 4, 6).data);
        System.out.println("LCA(3, 4): " + tree.findLCA(tree.root, 3, 4).data);
        System.out.println("LCA(2, 4): " + tree.findLCA(tree.root, 2, 4).data);
    }
}
