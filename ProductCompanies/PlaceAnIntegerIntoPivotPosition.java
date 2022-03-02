package ProductCompanies;

public class PlaceAnIntegerIntoPivotPosition {
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void partition(int[] arr, int low, int high, int number){
        int pivot = number;
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j] != pivot && arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1,high);
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,7,2,6};
        partition(arr, 0,arr.length-1, 7);

    }
}
