package primeNumber;

public class prime {
	
	public static void main(String[] args) {
		int a =101;
		System.out.println(
		isprime(a));
	}

	private static boolean isprime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= n / 2; i++) {
			System.out.println(i);
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
		
	}


