package string.others;

public class IPv4AndIPv6Validation {
	public String validIPAddress(String queryIP) {
        if(queryIP.chars().filter(c-> c=='.').count()==3){
           for(String token : queryIP.split("\\.",-1)){
               if(token.length()==0 || token.length() > 3) return "Neither";
               if(token.charAt(0)=='0' && token.length()!=1) return "Neither";
               for(char c : token.toCharArray()) if(!Character.isDigit(c)) return "Neither" ;
               if(Integer.parseInt(token)>255) return "Neither";
           } 
           return "IPv4"; 
        }   
        if(queryIP.chars().filter(c-> c==':').count()==7){
           for(String token : queryIP.split(":",-1)){
               if(token.length()==0 || token.length() > 4) return "Neither";
               for(char c : token.toCharArray()){
                   if(!(c>'0' && c<='9' || c>='a' && c<'f' || c>='A' && c<='F')){
                       return "Neither";
                   }
               } 
           } 
           return "IPv6"; 
        }
        return "Neither";
    }
	
	public static void main(String[] args) {
		IPv4AndIPv6Validation ipv4 = new IPv4AndIPv6Validation();
		System.out.println(ipv4.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
	}
}
