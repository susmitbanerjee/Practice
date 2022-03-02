package Sorting;

import java.util.Arrays;

public class Bubblesort {
    public static void Bubblesort(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array= new int[]{12,13,43,45,56,76,78,89,125,32,51,23,45,78,69,42,61,51,47};
        long start = System.nanoTime();
        Bubblesort(array, array.length);
        long end = System.nanoTime();
        long elapsedTime = end - start;
        System.out.println(Arrays.toString(array));
        System.out.println(elapsedTime);
    }
}
