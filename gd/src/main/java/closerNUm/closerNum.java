package closerNUm;

import java.util.Arrays;
import java.util.HashMap;

public class closerNum {
	 public static int threeSumClosest(int[] nums, int target) {
		 int differMin= Integer.MAX_VALUE;
		 
		 Arrays.sort(nums);
		 int result =0;


		 
		 			for (int i =0; i<nums.length-2;i++){

		 				int pointer= nums[i];
		 				int l= i+1;
		 				int r= nums.length-1;
		 				
		 				while (l<r) {
		 					int sum = pointer+nums[l]+nums[r];
		 					int diffAct= Math.abs(target-pointer-nums[l]-nums[r]);
		 					if(sum==target) return sum;
		 					if(sum>target) {
		 						r--;
		 					}else  {
		 						l++;
		 					}
		 					
		 					
		 					if(diffAct<differMin) {
		 						result= sum;
		 						differMin= diffAct;
		 					}
		 				}

		 				
		 			}
		         return result;
		     }
	 
	 public static void main(String[] args) {
		
		 int [] nums = {2,3,8,9,10};
		 System.out.println(
		 threeSumClosest(nums, 16));
	}

}
