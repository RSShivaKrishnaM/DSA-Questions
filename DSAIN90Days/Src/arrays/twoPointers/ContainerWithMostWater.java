package arrays.twoPointers;

//leetcode 11. Container With Most Water
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int firstPointer = 0;
        int lastPointer = height.length - 1;
        int maxWaterVolume = Integer.MIN_VALUE;
        while (firstPointer < lastPointer) {
            if (height[firstPointer] < height[lastPointer]) {
                maxWaterVolume = Math.max(maxWaterVolume, height[firstPointer] * (lastPointer - firstPointer));
                firstPointer++;
            } else {
                maxWaterVolume = Math.max(maxWaterVolume, height[lastPointer] * (lastPointer - firstPointer));
                lastPointer--;
            }
        }
        return maxWaterVolume;
    }
}

