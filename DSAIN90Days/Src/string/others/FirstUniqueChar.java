package string.others;

public class FirstUniqueChar {
	 public int firstUniqChar1(String s) {
		   for(int ind = 0 ; ind < s.length(); ind++){
	            String ch = Character.toString(s.charAt(ind));
	            if(!s.substring(ind+1, s.length()).contains(ch) && !s.substring(0,ind).contains(ch)){
	                return ind;
	            }
	        }
	        return -1;	  
	  }
	 
	 public int firstUniqChar2(String s) {
	        for(int ind = 0 ; ind < s.length(); ind++){
	            String ch = Character.toString(s.charAt(ind));
	            if(!s.substring(ind+1, s.length()).contains(ch) && !s.substring(0,ind).contains(ch)){
	                return ind;
	            }
	        }
	        return -1;
	    }
	    
	    public int firstUniqChar(String s){
	        char[] chr = s.toCharArray();   
	        int[] charCnt = new int[26];
	        for(Character ch : chr){
	            charCnt[ch-'a']++;
	        }
	        
	        int i = 0 ;
	        while(i < chr.length){
	            if(charCnt[chr[i]-'a']>1){
	                i++;    
	            }else{
	                break;
	            }
	        }
	          if(i==chr.length)
	              return -1;
	        return i;
	    }
	 
	 public static void main(String[] args) {
		 FirstUniqueChar firstUniquChar = new FirstUniqueChar();
		 System.out.println(firstUniquChar.firstUniqChar("aabb"));
	 }

}
