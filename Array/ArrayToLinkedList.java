package Array;

import LinkedList.Node;

public class ArrayToLinkedList {
    public static Node arrayToLinkedList(int[] arr){
        if(arr==null || arr.length==0)
            return null;

        Node temp = new Node(0);
        Node current = temp;
        for(int val: arr){
            current.next = new Node(val);
            current = current.next;
        }
        return temp.next;
    }
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node current = arrayToLinkedList(arr);
        printLinkedList(current);
    }
}
