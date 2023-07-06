package TriboHotelInterview;

import java.util.HashMap;
import java.util.Map;

public class TriboHotels {
   /*
    *  Add 5 user [1,2,3,4,5]


a) Add PETROL expense: equal split of 600 paid by user 2 between (1,2,5) - Petrol


b) Add MOVIE expense percentage split 400 paid by user 1 between (1,2,4,5) [ 30%, 20%, 40%, 10%]  - Movie
 

c) Add FOOD expense: exact split of 700 paid by user 4 btw (1,2,5) [ 100, 200,  400] - Food

    */
	
	/*
	 * input : 
	 * 
	 * 1. Expenses
	 * 		user iD : 2
	 *      user id : 4
	 * 2. Netbalance
	 *      user id : 2 
	 *      user id : 1    
	 *    
	 * 
	 * output :
	 *        2) expenseid name 
	 *            a)       Petrol
	 *            b)       Movie
	 *            c)       Food
	 *          
 	 *       netbalance : <figure> <-100>
 	 *       
 	 *       id : 1 
 	 *       netbalance : <figure> <-100>
	 */
	
	
	public static void main(String[] args) {
		
		ExpenCalAndMangService exCalSer = new ExpenCalAndMangService();
		
		Map<String,Double> userIdShareMap = new HashMap<>();
		
		userIdShareMap.put("1", 200.00);
		userIdShareMap.put("2", 200.00);
		userIdShareMap.put("3", 200.00);
		
		try {
			exCalSer.addExpenses(2, "a", "PETROL", 600, userIdShareMap, SplitType.EQUAL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Map<String,Double> userIdShareMap2 = new HashMap<>();
		
		userIdShareMap2.put("1", (double) 30);
		userIdShareMap2.put("2", (double) 20);
		userIdShareMap2.put("4", (double) 40);
		userIdShareMap2.put("5", (double) 10);
		
		try {
			exCalSer.addExpenses(1, "b", "Movie", 400, userIdShareMap2, SplitType.PERCENTAGE);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Map<String,Double> userIdShareMap3 = new HashMap<>();
		
		userIdShareMap3.put("1", (double) 100);
		userIdShareMap3.put("2", (double) 200);
		userIdShareMap3.put("5", (double) 400);
		
		try {
			exCalSer.addExpenses(1, "c", "FOOD", 700, userIdShareMap3, SplitType.EXACT);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		exCalSer.getnetBalance("2");
		exCalSer.getnetBalance("1");
		
		
		exCalSer.getExpenses("1");
		exCalSer.getExpenses("2");
		
	}

	
}

