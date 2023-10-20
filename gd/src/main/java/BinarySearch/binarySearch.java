package BinarySearch;

public class binarySearch {

	
	public int binary(int start, int finalv ,int search, int[] arr) {
		int cent = (start+finalv)/2;
		
		if(arr[cent]==search) {
			return cent;
		}
		
		else if(arr[cent]>search) {
			System.out.println(" f" +start +" "+ cent);
			return binary(start,cent-1,search,arr);
		}else if (arr[cent]<search) {
			return binary(cent+1,finalv,search,arr);
		}
		
		
		
		
		return -1;
	}
}
