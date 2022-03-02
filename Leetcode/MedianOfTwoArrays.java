package Leetcode;

public class MedianOfTwoArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int n1=nums1.length;
        int n2=nums2.length;
        int[] arr = new int[nums1.length+nums2.length];
        while(i<n1&&j<n2){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
            }else{
                arr[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=nums2[j];
            j++;
            k++;
        }
        if(arr.length%2!=0){
            return arr[arr.length/2];
        }else
            return (double)(arr[arr.length/2]+arr[(arr.length/2)-1])/2;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,3};
        int[] arr2 = new int[]{2,4};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
}
