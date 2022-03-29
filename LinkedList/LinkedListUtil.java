package LinkedList;

public class LinkedListUtil {
    public static LinkedList insertAtBegining(LinkedList linkedList, int data){
        Node new_node=new Node(data);
        new_node.next=null;

        new_node.next=linkedList.head;
        linkedList.head=new_node;

        return linkedList;

    }
    public static LinkedList insertAtEnd(LinkedList linkedList, int data){
        Node new_node=new Node(data);
        new_node.next=null;
        if(linkedList.head==null){
            linkedList.head=new Node(data);
            return linkedList;
        }
         Node temp = linkedList.head;
         while(temp.next!=null){
             temp=temp.next;
         }
         temp.next=new_node;
         return linkedList;
    }
    public static void printList(LinkedList list){
        Node curr_node=list.head;
        while(curr_node!=null){
            System.out.println(curr_node.data);
            curr_node=curr_node.next;
        }
    }
}
