package ProductCompanies;

import java.util.HashMap;
import java.util.Map;

class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data=data;
        next= null;
    }
}

public class RemoveDuplicatesFromLinkedList {
    static Node2 removeDuplicateFromLinkedList(Node2 node){
        HashMap<Integer, Integer> hm = new HashMap<>();
        Node2 temp = node;
        Node2 result = null;
        while(temp!=null){
            int count=0;
            if(!hm.containsKey(temp.data)){
                hm.put(temp.data,1);
            }else
                hm.put(temp.data, hm.get(temp.data)+1);
        }
        for(Map.Entry listMap: hm.entrySet()){
            if((int)listMap.getValue() == 1){
                result=new Node2((int)listMap.getKey());
                result=result.next;
            }
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
