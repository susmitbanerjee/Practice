package Leetcode;

import java.util.Arrays;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        int N = matrix.length;

        for(int i=0;i<N;i++){//only diagonal places will be swapped
            for(int j=i;j<N;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<N;i++) {//only terminal elements will be swapped
            for (int j = 0; j < N/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][N-1-j];
                matrix[i][N-1-j]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
