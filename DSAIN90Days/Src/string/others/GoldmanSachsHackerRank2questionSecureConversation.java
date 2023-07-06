package string.others;

public class GoldmanSachsHackerRank2questionSecureConversation {
	private static String decryption(String message, String key){
        StringBuilder res = new StringBuilder();
        char[] messArr = message.toCharArray();
        char[] keyArr = key.toCharArray();
        int keyInd = 0; 
        int msInd = 0;
        res.append(messArr[0]);
        while(keyInd < keyArr.length){
            msInd = msInd + keyArr[keyInd]-'0';
            res.append(messArr[msInd]);
            keyInd++;
        }
        
        return res.toString();
	}
	
	/*
	 * case 1 : when message is null
	 * case 2  : when message length is 0
	 * case 3 : when key is null
	 * case 4 : when key length is 0
	 * case 5 : 
	 */
	private static String encryption(String message, String key){
        StringBuilder res = new StringBuilder();
        char[] messArr = message.toCharArray();
        char[] keyArr = key.toCharArray();
        int keyInd = 0; 
        int msInd = 0;
        res.append(messArr[0]);
        while(keyInd < keyArr.length){
            msInd = msInd + keyArr[keyInd]-'0';
            res.append(messArr[msInd]);
            keyInd++;
        }
        
        return res.toString();
	}
	
	
	public static void main(String[] args) {
		
		int operation = 1;
		String  key = "123";
		String deMsg = "open";
		String enMsg = "oppeeen";
		if(operation == 1) {
			 enMsg = encryption(deMsg, key);
			System.out.println("encrypted message : "+enMsg);
		}else if(operation == 2) {
			deMsg = decryption(enMsg, key);
			System.out.println("decrypted message : "+deMsg);
		}
		
	}
}
