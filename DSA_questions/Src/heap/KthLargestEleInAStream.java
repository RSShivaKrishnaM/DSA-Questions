package heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestEleInAStream {

	
	    PriorityQueue<Integer> pq;
	    int k = 0;
	    public void KthLargestSelf(int k, int[] nums) {
	        this.k = k;
	        if(nums.length==0){
	            return;
	        }
	        
	        if(k > nums.length){
	            for(int i = 0; i < nums.length; i++){
	                pq.add(nums[i]);    
	            }
	            return;
	        }
	        
	        
	        for( int i = 0 ; i< k; i++){
	            pq.add(nums[i]);    
	        }
	            
	        for(int i = k; i <nums.length; i++){
	            if(pq.peek() < nums[i]){
	                pq.poll();
	                pq.add(nums[i]);
	            }
	        }
	    }
	    
	    public int addSelf(int val) {
	       if(!pq.isEmpty()){
	           if(pq.size()==k && pq.peek()<val){
	                pq.poll();
	                pq.add(val);    
	           }else if(pq.size() < k ){
	               pq.add(val);
	           }
	       }
	        
	        if(pq.isEmpty()){
	           pq.add(val);
	        }
	        return pq.peek();
	    }
	    
	     // PriorityQueue<Integer> pq;
	    // int k;
	    
	    public KthLargestEleInAStream(int k, int[] nums) {
	        
	        this.k = k;
	        pq = new PriorityQueue<>();
	        Arrays.stream(nums).forEach(num->System.out.println(num));
	        for(int num : nums)
	            add(num);
	    }
	    
	    public int add(int val) {
	        
	        pq.offer(val);
	        
	        if(pq.size() > k)
	            pq.poll();
	        
	        return pq.peek();
	    }
	
	
	
}
