package Sorting;

import java.util.Arrays;

public class Selectionsort {
    public static void Selectionsort(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        int index=0;
        /*while(index<)
            if(min>arr[i]){
                min=arr[i];
            }
        }*/
    }
    public static int minElement(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] array= new int[]{12,13,43,45,56,76,78,89,125,32,51,23,45,78,69,42,61,51,47};
        long start = System.nanoTime();

        long end = System.nanoTime();
        long elapsedTime = end - start;
        System.out.println(Arrays.toString(array));
        System.out.println(elapsedTime);
    }
}
