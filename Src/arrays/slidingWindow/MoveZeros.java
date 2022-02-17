package arrays.slidingWindow;

public class MoveZeros {
		//283. Move Zeroes
	   public void moveZeroes(int[] nums) {
	        //iterate over array elements
	        //if non zero don't do any thing
	        //if zero stop one pointer , move second pointer for finding next non zero ele in the array
	        //once second pointer points to non zero element, replace first pointer ele with second pointer ele and make second pointer ele to zero
	        //increment first pointer, if it is zero, increment second pointer till next non zero element and once found do above steps
	        //incremetn first pointer, if ele is non zero, increment first pointer
	        // once second pointer reaches end of the array
	        // from first pointer onwards convert every elements to zero till end
	        
	        if(nums==null || nums.length==1){
	            return;
	        }
	        
	        int firPointer = 0;
	        int secPointer = 1;
	        while(secPointer<nums.length){
	            if((nums[firPointer]==0) && (nums[secPointer]!=0)){
	                nums[firPointer] = nums[secPointer];
	                nums[secPointer]=0;
	                firPointer++;
	                secPointer++;
	            }else if((nums[firPointer]==0) && (nums[secPointer]==0)){
	                secPointer++;
	            }else{
	                firPointer++;
	                secPointer++;
	            }
	        }
	    }
}
