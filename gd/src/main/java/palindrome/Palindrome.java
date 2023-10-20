package palindrome;

public class Palindrome {

	public static void main(String[] args) {
		
		check("ana");
	}

	private static void check(String string) {
		StringBuffer strB= new StringBuffer();
		for(int i =string.length();i>0;i--) {
			System.out.println(i);
			strB.append(string.charAt(i-1));
		}
		System.out.println(strB);
		String newS= strB.toString();
		if (newS.equals(string.toString())) {
            System.out.println("Yes, it's a palindrome");
        } else {
            System.out.println("No, it's not a palindrome");
        }
	}
}
