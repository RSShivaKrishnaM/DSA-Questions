package arrays.twoPointers;

public class ServiceNowTest1 {
   // S1 = “abc”
   // S2 = “cab”
   // s3 = "bca" valid
   // s4 = "bac" invalid
	
	
	public boolean isRotated(String S1, String S2) {
		boolean res = false;
		
	   // s1.sort s2.sort
		// s1 == s2
		
		// a a b c a s1
		// 0 0 1 2 0 : int *10 + int %10 
		// a b c a a s2 
		// 0 1 2 0 0 : int 
		// rotated s1 s2
		
		// aabc
		//abca
		//s1.subString(0++,0++ + 3);
		//s2.subStirng(i,i+2);
		//0 :  len && last.s1 == 0.s2
		//
		
		// s1 : s1.getChar(len)
		//s1.getChar(0)
		// s1 : rightshift
		
		// s2 : s2.getChar(0)
		// s2.charAt(len)
		
		
		// leftShift
		// s1 ==s1
		
		// while(s1==s2 && index){
//		    getShift() O (n-1)
		//	}
		
//		O(n^2)
		
		/*
		 * s1 : ArrayList<>
		 * 
		 * s2 : ArrayList<>
		 * diff (index s1 char1 char2)
		 * diff ( index s2 char1 char2)
		 */
		//O(n) 
		
		/*aa 
		 * get char1 from S1
		 * get char2 from S1
		 * 
		 * search for char1 in s2
		 * get char1 char2 == 1
		 * 
		 * build in functions
		 * 
		 * 
		 */
		return res ;
	}
}
