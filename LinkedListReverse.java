package ProductCompanies;

class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data=data;
        next=null;
    }
}


public class LinkedListReverse {
    static Node3 head;
    static Node3 reverseList(Node3 headNode){
        Node3 prev = null;
        Node3 current = headNode;
        Node3 next = null;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev=current;
            current=next;
        }
        headNode = prev;
        return headNode;
    }
    void printList(Node3 node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        LinkedListReverse list = new LinkedListReverse();
        list.head = new Node3(85);
        list.head.next = new Node3(15);
        list.head.next.next = new Node3(4);
        list.head.next.next.next = new Node3(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverseList(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);

    }
}
