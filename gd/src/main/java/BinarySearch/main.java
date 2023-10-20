package BinarySearch;

public class main {

	
		public static void main(String[] args) {
			
			
//			int arr[]= {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
			int arr[]= {5,15,20,25,30,35};
			BinarySearch2 bs = new BinarySearch2();
			int end = arr.length;
			
			int answ =bs.search(arr,5);
			int arr1[]= {1,2,3,4,5,6,7,8,9,10,11};
			int arr2[]= {1,2,3,4};
			
			mergeBinary m = new mergeBinary(); 
			System.out.println(
			m.findMedianSortedArrays(arr1, arr2));
			System.out.println(answ);
		}

}
