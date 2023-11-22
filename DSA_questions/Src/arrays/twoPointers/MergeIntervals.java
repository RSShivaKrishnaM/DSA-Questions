package arrays.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MergeIntervals {
	class Solution {
	    public int[][] merge(int[][] intervals) {
	        
	        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
	        // creating a list of int array results
	        // add first interval to the result list
	        // loop over intervals starting from second element
	        // compare end element of res with second element end
	        // if end ele of second interval is smaller then change value of end
	        
	        if(intervals.length==0 || intervals.length==1){
	            return intervals;
	        } 
	        
	        List<int[]> res = new ArrayList<>();
	        
	        int start = intervals[0][0];
	        int end = intervals[0][1];
	        
	        for(int i=1 ; i < intervals.length; i++){
	            if(end >= intervals[i][0]){
	                end = Math.max(intervals[i][1], end);
	            }else{
	                res.add(new int[]{start, end});
	                start = intervals[i][0];
	                end = intervals[i][1];
	            }
	        }
	        
	        res.add(new int[]{start, end});
	        
	        int[][] resInt = new int[res.size()][intervals[0].length];
	        
	        Iterator<int[]> it = res.iterator();
	        int i = 0;
	        while(it.hasNext()){
	            int[] ele = it.next();
	            resInt[i] = ele;
	            i++;
	        }
	        
	        return resInt;
	    }
	    
	    public int[][] merge2(int[][] intervals) {
	        // Lets sort the array first based on the START so we dont have to come back 
	      Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
	       // create a List with arrays which is gon be our result
	      List<int[]> list = new ArrayList<>();
	        
	     //  We already know the start and the end from the first cell
	      int start = intervals[0][0]; 
	      int end = intervals[0][1];
	      
	    // Loop thru all . Start at i = 1, because we already know the first one
	      for(int i = 1 ; i < intervals.length;i++){
	          // If the cell on row 1 is less than start just initialize the end as the max between whatever the end is or whatever the new end could be
	            if(intervals[i][0] <= end)   
	               end = Math.max(intervals[i][1], end);
	            
	            else {
	                list.add(new int[]{start, end});
	                start = intervals[i][0];
	                end = intervals[i][1];
	            }  
	        }
	        
	        // Here we ll just add the last row as we are not considering in the loop
	        list.add(new int[]{start, end});
	        
	        // And this is basic synthax as I am just transforming the List of int[] -> into a 2D array
	        int[][] result = new int[list.size()][2];
	       
	        for(int i = 0 ; i < list.size(); i++){
	           result[i] = list.get(i);

	        }
	        return result;
	    }
	}
}
