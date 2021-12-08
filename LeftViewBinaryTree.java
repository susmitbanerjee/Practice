package ProductCompanies;

class Node1{
    int data;
    Node1 left,right;
    Node1(int data){
        this.data=data;
        left=right=null;
    }

}
public class LeftViewBinaryTree {
    Node1 root;
    static int MAX_LEVEL = 0;
    static void printLeftView(Node1 root, int level){
        if(root==null) return;
        if(MAX_LEVEL<level){
            System.out.println(root.data);
            MAX_LEVEL=level;
        }
        printLeftView(root.left, level+1);
        printLeftView(root.right, level+1);
    }
    static void printRightView(Node1 root, int level){
        if(root==null) return;
        if(MAX_LEVEL>level){
            System.out.println(root.data);
            MAX_LEVEL=level;
        }
        printRightView(root.left,level+1);
        printRightView(root.right,level+1);
    }

    public static void main(String[] args) {
        LeftViewBinaryTree tree = new LeftViewBinaryTree();
        tree.root = new Node1(12);
        tree.root.left = new Node1(10);
        tree.root.right = new Node1(30);
        tree.root.right.left = new Node1(25);
        tree.root.right.right = new Node1(40);
        tree.printLeftView(tree.root,1);
        System.out.println("---------------------");
        tree.printRightView(tree.root,1);
    }
}
