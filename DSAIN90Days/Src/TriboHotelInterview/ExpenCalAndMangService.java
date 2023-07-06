package TriboHotelInterview;

import java.util.*;
import java.util.Map.Entry;
public class ExpenCalAndMangService {
	
	Map<String, Double> userIdAndBalanceMap = new HashMap<>();
	
	public void addExpenses(int userId, String expenseId, String expenseType, double totalPaidAmt, Map<String,Double> userIdToShareMap, SplitType splitType) throws Exception{
		
		validateExpenses(userIdToShareMap, splitType, totalPaidAmt);
		
		//populate userIdAndBalanceMap
		
		if(userIdToShareMap.containsKey(userId)) {
			
		}else {
			
		}
		
		
	}
	
	private void validateExpenses(Map<String, Double> userIdToShareMap, SplitType splitType, double totalPaidAmt) throws Exception {
		Iterator<Entry<String, Double>> it = userIdToShareMap.entrySet().iterator();
		List<Double> shareList = new LinkedList<>();
		while(it.hasNext()) {
			shareList.add(it.next().getValue());
		}
		
		if(!splitType.validate(shareList, totalPaidAmt)) {
			throw new Exception();
		}
	}

	public float getnetBalance(String userId) {
		float balance = 0;
		userIdAndBalanceMap.get(userId);
		return balance;
	}

	public void getExpenses(String string) {
		//
	}

}
