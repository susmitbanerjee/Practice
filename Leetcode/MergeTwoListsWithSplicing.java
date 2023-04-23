package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoListsWithSplicing {
    public static ArrayList reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        ArrayList<Integer> toBeReveresed = new ArrayList<Integer>();
        ArrayList<Integer> toBeIntact = new ArrayList<Integer>();
        for(int i=0; i<=m; i++){
            toBeIntact.add(arr.get(i));
        }
        for(int i=m+1; i<arr.size(); i++){
            toBeReveresed.add(arr.get(i));
        }
        reverse(toBeReveresed);
        arr.clear();
        for(int i=0; i<toBeIntact.size(); i++){
            arr.add(toBeIntact.get(i));
        }
        for(int i=0; i<toBeReveresed.size(); i++){
            arr.add(toBeReveresed.get(i));
        }
        return arr;
    }
    static void reverse(ArrayList<Integer> list){
        Integer [] reverse = new Integer[list.size()];
        int j=0;
        for (int i=list.size()-1; i>=0; i--){
            reverse[j]= list.get(i);
            j++;
        }
        list.clear();
        for(int i=0;i<reverse.length;i++){
            list.add(reverse[i]);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(reverseArray(list, 3));
    }

}
