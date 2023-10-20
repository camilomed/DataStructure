package sortSummarry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class sortSummary {
	
	public static List<List<Integer>>  groupSort(List<Integer> arr){
		 List<List<Integer>> result= new ArrayList<>();
		  Collections.sort(arr);
		  int count =0;
		 for (int i = 0;i<arr.size()-1;i++) {
			 
			 count++;
			 if(arr.get(i)!=arr.get(i+1)) {
				 List<Integer> list= new ArrayList<>();
				 list.add(arr.get(i));
				 list.add(count);
				 result.add(list);
				 count =0;
			 }
			 if(i==arr.size()-2) {
				 count++;
				 List<Integer> list= new ArrayList<>();
				 list.add(arr.get(i+1));
				 list.add(count);
				 result.add(list);
				 
			 }
		 }
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
