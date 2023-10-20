package checkVowels;

import java.util.ArrayList;
import java.util.List;

public class checkVowel {
	public static int solution(String pattern, String source) {
	    int count = 0;
	    int patternLength = pattern.length();
	    int sourceLength = source.length();

	    // Iterate through the source string
	    for (int i = 0; i <= sourceLength - patternLength; i++) {
	        boolean isMatch = true;

	        // Check if the current substring matches the pattern
	        for (int j = 0; j < patternLength; j++) {
	        	
	            char patternChar = pattern.charAt(j);
	            char sourceChar = source.charAt(i + j);
	            System.out.println(patternChar+ "  " + sourceChar);
//
//	            if ((patternChar == '0' && !isVowel(sourceChar)) ||
//	                (patternChar == '1' && isVowel(sourceChar))) {
//	                isMatch = false;
//	                
//	            }
	        }

	        if (isMatch) {
	            count++;
	        }
	    }

	    return count;
	}

	// Helper function to check if a character is a vowel
	private static boolean isVowel(char c) {
	    return "aeiouy".indexOf(c) != -1;
	}

	public static void main(String[] args) {
	    String pattern = "010";
	    String source = "amazinig";
	    int result = solution(pattern, source);
	    System.out.println(result); // Output should be 2
	}

	}