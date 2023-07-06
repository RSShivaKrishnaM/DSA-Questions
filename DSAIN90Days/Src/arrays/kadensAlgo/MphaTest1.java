package arrays.kadensAlgo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MphaTest1 {
//	Input: arr[] = {0, -1, 2, -3, 1}
//	Output: 1
	
	// O(n3)
	// O(n2)
	// loop
//	 i =0
	   // loop
		//	i =1
	
	//O(n)
	
	//HashMap<Integer,Integer>
	//     
	
	public static int sumZero(int[] arr) {
		int count = 0;
		if(arr==null || arr.length<3) {
			return count;
		}
		if(arr.length==3) {
			if(arr[0]+arr[1]+arr[2] == 0) {
				return 1;
			}
			return count;
		}
		
		int sum = 0;
		Set<Integer> set = new HashSet<>();
		
		Arrays.stream(arr).forEach(ele->set.add(ele));
		
		if(arr.length>3) {
			for(int i = 0; i< arr.length;i++) {
				sum = arr[i];
				for(int j = i+1; j<arr.length; j++) {
					sum+=arr[j];
					int req = ~sum;
					if(set.contains(req)) {
						count++;
					}
					sum -= arr[j]; 
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {0,-1,2,3}; 
		System.out.println(sumZero(arr));
	}
}
