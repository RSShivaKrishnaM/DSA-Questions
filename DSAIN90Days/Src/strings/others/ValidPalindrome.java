package string.others;

public class ValidPalindrome {
	public static boolean isPalindrome(String s) {
		char[] str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();
		int i = 0;
		int j = str.length - 1;
		while (i < j) {
			if (str[i] != str[j])
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, ;a \"plan\",  0 a canal: Panama"));
	}
}
