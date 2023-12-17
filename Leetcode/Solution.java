package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    static int reverseInteger(int number){
        int rev=0;
        while(number!=0){
            int rem = number%10;
            rev = rev*10+rem;
            number=number/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(1234));
    }


}
