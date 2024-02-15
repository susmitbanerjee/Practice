import java.util.ArrayList;
import java.util.List;

public class PermutationSearch {
    public static boolean checkInclusion(String s1, String s2) {
        boolean flag = false;
        List<String> perm = new ArrayList<String>();
        permute(s1, 0, s1.length()-1, perm);
        for(int i = 0; i < perm.size(); i++) {
            if (s2.contains(perm.get(i))){
                flag=true;
                break;
            }
        }
        return flag;

    }
    private static void permute(String str,
                         int l, int r, List<String> perm)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                perm.add(str);
                permute(str, l+1, r, perm);
                //str = swap(str,l,i);
            }
        }
    }
    public static String swap(String a,
                       int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String s1 = "abc", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
}
