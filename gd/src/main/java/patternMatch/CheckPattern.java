package patternMatch;

public class CheckPattern {
	 public static boolean isMatch(String s, String p) {

	        for (int i=0; i< s.length();i++){

	            if(s.charAt(i)!=p.charAt(i) && p.charAt(i)!='.'&& p.charAt(i)!='*'){
	                return false;
	            }
	            if(p.charAt(i)=='*'){
	                return true;
	            }
	            if(s.length()>p.length() && p.charAt(i)!='*') {
	            	return false;
	            }
	        }
	        return true;
	    }
	 
	 public static void main(String[] args) {
		 System.out.println(
		isMatch("abc", "a*a*b"));
	}

}
