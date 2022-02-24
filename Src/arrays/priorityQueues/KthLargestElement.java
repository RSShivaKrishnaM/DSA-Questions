package arrays.priorityQueues;

import java.util.PriorityQueue;

public class KthLargestElement {
//	https://leetcode.com/problems/kth-largest-element-in-an-array/
	
	    public int findKthLargestS1(int[] nums, int k) {
	       // sort the array in descending order
	       // return k-1th element  from sorted arra
	        Arrays.sort(nums);
	        int n = nums.length;
	        return nums[n-k];
	    }
	    
	    public int findKthLargest(int[] nums, int k) {
	       //priorty queues
	        PriorityQueue<Integer> pq = new PriorityQueue<>();
	        for(int i =0; i<k; i++){
	            pq.add(nums[i]);
	        }
	        
	        for(int i = k ; i < nums.length; i++){
	            if(pq.peek()< nums[i]){
	                pq.poll();
	                pq.add(nums[i]);
	            }
	        }
	        return pq.peek();
	    }
}
