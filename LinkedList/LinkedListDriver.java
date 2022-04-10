package LinkedList;

public class LinkedListDriver {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedListUtil.insertAtBegining(linkedList,2);
        LinkedListUtil.insertAtBegining(linkedList,3);
        LinkedListUtil.insertAtBegining(linkedList,4);
        LinkedListUtil.insertAtBegining(linkedList,5);

        LinkedListUtil.insertAtEnd(linkedList,7);
        LinkedListUtil.insertAtEnd(linkedList,8);

        LinkedListUtil.printList(linkedList);
        System.out.println();
        LinkedListUtil.deleteNode(linkedList,7);
        LinkedListUtil.printList(linkedList);
        System.out.println();
        System.out.println(LinkedListUtil.searchNode(linkedList, 7));
        System.out.println(LinkedListUtil.searchNode(linkedList, 8));



    }
}
