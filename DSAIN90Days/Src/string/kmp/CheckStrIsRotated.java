package string.kmp;

import java.util.LinkedHashMap;
import java.util.Map;

public class CheckStrIsRotated {

	public static String firstUniqueChar() {

		String str = "abcbefgh";
		
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
//		for (int i = 0; i < str.length() - 1; i++) {
//			map.computeIfAbsent(str.charAt(i), );
//			map.computeIfPresent(null, null);
//		}
		
		for (int i = 0; i < str.length() - 1; i++) {

			if (!str.substring(i + 1, str.length()).contains(String.valueOf(str.charAt(i)))
					&& (i > 0 && !str.substring(0, i - 1).contains(String.valueOf(str.charAt(i))))) {
				return String.valueOf(str.charAt(i));
			}
		}

		return "";
	}

	public static void main(String[] args) {
		System.out.println(firstUniqueChar());
	}

}
