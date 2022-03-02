package Leetcode;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        int i=0,j=0,k=0;
        int[][] t = new int[numRows][s.length()];
        if(i<numRows){
            t[i][j]=s.charAt(k);
            k++;
            i++;
        }else if(j<s.length()){
            i--;
            j++;
            t[i][j]=s.charAt(k);
            k++;
        }
        return "";
    }
}
