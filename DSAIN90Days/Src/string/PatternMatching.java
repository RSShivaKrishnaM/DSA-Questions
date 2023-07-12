package string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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

    public static void main(String[] args) {
        String[] strArra = {"abc","cde","zzz"};
        String  pattern = "aaa";
        List<String> matchedWords = findAndReplacePattern(strArra, pattern);
        matchedWords.forEach(System.out::print);
    }

}
