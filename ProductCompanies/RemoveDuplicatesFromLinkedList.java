package ProductCompanies;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data=data;
        this.next=null;
    }
}

public class RemoveDuplicatesFromLinkedList {
    static Node2 removeDuplicateFromLinkedList(Node2 node){
        HashSet<Integer> hm = new HashSet<>();
        Node2 temp = node;
        Node2 result = null;
        while(temp!=null){
            hm.add(temp.data);
            temp=temp.next;
        }
        for(int listMap: hm){
            Node2 newNode = new Node2(listMap);
            //result.data=newNode;
            result.next=newNode;

        }
        return result;
    }

    public static void main(String[] args) {
        Node2 start = new Node2(10);
        start.next = new Node2(12);
        start.next.next = new Node2(11);
        start.next.next.next = new Node2(11);
        start.next.next.next.next = new Node2(12);
        start.next.next.next.next.next = new Node2(11);
        start.next.next.next.next.next.next = new Node2(10);

        Node2 result = removeDuplicateFromLinkedList(start);
        System.out.println("The result is: ");
        while(result!=null){
            System.out.println(result.data);
            result=result.next;
        }
    }

}
