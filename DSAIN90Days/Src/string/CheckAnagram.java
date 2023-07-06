package string;

import java.util.*;

public class CheckAnagram {
    public boolean isAnagram(String s, String t) {
        // create a map with character and count O(n)
        // create a sec map with character and count O(n)
        // compare both the maps and see if every entry are same or not O(n)
        // compare the sizes of both the maps
        // iterate over one map and keep checking the keys count in both the maps
        //

        Map<Character, Integer> sCharCountMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            sCharCountMap.computeIfPresent(ch, (key, val) -> val + 1);
            sCharCountMap.putIfAbsent(ch, 1);
        }

        Map<Character, Integer> tCharCountMap = new HashMap<>();
        for (char ch : t.toCharArray()) {
            tCharCountMap.computeIfPresent(ch, (key, val) -> val + 1);
            tCharCountMap.putIfAbsent(ch, 1);
        }

        boolean isAnagram = true;
        if (sCharCountMap.size() == tCharCountMap.size()) {
            Set<Map.Entry<Character, Integer>> sCharCountEntrySet = sCharCountMap.entrySet();
            Iterator<Map.Entry<Character, Integer>> it = sCharCountEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry<Character, Integer> entry = it.next();
                if (tCharCountMap.containsKey(entry.getKey())) {
                    if (entry.getValue() != tCharCountMap.get(entry.getKey())) {
                        isAnagram = false;
                        break;
                    }
                } else {
                    isAnagram = false;
                    break;
                }
            }
        } else {
            isAnagram = false;
        }

        return isAnagram;

    }


    public boolean isAnagram2(String s, String t) {

        char[] tempArrayS = s.toCharArray();
        char[] tempArrayT = t.toCharArray();

        Arrays.sort(tempArrayS);
        Arrays.sort(tempArrayT);

        s = new String(tempArrayS);
        t = new String(tempArrayT);

        if (s.contains(t) && t.contains(s)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isAnagram3(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }


/*    Time complexity:
    O(n)
    Space complexity:
    O(n)
*/

    public boolean isAnagram4(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }
        for (int val : map.values()) {
            if (val != 0) return false;
        }
        return true;
    }

}
