package arrays.twoPointers;
//leetcode 11. Container With Most Water
public class ContainerWithMostWater {
	public int maxArea(int[] height) {
        int firPointer = 0;
        int lastPointer = height.length-1;
        int maxWaterVolume = Integer.MIN_VALUE ;
        while(firPointer < lastPointer){
            if(height[firPointer] < height[lastPointer]){
                  maxWaterVolume = Math.max(maxWaterVolume, height[firPointer] * (lastPointer -firPointer));
                  firPointer++;
            }else{
                  maxWaterVolume = Math.max(maxWaterVolume, height[lastPointer] * (lastPointer-firPointer));
                  lastPointer--;
            }
        }
        return maxWaterVolume;
    }
}

