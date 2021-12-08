package misc;

public class DuplicateRemoveWithSameArray {
    static int[] DuplicateRemove(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            for (int i = index + 1; i < arr.length; i++) {
                if (arr[index] == arr[i]) {
                    arr[index] = arr[i];
                    arr[i] = 0;
                }
            }
            index++;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                if (arr[i + 1] != 0) {
                    arr[i] = arr[i + 1];
                    arr[i + 1] = 0;
                } else
                    i = i + 1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 3, 3, 3, 4, 1};
        DuplicateRemove(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
