package sortArray;

import java.util.Arrays;
import java.util.stream.Stream;

public class sortArray {

	
	public static void main(String[] args) {
		int [] num= {8,3,2,6,-5,10};
		sort(num);
	}

	private static void sort(int[] num) {
		// TODO Auto-generated method stub
		
		for(int i =0;i<num.length;i++) {
			
			int tmp=0;
			for(int j=i+1;j<num.length;j++) {
			
				if(num[i]>num[j]) {
					tmp= num[i];
					num[i]=num[j];
					num[j]=tmp;
				}
			}
		}
		Arrays.stream(num).forEach(System.out::println);
		
		
	}
}
