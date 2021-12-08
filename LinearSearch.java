package Searching;

public class LinearSearch {
    public static int linearSearch(int[] arr, int num){
        boolean flag= false;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                flag= true;
                index=i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array= new int[]{12,13,43,45,56,76,78,78,89,125,32,51};
        long start = System.nanoTime();
        int index = linearSearch(array,13);
        long end = System.nanoTime();
        long elapsedTime = end - start;
        if(index==-1){
            System.out.println("item not found");
        }else
            System.out.println("item found at "+index+" position");
        System.out.println("Elapsed Time: "+elapsedTime);
    }
}
