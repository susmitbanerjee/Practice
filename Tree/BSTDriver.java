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
        System.out.println();
        System.out.println("---------------------------------------");
        tree.preOrder();
        System.out.println();
        System.out.println("---------------------------------------");
        tree.postOrder();
        System.out.println();
        System.out.println("Height of the tree: ");
        System.out.println(tree.heightOfTree());
        System.out.println();
        System.out.println("---------------------------------------");
        tree.levelOrderTraversal();
    }
}
