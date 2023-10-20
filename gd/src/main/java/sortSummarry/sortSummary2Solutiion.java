package sortSummarry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sortSummary2Solutiion {

	
	public static List<List<Integer>>  groupSort(List<Integer> arr){
		
		 List<List<Integer>> result= new ArrayList<>();
		HashMap<Integer, Integer> frec = new HashMap<>();
		
		for (int num : arr) {
			frec.put(num, frec.getOrDefault(num, 0)+1);
		}
		System.out.println(frec);
		
		for(Map.Entry<Integer, Integer> entry : frec.entrySet()) {
			List<Integer> list= new ArrayList<>();
			list.add(entry.getKey());
			list.add(entry.getValue());
			result.add(list);
		}
		
		Collections.sort(result, (a,b) ->Integer.compare(a.get(0), b.get(0)));
		return result;
		
		
	}
	
	public static void main(String[] args) {
		 List<Integer> list= new ArrayList<>();
		 	
	
		 list.add(5);
		 list.add(3);
		 list.add(3);
		 list.add(3);
		 list.add(3);
		 list.add(1);
		 list.add(2);
		 list.add(1);
		 System.out.println(groupSort(list));
	}
}
