package StringToInt;

public class Numconverter {
	public static int myAtoi(String s) {
		int i =0;
		int n=s.length();
		if(s==null || "".equals(s)) return 0;
		while( i<n&&s.charAt(i)==' ' ) {
			i++;
		}
		int positive = 0,negative=0;
		if (i<n && s.charAt(i) == '+') {
            positive++; // number of positive signs at the start in string
            i++;
        }

        if (i<n && s.charAt(i) == '-') {
            negative++; // number of negative signs at the start in string
            i++;
        }
		
		 double ans = 0; 
		while(i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
			 ans = ans*10 + (s.charAt(i) - '0'); // (s[i] - '0')
			 i++;
		}
		 if (negative > 0) { // if negative sign exists
	            ans = -ans;
	        }
	        if (positive > 0 && negative > 0) { // if both +ve and -ve sign exist, Example: +-12
	            return 0;
	        }
	        if(ans >Integer.MAX_VALUE) // if ans > 2^31 - 1
	            ans = Integer.MAX_VALUE;

	        if(ans < Integer.MIN_VALUE) // if ans < 2^31
	            ans = Integer.MIN_VALUE;
	
	 return (int) ans;
	}
	
	public static void main(String[] args) {
		
		System.out.println(
		myAtoi(" "));
	}

}
