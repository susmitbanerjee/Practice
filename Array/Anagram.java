package Array;

public class Anagram {
    public static void main(String[] args) {
        String s1="anagram";
        String s2="nagaram";
        int j= s2.length()-1;
        int count=0;
        if(s1.length()!=s2.length()){
            System.out.println("Not");
        }else {
            for (int i = 0; i < s1.length(); i++) {
                j = s2.length() - 1;
                while (j >= 0) {
                    if (Character.toLowerCase(s1.charAt(i)) == Character.toLowerCase(s2.charAt(j))) {
                        count++;
                        break;
                    }
                    j--;
                }
            }
            if (count == s1.length()) {
                System.out.println("Anagram");
            } else
                System.out.println("Not");
        }
    }
}
