package BinarySearch;

public class mergeBinary {
	
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 
		 int aLength = nums1.length;
		 int bLength = nums2.length;
		 if (aLength>bLength) {
			 findMedianSortedArrays(nums2, nums1);
		 }
		 
		 int low= 0;
		 int high=aLength;
		 
		 while(low<high) {
			 int partitionA= (low+high)/2;
			 int partitionB= (aLength+bLength+1)/2-partitionA;
			 
			  	int maxX = (partitionA == 0) ? Integer.MIN_VALUE : nums1[partitionA - 1];
	            int maxY = (partitionB == 0) ? Integer.MIN_VALUE : nums2[partitionB - 1];
	            
	            int minX = (partitionA == aLength) ? Integer.MAX_VALUE : nums1[partitionA];
	            int minY = (partitionB == bLength) ? Integer.MAX_VALUE : nums2[partitionB];
	            
			if(maxX<=minY ) {
				 if ((aLength + bLength) % 2 == 0) {
	                    return (Math.max(maxX, maxY) + Math.min(minX, minY)) / 2.0;
	                } else {
	                    return Math.max(maxX, maxY);
	                }
	            } else if (maxX > minY) {
	                high = partitionA - 1;
	            } else {
	                low = partitionA + 1;
	            }
		 }
		 
		return 0;

	       
	        
	    }

}
