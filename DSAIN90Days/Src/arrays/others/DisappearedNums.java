package arrays.others;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNums {
	class Solution {
	    public List<Integer> findDisappearedNumbers(int[] nums) {
	      
	      // insert nums into set and use set for checking whether index is present or not 
	        
	     // loop over 1 to n integers
	        // check if index is occuring in nums or not  -> convert nums into streams and check occurance 
	            // if not occuring add it to the list
	 
	        //sort the array
	        //loop over sorted nums
	            //check index+1 != nums[i]
	            // add it to linked list
	        List<Integer> disappearedNumbers = new ArrayList<>();
	        
	        //loop over nums
	        
	        int[] freq = new int[100000];
	        for(int i=0; i<nums.length; i++){
	            freq[nums[i]]++;
	        }
	        
	        for(int i=1; i<=nums.length; i++){
	            if(freq[i]==0){
	                disappearedNumbers.add(i);
	            }
	        }
	        
	        return disappearedNumbers;
	    }
	   public List<Integer> findDisappearedNumbers2(int[] nums) {


	        List<Integer> result = new ArrayList<>();
	        for(int i=0; i<nums.length; i++){
	            int index = Math.abs(nums[i])-1;
	            if(nums[index] > 0){
	                nums[index] = -1 * nums[index];
	            }
	        }
	        for(int i=0; i<nums.length; i++){
	            if(nums[i] > 0){
	                result.add(i+1);
	            }
	        }
	        return result;
	    }
	}
}
