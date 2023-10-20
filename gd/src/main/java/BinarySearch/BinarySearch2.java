package BinarySearch;

public class BinarySearch2 {
	
	
	public static int search(int [] arr, int num) {
		
		int low=0;
		int high = arr.length-1;
		
		
		while(low<=high) {
			
			int middlePosition= (low+high)/2;
			int middleNumber= arr[middlePosition];
			
			if(num==middleNumber) {
				return middlePosition;
			}else
				if(num>middleNumber) {
					low = middlePosition+1;
				}else 
					if(num<middleNumber){
						high= middlePosition-1;
						
					}
		}
		
		return -1;
	} 
	
	

}
