package keyPhone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;

public class converKey {

	
//	public static int phone(String word) {
//		
//		
//
//		HashMap<String,String> conv = new HashMap<>();
//
//			conv.put("2","abc");
//			conv.put("3","def");
//			conv.put("4","ghi");
//			conv.put("5","jkl");
//			conv.put("6","mno");
//			conv.put("7","pqrs");
//			conv.put("8","tuv");
//			conv.put("9","wxyz");
//
//			HashMap<Character,String> nums = new HashMap<>();
//			StringBuilder result = new StringBuilder();
//			for(int i=0;i<word.length();i++) {
//				
//				if(nums.containsKey(word.charAt(i))) {
//					result.append(nums.get( word.charAt(i)));
//				}
//				else {
//				for (Entry<String, String> entry : conv.entrySet()) {
//					
//					if(entry.getValue().contains( String.valueOf( word.charAt(i)))) {
//						
//						nums.put( word.charAt(i),entry.getKey());
//						result.append(nums.get( word.charAt(i)));
//						System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());
//						continue;
//					}
//					}
//				}
//			}
//			
//		System.out.println(result);
//		return 0;
//	}
	
	
//	public static void main(String[] args) {
//		phone("hollagfffffffffffhsdfsfsdfsfthriubfjkwenjkfkbkjdfhollagfffffffffffhsdfsfsdfsfthriubfjkwenjkfkbkjdfhollagfffffffffffhsdfsfsdfsfthriubfjkwenjkfkbkjdfhollagfffffffffffhsdfsfsdfsfthriubfjkwenjkfkbkjdfhollagfffffffffffhsdfsfsdfsfthriubfjkwenjkfkbkjdf");
//		
//	}
	
	  public static int solveSimplified(String text) {
	        HashMap<Character, Integer> counter = new HashMap<>();
	        for (char c : text.toCharArray()) {
	            counter.put(c, counter.getOrDefault(c, 0) + 1);
	        }
	        List<Integer> values = new ArrayList<>(counter.values());
	        Collections.sort(values, Collections.reverseOrder());
	        int res = 0;
	        for (int i = 0; i < values.size(); i++) {
	            res += (i % 9 + 1) * values.get(i);
	        }
	        return res;
	    }

	    public static void main(String[] args) {
//	        System.out.println(solveSimplified("abacadefghibj"));
	        System.out.println(solveSimplified("hello"));
	    }
}
