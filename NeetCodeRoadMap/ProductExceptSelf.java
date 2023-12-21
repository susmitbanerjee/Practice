package NeetCodeRoadMap;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int left =1, right=1;

        for(int i=0;i<nums.length;i++){
            arr[i] = left;
            left = left * nums[i];
        }

        for(int i=nums.length-1 ; i >=0; i--){
            arr[i] = arr[i] * right;
            right = right * nums[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {-1,1,0,-3,3};
        int[] result = productExceptSelf(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+"\t");
        }
    }
}
