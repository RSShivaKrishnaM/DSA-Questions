package trees.traversals;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class nArrayTree_6sense {

	public static void main(String[] args) {
		List<Emp> list = new LinkedList<>();
		list.add(new Emp(1, -1, "eric"));
		list.add(new Emp(2, 1, "Jack"));
		list.add(new Emp(3, 1, "Nitesh"));
		list.add(new Emp(4, 2, "Mic"));
		list.add(new Emp(5, 2, "Viral"));
		list.add(new Emp(6, 2, "Ray"));
		list.add(new Emp(7, 4, "George"));
		
		heirarchiPritner(list);
	}

	private static void heirarchiPritner(List<Emp> list) {
		
		// map<eid,mid>
		// map<eid, emp>
		// map<eid, List<emp>>
		
		Map<Integer,Emp> idToEmp = new HashMap<>();
		list.stream().forEach(emp -> idToEmp.put(emp.id, emp));

		Map<Emp, List<Emp>> mangToEmp = new HashMap<>();
		list.stream().forEach(emp-> {
			 
			if(mangToEmp.containsKey(idToEmp.get(emp.mid))) {
				List<Emp> list2 = mangToEmp.get(idToEmp.get(emp.mid));
				list2.add(emp);
				mangToEmp.put(idToEmp.get(emp.mid), list2);
			}else {
				List<Emp> list2 = new LinkedList<>();
				list2.add(emp);
				Emp mang = idToEmp.get(emp.mid);
				if(mang==null) {
					mangToEmp.put(emp, list2);
				}else {
					mangToEmp.put(mang, list2);
				}
				
			}
		});
		
		mangToEmp.entrySet().stream().forEach(entry ->{
			System.out.print(entry.getKey().name+"---->");
			entry.getValue().stream().forEach(emp -> System.out.print(" "+emp.name+" "));
			System.out.println("\n");
		});
		
	}

}

class Emp {
	int id;
	int mid;
	String name;

	public Emp(int id, int mid, String name) {
		this.id = id;
		this.mid = mid;
		this.name = name;
	}
}