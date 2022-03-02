package ProductCompanies;

public class MinLengthOfSubArrayTargetSUm {
    static int count=0;
    static int minLength(int[] arr,int target){
        int result = Integer.MAX_VALUE;
        int left=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while(sum>=target) {
                result = Math.min(result, i+1 - left);
                sum-=arr[left++];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        System.out.println(minLength(arr,6));
    }
}
