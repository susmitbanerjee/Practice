package Tree;

public class BSTDriver {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insertNode(50);
        tree.insertNode(30);
        tree.insertNode(20);
        tree.insertNode(40);
        tree.insertNode(70);
        tree.insertNode(60);
        tree.insertNode(80);

        tree.inorder();
    }
}
