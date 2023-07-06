package arrays.others;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlitmetrixMoveZerosToEnd {

//	If {14, 0, 5, 2, 0, 3, 0} is the given array, then move zeros to end of the array so the result is {14, 5, 2, 3, 0, 0, 0}


	public static List<Integer> moveZerosToEnd(List<Integer> inpuList){
		
		List<Integer> nonZeroList = new ArrayList<>();

		Iterator<Integer> it = inpuList.iterator();
		while(it.hasNext()){
		   int curr = it.next();
		   if(curr!=0){
		      nonZeroList.add(curr);
		   }
		}

		List<Integer> resList = new ArrayList<>(inpuList.size());

		resList.addAll(nonZeroList);
		int diff = inpuList.size() - nonZeroList.size();
		
		while(diff-- >0) {
			resList.add(0);
		}
	
	   return resList;
	}
	
	public static void main(String[] args) {
		List<Integer> inpuList = new ArrayList<>();
		inpuList.add(14);
		inpuList.add(0);
		inpuList.add(5);
		inpuList.add(2);
		inpuList.add(0);
		inpuList.add(3);
		inpuList.add(0);
		
		System.out.println(moveZerosToEnd(inpuList));
	}
}
