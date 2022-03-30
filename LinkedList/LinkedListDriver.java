package LinkedList;

public class LinkedListDriver {
    public static void main(String[] args) {
        /*LinkedList linkedList = new LinkedList();
        LinkedListUtil.insertAtBegining(linkedList,2);
        LinkedListUtil.insertAtBegining(linkedList,3);
        LinkedListUtil.insertAtBegining(linkedList,4);
        LinkedListUtil.insertAtBegining(linkedList,5);

        LinkedListUtil.insertAtEnd(linkedList,7);
        LinkedListUtil.insertAtEnd(linkedList,8);

        LinkedListUtil.printList(linkedList);*/


        int[] arr=new int[]{1, 2, -2, -1};
        int i=0,j=arr.length-1;
        while(i<arr.length-1&&j>0){
            int sum=0, lastsum=0;
            sum=arr[i]+arr[i+1];
            lastsum=arr[j]+arr[j-1];
            if(sum==lastsum){
                break;
            }
            if(sum<lastsum){
                i++;
            }else
                j--;

        }
        if(i==0&&j==arr.length-1) {
            System.out.println(arr.length / 2);
        }else if(i==arr.length-2 && j==1){
            System.out.println("-1");
        }else
            System.out.println(i+1);
       /* Thread t=new Thread();
        t.start();
        t.start();*/

    }
}
