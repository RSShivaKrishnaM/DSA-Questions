package arrays.kadensAlgo;

public class MaximumProdSubArray {
	public int maxProduct(int[] A) {
        if(A.length == 0){
           return -1;
       }
        int min = A[0];
        int max = A[0];
        int ans = A[0];
        int ch1,ch2;
       for(int i = 1;i < A.length;i++){
           ch1 = min * A[i];
           ch2 = max * A[i];
           min = Math.min(A[i],Math.min(ch1,ch2));
           max = Math.max(A[i],Math.max(ch1,ch2));
           ans = Math.max(ans,max);
       }
       return ans;
   
   }
}
