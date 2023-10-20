package sumComp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sum4 {

	
	 public static List<List<Integer>> fourSum(int[] nums, int target) {
	        if(target<Integer.MIN_VALUE|| target> Integer.MAX_VALUE) return  new ArrayList<>();
         int size = nums.length;
             Arrays.sort(nums);

             Set<List<Integer>> hash = new HashSet<>();
             
             outloop:
         for(int i=0; i<size-3;i++){

             for (int j=i+1;j<size-2;j++){

                 int l = j+1;
                 int r= size-1;

                 while(l<r){
                    
                     long sum= (long)nums[i]+nums[j]+nums[l]+nums[r];
                     if(sum<Integer.MIN_VALUE|| sum> Integer.MAX_VALUE) break outloop;

                     if(sum==target){
                          List<Integer> list = new ArrayList<>();
                         list.add(nums[i]);
                         list.add(nums[j]);
                         list.add(nums[l]);
                         list.add(nums[r]);
                         hash.add(list);
                         l++;
                         r--;
                     }else if(sum>target){
                             r--;
                     }else{
                         l++;
                     }
                 }
             }
         }
         return new ArrayList<>(hash);
 }
	 public static void main(String[] args) {
		
		 int[] nums = {0,0,0,1000000000};

	        List<List<Integer>> result = fourSum(nums,1000000000);
	        System.out.println(result);
	}
}
