package arrays.kadensAlgo;

public class MaximumSubarray {
	 public int maxSubArray(int[] nums) {
	  int max = nums[0];
      int currSum = max;
      for(int i = 1 ; i < nums.length; i++){
          currSum = Math.max(nums[i], currSum + nums[i]);
          max = Math.max(max ,currSum);
      }
      return max;
	 }
}
