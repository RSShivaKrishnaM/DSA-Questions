package TriboHotelInterview;

import java.util.List;

public enum SplitType {
	PERCENTAGE{

		@Override
		boolean validate(List<Double> shareList, double totalPaidAmt) {
			double sum = shareList.stream().reduce((double) 0, (a,b) -> a+b);
			if(sum==100) {
				return true;
			}
			return false;
		}
		
	}, EXACT{

		@Override
		boolean validate(List<Double> shareList, double totalPaidAmt) {
			double sum = shareList.stream().reduce((double) 0, (a,b) -> a+b);
			if(sum==totalPaidAmt) {
				return true;
			}
			return false;

		}
		
	}, EQUAL{

		@Override
		boolean validate(List<Double> shareList, double totalPaidAmt) {
			double sum = shareList.stream().reduce((double) 0, (a,b) -> a+b);
			if(sum==totalPaidAmt) {
				return true;
			}
			return false;
			
		}
		
	};

	abstract boolean validate(List<Double> shareList, double totalPaidAmt) ;
}

