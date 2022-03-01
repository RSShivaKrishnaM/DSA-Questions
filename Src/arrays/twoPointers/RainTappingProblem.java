package arrays.twoPointers;

public class RainTappingProblem {

	 public int trap(int[] height) {
	        if(height.length==0 || height.length == 1){
	            return 0;
	        }
	        int[] left = new int[height.length];
	        int[] right = new int[height.length];
	        
	        int prev = 0;
	        for(int i = 0 ; i < height.length; i++){
	            left[i] = Math.max(height[i], prev);
	            prev = left[i];
	        }
	        
	        prev = 0;
	        for(int j = height.length -1 ; j >= 0 ; j--){
	            right[j] = Math.max(height[j], prev);
	            prev = right[j];
	        }
	        
	        int res = 0;
	        for( int i = 0 ; i< height.length; i++){
	            res += Math.min(left[i], right[i]) - height[i];
	        }
	        return res;
	    }
}
