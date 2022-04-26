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
    int heightOfTree(){
        return height(root);
    }
    int height(Node root){
        if(root==null){
            return 0;
        }else{
            int lheight=height(root.left);
            int rheight=height(root.right);

            if(lheight>rheight){
                return lheight+1;
            }else
                return rheight+1;
        }
    }
    void printCurrentLevel(Node root, int level){
        if(root==null)
            return;
        if(level==1)
            System.out.print(root.key+"\t");
        else if(level>1){
            printCurrentLevel(root.left,level-1);
            printCurrentLevel(root.right,level-1);
        }
    }
    void levelOrderTraversal(){
        int height=height(root);
        for(int i=0;i<height;i++){
            printCurrentLevel(root,i);
        }
    }
}
