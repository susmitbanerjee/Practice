package Array;

import java.util.Arrays;

public class NegativeElementsToLeft {
    static void negativeElementsShift(int[] arr, int n){
        int[] result = new int[n];
        int resultIndex=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                result[resultIndex]=arr[i];
                resultIndex++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                result[resultIndex]=arr[i];
                resultIndex++;
            }
        }
        System.arraycopy(result, 0, arr, 0, n);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, -1, 3, 2, -7, -5, 11, 6 } ;
        negativeElementsShift(arr, arr.length);
    }
}
