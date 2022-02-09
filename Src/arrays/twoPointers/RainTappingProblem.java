package arrays.twoPointers;
import java.lang.*;

public class RainTappingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void Solution() {
		
	}
}

class Solution {
    public int maximumWealth(int[][] accounts) {
               
    	int maxWealth = 0;
    	
        for(int i = 0; i < accounts.length; i++){
            int wealthSum = 0;
        	for(int j = 0; j < accounts[0].length; j++){
                wealthSum += accounts[i][j];
            }
        	if(wealthSum > maxWealth) 
        		maxWealth = wealthSum;
        }
        
        return maxWealth;
        
    }
}

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<accounts.length;i++){
            int c = 0;
            for (int j = 0;j<accounts[i].length;j++){
                c = c + accounts[i][j];
            }
            if(c > max){
                max = c;
            }
        }
        return max;



        
    }
}
