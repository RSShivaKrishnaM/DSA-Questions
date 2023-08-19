package string;

import java.util.*;

public class PatternMatching {


        public static List<String>
        findAndReplacePattern(String[] words, String pattern) {
            List<String> matchedWords = new LinkedList<>();
            Map<Character, Character> wordChToPatternCh = new HashMap<>();
            Map<Character, Character> patternChToWordCh = new HashMap<>();
            boolean breakWordChloop;
            for (String word : words) {
                breakWordChloop = false;
                if(word.length() != pattern.length()){
                    continue;
                }
                for (int i = 0, j = 0; i < word.toCharArray().length && j < pattern.toCharArray().length; i++, j++) {

                    if (wordChToPatternCh.containsKey(word.charAt(i))) {
                        if (wordChToPatternCh.get(word.charAt(i)) != pattern.charAt(j)) {
                            breakWordChloop = true;
                            break;
                        }
                    }

                    if (patternChToWordCh.containsKey(pattern.charAt(j))) {
                        if (patternChToWordCh.get(pattern.charAt(j)) != word.charAt(i)) {
                            breakWordChloop = true;
                            break;
                        }
                    }


                    wordChToPatternCh.put(word.charAt(i), pattern.charAt(j));
                    patternChToWordCh.put(pattern.charAt(j), word.charAt(i));
                }
                wordChToPatternCh.clear();
                patternChToWordCh.clear();

                if (!breakWordChloop)
                    matchedWords.add(word);
            }
            return matchedWords;
        }

    static String encodeString(String str)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        String res = "";
        int i = 0;

        // for each character in given string
        char ch;
        for (int j = 0; j < str.length(); j++) {
            ch = str.charAt(j);

            // If the character is occurring for the first
            // time, assign next unique number to that char
            if (!map.containsKey(ch))
                map.put(ch, i++);

            // append the number associated with current
            // character into the output string
            res += map.get(ch);
        }

        return res;
    }

    //better solution
    public List<String> findAndReplacePattern2(String[] words, String pattern) {

        // len is length of the pattern
        int len = pattern.length();

        //Create a list of string to store the ans
        List<String> matches = new ArrayList<>();

        // encode the string
        String hash = encodeString(pattern);

        // for each word in the dictionary array
        for (String word : words) {
            //If both have same size and same hash store the word
            if (word.length() == len
                    && encodeString(word).equals(hash))
                matches.add(word);
        }
        return matches;
    }

    public static void main(String[] args) {
            Set<Integer> set = new HashSet<>();
            set.add(1);

        String[] strArra = {"abc","cde","zzz"};
        String  pattern = "aaa";
        List<String> matchedWords = findAndReplacePattern(strArra, pattern);
        matchedWords.forEach(System.out::print);
    }

}
