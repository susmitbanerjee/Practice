package ProductCompanies;

public class ArrayRotation {
    static int[] rotateArray(int[] arr, int n, int k){
        for(int j=0;j<k;j++) {
            int element = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
            arr[0] = element;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int k=2;
        int n= arr.length;
        int[] arr1 = rotateArray(arr, n,k);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+"\n");
        }
    }
}
