package arrays.slidingWindow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MoveZeros { // altimetrix
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
	   
	   public void moveZerosSolu2(int []nums) {
		   int nonZero =0;
	        
	        for(int i=0; i<nums.length; i++){
	            if(nums[i]!=0)
	                nums[nonZero++]= nums[i];
	        }
	        
	        for (int i= nonZero; i<nums.length;i++){
	            nums[i]=0;
	        }
	   }

	public static List<Integer> moveZerosToEnd3(List<Integer> inpuList){

		List<Integer> nonZeroList = new ArrayList<>();

		Iterator<Integer> it = inpuList.iterator();
		while(it.hasNext()){
			int curr = it.next();
			if(curr!=0){
				nonZeroList.add(curr);
			}
		}

		List<Integer> resList = new ArrayList<>(inpuList.size());

		resList.addAll(nonZeroList);
		int diff = inpuList.size() - nonZeroList.size();

		while(diff-- >0) {
			resList.add(0);
		}

		return resList;
	}
}
