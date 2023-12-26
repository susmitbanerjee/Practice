package NeetCodeRoadMap;

public class MaxArea {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max_area =0;

        while(i<j){
            if(height[i]<height[j]){
                max_area = Math.max(max_area, height[i]*(j-i));
                i++;
            }else{
                max_area = Math.max(max_area, height[j]*(j-i));
                j++;
            }
        }
        return max_area;
    }
}
