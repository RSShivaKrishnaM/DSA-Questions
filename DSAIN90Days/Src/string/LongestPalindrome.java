package string;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LongestPalindrome {

    public static int longestPalindrome(String s) {
        // work required O(n*n) where n is lenght of s

        Set<Character> charSet = new HashSet<>();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char alpha : s.toCharArray()) {
            if (charSet.contains(alpha)) {
                sb.append(stack.pop());
                charSet.remove(alpha);
                sb.append(alpha);
            } else {
                charSet.add(alpha);
                stack.add(alpha);
            }
        }
        int longestPalindromeNum = sb.toString().length();
        if(!charSet.isEmpty()){
            longestPalindromeNum++;
        }

        return longestPalindromeNum;
    }

    public int longestPalindrome2(String s) {
        int matchings = 0;
        // Create a set for storing the occurance of the character
        Set<Character> unmatchedCharacters = new HashSet<Character>();

        // If the character is already present we remove that charater from the set
        // And add 1 to the ans as we got an even pair
        // Otherwise we insert that character to the string
        for (char c: s.toCharArray()) {
            if (unmatchedCharacters.contains(c)) {
                unmatchedCharacters.remove(c);
                matchings++;
            } else {
                unmatchedCharacters.add(c);
            }
        }

        // The length of even substring
        int longestPalindromeLength = matchings * 2;
        // It will constitute the middle element of the string
        if (!unmatchedCharacters.isEmpty()) {
            longestPalindromeLength++; // place 1 unmatched odd character in the middle
        }

        return longestPalindromeLength;
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aabcdefgh"));
    }
}
