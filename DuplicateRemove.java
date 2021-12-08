package misc;

public class DuplicateRemove {
    static boolean isPresent(int[] arr, int number){
        boolean checkFlag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==number){
                checkFlag=true;
                break;
            }
        }
        return checkFlag;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,3,3,3,4,4,4,4,5,5,5,7,7,7,6,8,9,3};
        int[] newArr = new int[25];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(!isPresent(newArr, arr[i])){
                newArr[index]=arr[i];
                index++;
            }
        }
        for(int i=0;i<index;i++) {
            System.out.print(newArr[i]+"\t");
        }
    }
}
