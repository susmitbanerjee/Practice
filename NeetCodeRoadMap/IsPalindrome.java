package NeetCodeRoadMap;

public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^\\w\\s]", "");
        String s2 = s1.replaceAll("\\s", "");
        String s3 = s2.replaceAll("_","");
        int j=s3.length()-1;
        for(int i=0;i<s3.length();i++){
                if(Character.toLowerCase(s3.charAt(i)) != Character.toLowerCase(s3.charAt(j))){
                    return false;
                }
                j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "ab_a";
        System.out.println(isPalindrome(s1));
    }
}
