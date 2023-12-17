package ProductCompanies;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumSwapsRequiredToSort {
    public static int minSwaps(int[] arr) {
        boolean[] isVisited = new boolean[arr.length+1];
        HashMap<Integer,Integer> nodeMap = new HashMap<>();
        for(int i=1;i<isVisited.length;i++){
            nodeMap.put(i,arr[i-1]);
        }
        int swapCount=0;
        for(int k=1;k<nodeMap.size();k++){
            int nextNode;
            if(!isVisited[k]){
                isVisited[k]=true;
            }
            if(k==nodeMap.get(k)){
                continue;
            }else{
                int c=nodeMap.get(k);
                while (!isVisited[c]){
                    isVisited[c]=true;
                    nextNode=nodeMap.get(c);
                    c=nextNode;
                    ++swapCount;
                }
            }
        }
        return swapCount;
    }

    public static void main(String[] args) {
        int []a = {1, 5, 4, 3, 2};
        System.out.println(minSwaps(a));
    }
}
