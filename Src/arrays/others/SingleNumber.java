package arrays.others;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SingleNumber {
	    public static int singleNumber1(int[] nums) {
	    	  Map<Integer,Integer> map = new HashMap<>();
	          for(int i =0; i<nums.length; i++){
	        	  map.computeIfPresent(nums[i], (key,val)->val+1);
	        	  map.putIfAbsent(nums[i], 1);
	          }
	          
	          Set<Entry<Integer,Integer>> entry = map.entrySet();
	          Iterator<Entry<Integer, Integer>> it = entry.iterator();
	          while(it.hasNext()) {
	        	  Entry<Integer,Integer> entr = it.next();
	        	  if(entr.getValue()==1) {
	        		  return entr.getKey();
	        	  }
	          }
	          return 1;
	    }
	    
	    public static int singleNumber(int[] nums){
	        int ret = 0;
	        for (int num : nums) {
	            ret ^= num;
	        }
	        return ret;
	    }
	    
	    public static void main(String[] args) {
		  System.out.println(singleNumber(new int[] {4,1,2,2,1}));	
		}
	
}
