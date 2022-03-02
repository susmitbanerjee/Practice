package ProductCompanies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();
        for(String str: strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedString = String.valueOf(charArr);
            if(!anagramMap.containsKey(sortedString)){
                anagramMap.put(sortedString, new ArrayList());
            }
            anagramMap.get(sortedString).add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }
    public static void main(String[] args) {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(input));
    }
}
