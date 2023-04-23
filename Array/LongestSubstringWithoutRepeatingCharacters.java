package Array;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    private static int longestSubstringWithoutRepeatingCharacters(String str){
        HashSet<Character> characterHashSet = new HashSet<>();//set containing unique character counts
        int i=0;//start index
        int j=0;
        int max=Integer.MIN_VALUE;//variable index which will be incremented to traverse the string
        while(j<str.length()){
            if(!characterHashSet.contains(str.charAt(j))){
                characterHashSet.add(str.charAt(j));
                j++;
                max=Math.max(max, characterHashSet.size());
            }else{
                characterHashSet.remove(str.charAt(i));
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println(longestSubstringWithoutRepeatingCharacters("pwwkew"));
    }
}
