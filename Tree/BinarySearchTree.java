package Tree;

public class BinarySearchTree {
    Node root;
    BinarySearchTree() { root = null; }

    BinarySearchTree(int value) { root = new Node(value); }

    void insertNode(int key){
        root=insertData(root, key);
    }
    Node insertData(Node root, int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key<root.key){
            root.left=insertData(root.left,key);
        }else
            root.right=insertData(root.right, key);
        return root;
    }
    void inorder() {
        inorderTraversal(root);
    }

    void inorderTraversal(Node root){
        if(root!=null){
            inorderTraversal(root.left);
            System.out.print(root.key+"\t");
            inorderTraversal(root.right);
        }
    }
    void preOrder(){
        preOrderTraversal(root);
    }
    void preOrderTraversal(Node root){
        if(root!=null){
            System.out.print(root.key+"\t");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
    void postOrder(){
        postOrderTraversal(root);
    }
    void postOrderTraversal(Node root){
        if(root!=null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.key+"\t");
        }
    }
}
