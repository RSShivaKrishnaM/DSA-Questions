package string.others;

public class ReverseWordsOfString {
	
	 public String reverseWordsSelf(String s) {
	        if(s.length()==0 || s.length()==1){
	            return s;
	        }
	        String trimmed = s.trim();
	        String[] words = trimmed.split("\\s+");
	        if(words.length==1){
	            return words[0];
	        }
	        
	        StringBuilder revWords = new StringBuilder();
	        for(int i = words.length-1; i >=0; i--){
	            revWords.append(words[i]);
	            revWords.append(" ");
	        }
	        
	        return revWords.toString().trim();
	}
	 
	public String reverseWordsFastest(String s) {
		if (s.length() == 0)
			return "";
		StringBuilder sb = new StringBuilder();
		int index = s.length() - 1;
		while (index >= 0) {
			int r = findEnd(s, index);
			int l = findStart(s, r);
			// System.out.println("l: "+l+", r: "+r);
			if (r == l && r == -1)
				return sb.toString();
			r++;
			if (l == -1) {
				l = 0;
			}
			if (sb.length() > 0 && r > 0)
				sb.append(' ');
			sb.append(s.substring(l, r));
			index = l - 1;
		}
		return sb.toString();
	}

	// -1 means we are done
	private int findEnd(String s, int start) {
		while (start >= 0 && s.charAt(start) == ' ')
			start--;
		return start;
	}

	private int findStart(String s, int start) {
		while (start >= 0 && s.charAt(start) != ' ')
			start--;
		return start + 1;
	}
	
	public static void main(String[] args) {
		String str = "Have a good day ";
		ReverseWordsOfString rever = new ReverseWordsOfString();
		System.out.println(rever.reverseWordsSelf(str));
	}

}
