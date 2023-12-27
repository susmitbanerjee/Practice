package NeetCodeRoadMap;

public class TrapRainWater {
    public static int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];

        int max = height[0];
        int total = 0;

        //filing up the left array with left max value in an index position
        for(int i=0; i< left.length; i++){
            left[i] = Math.max(height[i], max);
            max = left[i];

        }

        //filing up the right array with right max value in an index position
        max = height[height.length - 1];
        for (int i = height.length - 1; i >= 0; i--) {
            right[i] = Math.max(height[i], max);
            max = right[i];
        }

        //for each index we will check min(l,r)-height[i] and do a sum
        for(int i=0; i < height.length; i++){
            total = total + Math.min(left[i], right[i]) - height[i];
        }
        return total;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
}
