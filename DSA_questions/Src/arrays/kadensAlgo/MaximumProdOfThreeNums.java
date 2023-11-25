package arrays.kadensAlgo;

import java.util.Arrays;

public class MaximumProdOfThreeNums {
	 public int maximumProduct(int[] nums) {
         Arrays.sort(nums);
        
        int n = nums.length;
        int prod1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int prod2 = nums[0] * nums[n - 1] * nums[n - 2];
        int prod3 = nums[0] * nums[1] * nums[n - 1];
        int prod4 = nums[0] * nums[1] * nums[2];
        
        int max = Math.max(prod1, prod2);
        max = Math.max(max, prod3);
        max = Math.max(max, prod4);
        
        return max;
    }
}
