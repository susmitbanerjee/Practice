package BeginHere;

import java.util.Arrays;

public class Anagram {
    static boolean anagramCheck(String s1, String s2){
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(ch1.toString().equalsIgnoreCase(ch2.toString()))
            return false;
        else
            return true;
    }
    public static void main(String[] args) {
        System.out.println(anagramCheck("abcd", "cadb"));
    }
}
