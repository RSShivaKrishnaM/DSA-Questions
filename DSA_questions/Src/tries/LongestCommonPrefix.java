package tries;


// https://leetcode.com/problems/longest-common-prefix/description/
public class LongestCommonPrefix {

	// Alphabet size (# of symbols)
	static final int ALPHABET_SIZE = 26;

	static TrieNode root;

	// trie node
	static class TrieNode {
		TrieNode[] children = new TrieNode[ALPHABET_SIZE];

		// isEndOfWord is true if the node represents
		// end of a word
		boolean isEndOfWord;

		TrieNode() {
			isEndOfWord = false;
			for (int i = 0; i < ALPHABET_SIZE; i++)
				children[i] = null;
		}
	};


	

	public static void main(String[] args) {
		String[] temp= {"flower","flow","flight"};
		longestCommonPrefix(temp);
	}

	public static String longestCommonPrefix(String[] strs) {

		root = new TrieNode();

		// Construct trie
		int i;
		for (i = 0; i < strs.length; i++)
			insert(strs[i]);

		TrieNode temp = root;
		
		
		TrieNode[] children2 = temp.children;

		int count = 0;
		for (int j = 0; j < children2.length; j++) {
			if(children2[j]!=null) {
				if(count ==1) {
					break;
				}
				count++;
			}
		}
		return null;
	}

	// If not present, inserts key into trie
	// If the key is prefix of trie node,
	// just marks leaf node
	static void insert(String key) {
		int level;
		int length = key.length();
		int index;

		TrieNode pCrawl = root;

		for (level = 0; level < length; level++) {
			index = key.charAt(level) - 'a';
			if (pCrawl.children[index] == null)
				pCrawl.children[index] = new TrieNode();

			pCrawl = pCrawl.children[index];
		}

		// mark last node as leaf
		pCrawl.isEndOfWord = true;
	}

}
