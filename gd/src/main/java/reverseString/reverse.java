package reverseString;

public class reverse {

	
	
	public static void main(String[] args) {
		
		String str = "name";
		System.out.println(
		reversing(str));
		
	}
	
	public static  String reversing(String str) {
		
		char reverStr[]= str.toCharArray();
			for (int i =0; i < str.length();i++) {
				
				reverStr[i]= str.charAt(str.length()-i-1);
				
			}
		return 
		new String(reverStr);
		
	}
}
