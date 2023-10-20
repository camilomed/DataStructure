package removeSpace;

public class RemoveWhiteSpace {

	
	public static void main(String[] args) {
		System.out.println(
		remove(" hola como estas"));
	}

	private static StringBuilder remove(String string) {
		// TODO Auto-generated method stub
		StringBuilder newStr= new StringBuilder();
		char [] charStr= string.toCharArray();
		for(char c : charStr) {
			if (c!=' ') {
				newStr.append(c);
			}
		}
	
		return newStr;
	}
}
