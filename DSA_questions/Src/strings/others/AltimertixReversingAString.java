package string.others;

public class AltimertixReversingAString {
	
	public static String reverseStrWithStrBuilder(String inpuStr) {
		StringBuilder reverStr = new StringBuilder();
		for(char chara : inpuStr.toCharArray()) {
			reverStr.append(chara);
		}
		
		return reverStr.reverse().toString();
	}

	public static void reverseStrWithOutStrBuilder(String inpuStr) {

		for(int i = inpuStr.length()-1 ; i>=0 ; i--) {
			System.out.print(inpuStr.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		String str = "Altimetrix";
		System.out.println("With Str builder : " +reverseStrWithStrBuilder(str));
		System.out.print("Without Str builder : ");
		reverseStrWithOutStrBuilder(str);
	}

}
