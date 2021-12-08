package Searching;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr,int start, int end, int num){
        while(start<=end){
            int mid= (start+end)/2;
            if(arr[mid]==num) return mid;
            else if(arr[mid]>num) end= mid-1;
            else start = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array= new int[]{12,13,43,45,56,76,78,89,125,32,51,127};
        Arrays.sort(array);
        long start = System.nanoTime();
        int index= binarySearch(array,0,array.length-1,127);
        long end = System.nanoTime();
        long elapsedTime = end - start;
        if(index==-1){
            System.out.println("item not found");
        }else
            System.out.println("item found at "+index+" position");
        System.out.println("Elapsed Time: "+elapsedTime);
    }
}

