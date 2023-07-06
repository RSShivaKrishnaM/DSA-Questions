package arrays.twoPointers;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortColors {
	  public void sortColors2(int[] nums) {
	        Map<Integer,Integer> map = new TreeMap<>();
	        
	        Arrays.stream(nums).forEach(num-> {
	            map.computeIfPresent(num, (key,val) -> val+1);
	            map.putIfAbsent(num, 1);
	        });
	        
	        // map.entrySet().stream().forEach(entry -> { int ind = 0;
	        //                                            int key = entry.getKey();
	        //                                          for(int i=0; i<entry.getValue();i++){
	        //                                            nums[ind] = key;
	        //                                            ind++;
	        //                                          }});
	        Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();    
	        int ind = 0;
	        while(it.hasNext()){
	            Entry<Integer, Integer> entry = it.next();
	            int key = entry.getKey();
	            for(int i=0; i<entry.getValue();i++){
	                nums[ind] = key;
	                ind++;
	            }
	        }

	    }
	    
	     public void sortColors(int[] nums) {
	        
	        int j=0,k=nums.length-1;
	        int i=0;
	        while(i<nums.length && i<=k){
	            if(nums[i]==0){
	                swap(nums,i,j);
	                j++;
	                i++;
	            }else if(nums[i]==2){
	                swap(nums,i,k);
	                k--;
	            }else{
	                i++;
	            }
	            
	        }
	    }
	    
	    public void swap(int[] nums,int i, int j){
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }


}
