package arrays.twoPointers;

public class Test2 {
	
	public static void main(String[] args) {
		System.out.println(addingTwoArrays(new int[] {1,2,3}, new int[] {3,5,6}));
	}
	
	
	public static int [] addingTwoArrays(int[] arr1, int[] arr2) {
		
		
		int c = 0;
		if(arr1==null && arr2!= null) {
			return arr2;
		}
		
		if(arr2==null && arr1!= null) {
			return arr1;
		}
		
		int n = arr1.length;
		int m = arr2. length;
		
		int[] res = new int[m+1];
		
		if(n==0 && m >0 ) {
			return arr2;
		}
		
		if(m==0 && n >0 ) {
			return arr1;
			
		}
		
		// n > 0 and m > 0
		
//		 1,2,3 : 3
//		 2 : 1
		
		if(m==n) {
			for(int i = m-1; i>=0; i--) {
				int sum = arr1[i] + arr2[i];
				int rem =  sum % 10;  // 1
				c =  sum / 10; // 5
				res [i] =  rem + c ;
				c = 0;
			}
		}
		
		
		return res;
		
	}

}
