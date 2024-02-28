package Array;

public class PalindromicSubStrings {
    static int count=0;
    public static int countPalindromicSubstrings(String str){
        for(int i=0;i<str.length();i++){
            checkPalindromicSubstring(str, i,i);
            checkPalindromicSubstring(str, i,i+1);
        }
        return count;
    }
    public static void checkPalindromicSubstring(String str, int l, int r){
        while(l>=0 && r<str.length() && str.charAt(l) == str.charAt(r)){
            count++;
            l--;
            r++;
        }
    }

    public static void main(String[] args) {
        String str = "aabbccddccbbaa";
        System.out.println(countPalindromicSubstrings(str));
    }
}
