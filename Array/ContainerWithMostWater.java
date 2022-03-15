package Array;

public class ContainerWithMostWater {
     private static int maxArea(int[] height) {
        int i=0;//start index
        int j=height.length-1;//end index
        int max_area=0;//indicating the max area
        while(i<j){
            if(height[i]<height[j]){
                max_area = Math.max(max_area, height[i] * (j-i));
                i++;
            }else{
                max_area = Math.max(max_area, height[j] * (j-i));
                j--;
            }
        }
        return max_area;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
