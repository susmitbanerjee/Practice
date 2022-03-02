package Leetcode;

import java.util.HashMap;

public class RomanToInt {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> characterIntegerHashMap=new HashMap<>();
        characterIntegerHashMap.put('I',1);
        characterIntegerHashMap.put('V',5);
        characterIntegerHashMap.put('X',10);
        characterIntegerHashMap.put('L',50);
        characterIntegerHashMap.put('C',100);
        characterIntegerHashMap.put('D',500);
        characterIntegerHashMap.put('M',1000);
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int a = characterIntegerHashMap.get(s.charAt(i));
            int b = characterIntegerHashMap.get(s.charAt(i+1));
            if(a<b){
                sum-=a;
            }else
                sum+=a;
        }
        sum += characterIntegerHashMap.get(s.charAt(s.length()-1));
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }
}
