package LinkedList;

public class LinkedList {

    Node head;//head of the linkedlist

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
}
