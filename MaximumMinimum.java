package DAC;

public class MaximumMinimum {
    static int DAC_MAX(int[] arr, int index, int length) {
        int max;
        if (index >= length - 2) {
            if (arr[index] > arr[index + 1]) {
                return arr[index];
            } else
                return arr[index + 1];
        }
        max = DAC_MAX(arr, index + 1, length);
        if (arr[index] > max) {
            return arr[index];
        } else
            return max;
    }

    static int DAC_MIN(int[] arr, int index, int length){
        int min;
        if(index >=length -2){
            if(arr[index]<arr[index+1]){
                return arr[index];
            }else
                return arr[index+1];
        }
        min = DAC_MIN(arr, index+1, length);
        if(arr[index] < min){
            return arr[index];
        }else
            return min;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{20, 12, 13, 56, 97, 21, 34, 350, 43, 78};
        int max, min;
        max = DAC_MAX(arr, 0, 9);
        min = DAC_MIN(arr, 0, 9);
        System.out.println(max);
        System.out.println(min);
    }
}
