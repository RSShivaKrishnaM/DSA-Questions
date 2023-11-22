package arrays.others;

public class BestTimeToBuyAndSellStocks {
	 // iterate over prices
    // maintain a variable which will always have minimum value
    // if currValu is more than min value find the difference b/w min and currentVal
    //.at the end of traversing prices maximum difference value will be present
    
    public int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxDiff = Integer.MIN_VALUE;
        int diff = 0;;
        for(int price : prices){
            minPrice = Math.min(price, minPrice);
            diff = Math.abs(minPrice-price); 
            maxDiff = Math.max(diff, maxDiff);
        }
        return maxDiff;
    }
    
    
    public int maxProfit2(int[] prices) {
        if(prices.length==1){
            return 0;
        }
        int leftPointer = 0;
        int rightPointer = 1;
        int maxProfit = 0;
        int profitMargin = prices[rightPointer] - prices[leftPointer];
        for(int i = 0 ; i < prices.length-1; i++){
            profitMargin = prices[rightPointer] - prices[leftPointer];
            if(profitMargin <= 0){
                leftPointer=rightPointer;
                rightPointer++;
            }else if (profitMargin > 0){
                if(maxProfit < profitMargin){
                    maxProfit = profitMargin;
                }
                rightPointer++;
            }
        }
        
        return maxProfit;
        
    }
}
