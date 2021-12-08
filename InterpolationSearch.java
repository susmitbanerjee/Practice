package Searching;

import java.util.Arrays;

public class InterpolationSearch {
    public static int interpolationSearch(int[] arr,int start, int end, int num){
        while(start<=end){
            int pos=start + ((num - arr[start]) * (end - start) /
                    (arr[end] - arr[start]));
            if(arr[pos]==num) return pos;
            else if(arr[pos]>num) end= pos-1;
            else start = pos+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array= new int[]{12,13,43,45,56,76,78,89,125,32,51,127};
        Arrays.sort(array);
        long start = System.nanoTime();
        int index= interpolationSearch(array,0,array.length-1,127);
        long end = System.nanoTime();
        long elapsedTime = end - start;
        if(index==-1){
            System.out.println("item not found");
        }else
            System.out.println("item found at "+index+" position");
        System.out.println("Elapsed Time: "+elapsedTime);
    }
}
