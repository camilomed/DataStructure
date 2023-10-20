package swap;

public class SwapNumber {
	
	public static void main(String[] args) {
		int a=5;
		int b=10;
		swap(a,b);
	}

	private static void swap(int a, int b) {

		b=b+a;
		a=b-a;
		b=b-a;
		System.out.println("a: "+a+ " b: "+b);
		
	}

}
