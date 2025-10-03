package LinkedList;

public class LinkedListUtil {
    public static LinkedList insertAtBegining(LinkedList linkedList, int data) {
        Node new_node = new Node(data);
        new_node.next = null;

        new_node.next = linkedList.head;
        linkedList.head = new_node;

        return linkedList;

    }

    public static LinkedList insertAtEnd(LinkedList linkedList, int data) {
        Node new_node = new Node(data);
        new_node.next = null;
        if (linkedList.head == null) {
            linkedList.head = new Node(data);
            return linkedList;
        }
        Node temp = linkedList.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
        return linkedList;
    }

    public static void deleteNode(LinkedList linkedList, int key) {
        Node temp = linkedList.head;
        Node prev = null;//to hold the previous node
        if (temp != null && temp.data == key) {
            linkedList.head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null)
            return;

        prev.next = temp.next;
    }

    public static int searchNode(LinkedList linkedList, int key) {
        Node temp = linkedList.head;
        int result = 0;
        if (temp == null) {
            result = -1;
        }
        while (temp!=null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) {
            result = -1;
        }else {
            result = temp.data;
        }

        return result;
    }

    public static void makeCircular(LinkedList linkedList){
        Node temp=linkedList.head;
        if(temp==null)
            return;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=linkedList.head;

        Node temp1 = linkedList.head;
        if (linkedList.head != null)
        {
            do
            {
                System.out.print(temp1.data + " ");
                temp1 = temp1.next;
            }
            while (temp != linkedList.head);
        }
    }
    public static LinkedList reverseList(LinkedList linkedList){
        Node prev=null;
        Node current=linkedList.head;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        linkedList.head=prev;
        return linkedList;
    }

    public static void printList(LinkedList list) {
        Node curr_node = list.head;
        while (curr_node != null) {
            System.out.print(curr_node.data + "\t");
            curr_node = curr_node.next;
        }
    }
}
