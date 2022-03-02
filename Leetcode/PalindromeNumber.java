package Leetcode;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int copy=x;
        int rev=0;
        rev=reverse(x);
        if(rev==copy)
            return true;
            else
                return false;

    }
    public static int reverse(int x) {
        long rev=0;
        while(x!=0){
            rev=rev*10 + x%10;
            x=x/10;
        }
        if(rev >= Integer.MIN_VALUE && rev <= Integer.MAX_VALUE)
            return (int)rev;
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
}
