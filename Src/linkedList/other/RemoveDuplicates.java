package linkedList.other;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static List<Integer> removeDuplicates(List<Integer> inputList){
		Set<Integer> set = new HashSet<>();
		Iterator<Integer> it = inputList.iterator();
		while(it.hasNext()){
		   set.add(it.next());
		}

		Iterator<Integer> it2 = set.iterator();
		List<Integer> resList = new ArrayList<>();
		while(it2.hasNext()){
		   resList.add(it2.next());
		}
		return resList;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(2);
		System.out.println(removeDuplicates(list));;
	}
}
