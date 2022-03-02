package Leetcode;

public class ReverseInteger {
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
        System.out.println(reverse(1534236469));
    }
}
