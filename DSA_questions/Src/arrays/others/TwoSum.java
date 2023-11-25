package arrays.others;

public class TwoSum {

	/*
	 *  arr : 3, 5, 2, -4, 8
	 *  sum : 7
	 *  o/p : 
	 */
	
	/*
	 * step 1 : sort arrary (asc)
	 * step 2 : ptr1 index 0 and ptr2 index4
	 * step 3 : while (ptr1 < ptr2)
	 * step 4 :   arr[ptr1] + arr[ptr2] == sum
	 * step 5 :  arr[ptr1] + arr[ptr2] < sum
	 *            ptr1++;
	 * step 6 :  arr[ptr1] + arr[ptr2] > sum
	 *           ptr2--
	 *                    
	 */
	
	 public static void sample() {
		 int a = 1;
		 long b = 2;
		 
		 int res1 = (int) (a + b);
		 a  += b; 
		 System.out.println("result" +res1+ a);
		 
	 }
	 
	 public static void main(String[] args) {
		 
	 }
	
}
