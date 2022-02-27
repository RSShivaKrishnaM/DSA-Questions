package java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.*;

public class FindDistinctElements {
	
	public static void main(String[] args) {
		String str = "aabbccd";
//		List<Character> lsit = Arrays.asList(str.toCharArray());
//		Map<Character, Long> frequencyMap1 = str.chars().mapToObj(c -> Character.valueOf((char)c))
//				.collect(Collectors.groupingBy(Function.identity(),
//				Collectors.counting()));
//		
//		System.out.println(frequencyMap1);

		
		List<String> list = new ArrayList<>();
		list.add("geek");
		list.add("for");
		list.add("geek");
		Map<String, Long> frequencyMap = list.stream()
				.collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting()));
		
		System.out.println(frequencyMap);
		
		
		String u = "abccdddd";		
		List<Character> di = u.chars().distinct().
				mapToObj(c -> Character.valueOf((char) c)).collect(Collectors.toList());
		System.out.println(di.toString());
		
		String u2 = "abccdddd";
		
		List<String> listt = new ArrayList<>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{add("for");
			add("forrr");
			}
		};
		List<String> list2 = new ArrayList<>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add("geek");
				add("geeks");
				add("geekkkks");
			}
		};
		
		List<String> listt3 = Stream.of(listt,list2).flatMap(List::stream).collect(Collectors.toList());
		System.out.println(listt3.toString());
		
		List<String> sbc = Stream.of(u2)
				.map(w -> w.split(""))
				.flatMap(Arrays::stream)
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(sbc);

	}
	
}
