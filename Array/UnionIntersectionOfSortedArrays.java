package Array;

import java.util.Arrays;

public class UnionIntersectionOfSortedArrays {
    public static void doUnion(int a[], int n, int b[], int m)
    {
        int[] result =new int[n+m];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(a[i]<b[j]){
                result[k]=a[i];
                i++;
                k++;
            }else{
                result[k]=b[j];
                j++;
                k++;
            }

        }
        while(i<n){
            result[k]=a[i];
            i++;
            k++;
        }
        while(j<m){
            result[k]=b[j];
            j++;
            k++;
        }
       for(int l=0;l<result.length;l++){
           System.out.println(result[l]);
       }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{1,2,3};
        doUnion(a,a.length,b,b.length);
    }
}
