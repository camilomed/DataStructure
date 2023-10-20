package sumComp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sumcomp {
	public static List<List<Integer>> threeSum(int[] nums) {

	    if (nums == null || nums.length < 3) return new ArrayList<>();


		Set<List<Integer>> finalList = new HashSet<>();
		
		  
		Arrays.sort(nums);
		
		
		for (int i=0; i <nums.length-2;i++) {
			int point= nums[i];
			int l= i+1;
			int r= nums.length-1;
			
			while(l<r) {
				int sum=point+nums[l]+nums[r];
				if(sum==0) {
					List<Integer> list = new ArrayList<>();
					list.add(point);
					list.add(nums[l]);
					list.add(nums[r]);
					finalList.add(list);
//					finalList.add(Arrays.asList(point,nums[l],nums[r]));
					l++;
					r--;
					
				}else if(sum<0) {
					l++;
				}else if(sum>0) {
					r--;
				}
			}
		}
		



    	
        
   return removeDuplicateArrays(new ArrayList<>(finalList));
 
}
	
	   public static List<List<Integer>> removeDuplicateArrays(List<List<Integer>> listOfLists) {
	        List<List<Integer>> uniqueLists = new ArrayList<>();
	        for (List<Integer> list : listOfLists) {
	            if (!uniqueLists.contains(list)) {
	                uniqueLists.add(list);
	            }
	        }
	        listOfLists.clear();
	        listOfLists.addAll(uniqueLists);
	        return listOfLists;
	    }
	public static void main(String[] args) {
		 int[] nums = {-1, 0, 1, 2, -1, -4};

	        List<List<Integer>> result = threeSum(nums);
	        System.out.println(result);
	}

}
