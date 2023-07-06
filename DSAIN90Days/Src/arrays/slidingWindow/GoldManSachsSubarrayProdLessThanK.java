package arrays.slidingWindow;

public class GoldManSachsSubarrayProdLessThanK {
	public static int numSubarrayProductLessThanK(int[] nums, int k) {
	       // Sliding window technique
	        if(k<=1) return 0;
	        int leftPointer = 0 ;
	        int ans = 0 ;
	        int prod = 1;
	        for(int righPointer = 0; righPointer < nums.length ; righPointer++){
	             prod *= nums[righPointer];
	             while(prod >=k) prod /=nums[leftPointer++];
	             ans += righPointer - leftPointer + 1;
	        }
	        return ans;
	  }
	public static void main(String[] args) {
		System.out.println(numSubarrayProductLessThanK(new int[] {10,5,2,6},
				100));
	}
}
