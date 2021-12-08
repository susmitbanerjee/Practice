package DAC;

import java.util.Arrays;

public class BinarySearchRecursion {
    static int BIN_SEARCH(int[] arr, int start, int end, int num) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == num)
                return num;
            if (arr[mid] > num)
                return BIN_SEARCH(arr, start, mid - 1, num);
            else
                return BIN_SEARCH(arr, mid + 1, end, num);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{12, 13, 43, 45, 56, 76, 78, 89, 125, 32, 51, 127};
        Arrays.sort(array);
        int result = BIN_SEARCH(array, 0, array.length, 127);
        if (result == -1) {
            System.out.println("Not found");
        } else
            System.out.println("found");
    }
}
