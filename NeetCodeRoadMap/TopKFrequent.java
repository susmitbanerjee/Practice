package NeetCodeRoadMap;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<>();

        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else
                map.put(nums[i], map.get(nums[i])+1);
        }
        int result[] = new int[k];
        int i=0;
        Map<Integer, Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for(Map.Entry entry: sortedMap.entrySet()){
            if(i<k){
                result[i]=Integer.parseInt(entry.getKey().toString());
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3};
        int k=2;
        int[] result = topKFrequent(nums,k);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]+"\t");
        }

    }
}
