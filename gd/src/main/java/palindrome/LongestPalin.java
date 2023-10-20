package palindrome;

public class LongestPalin {
	
	public static String longestPalindrome(String s) {
		
		int max=0;
		String palind="";
int l=0;
int r=0;

			for(int i =0; i< s.length();i++){
				int sub1 = expand(s, i,i);
				int sub2 = expand(s,i,i+1);

				int len = Math.max(sub1,sub2);
				 if (len > r - l) {
		                l = i - (len - 1) / 2;
		                r = i + len / 2;
		            }
		        }

		        return s.substring(l, r + 1);

    }


		public static int expand(String s , int l , int r){

					while ( l>=0 && r < s.length() && s.charAt(l)==s.charAt(r)){
							l--;
							r++;				
		}


				return r-l-1;
		}
	   
	   public static void main(String[] args) {
		System.out.println(
		   longestPalindrome("babad"));
	}

}
