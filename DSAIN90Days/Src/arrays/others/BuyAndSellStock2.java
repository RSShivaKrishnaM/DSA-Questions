package arrays.others;

public class BuyAndSellStock2 {
	  public int maxProfit(int[] prices) {
	        // iterate over prices
	        // maintain a current local min
	        // find diff with current day price
	        // maintain a max diff and index of max value till now 
	        // once iterate till end of the loop once you find max diff index
	        
	        
	        // run a loop from max price index till end of the prices array
	        // maintain a local min
	        // find diff with cuurent day price
	        // find second max diff
	        
	        // return first max diff + second max diff;
	        
	        if(prices.length==0 || prices.length==1){
	            return 0;
	        }
	        int profit = 0;
	        for(int i = 1 ; i < prices.length; i++){
	            if(prices[i] > prices[i-1]){
	                profit += prices[i] - prices[i-1];
	            }
	        }
	        return profit;
	 
	    }
}
