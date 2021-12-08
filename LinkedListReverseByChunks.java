package ProductCompanies;

class Node4 {
    int data;
    Node4 next;

    Node4(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedListReverseByChunks {
    static Node4 head;

    Node4 reverseListByChunks(Node4 headNode, int chunk) {
        Node4 prev = null;
        Node4 current = headNode;
        Node4 next = null;
        int count = 0;

        while (count < chunk && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if(next!=null){
            headNode.next = reverseListByChunks(next, chunk);
        }
        return prev;
    }
    void printList(Node4 node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedListReverseByChunks list = new LinkedListReverseByChunks();
        list.head = new Node4(1);
        list.head.next = new Node4(2);
        list.head.next.next = new Node4(3);
        list.head.next.next.next = new Node4(4);
        list.head.next.next.next.next = new Node4(5);
        list.head.next.next.next.next.next = new Node4(6);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverseListByChunks(head, 4);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);

    }
}
