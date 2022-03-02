package Array;

public class ArrayReverse {
    static void reverseArray(int[] arr,int start, int end){
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void swap(int[] arr, int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        reverseArray(arr, 0, arr.length-1);
    }
}
