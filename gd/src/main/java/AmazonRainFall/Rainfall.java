package AmazonRainFall;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rainfall {


    public static void main(String[] args) {
		int[] days= {1,1,1,1,1,1,1,1,1,1};
		getDay(days,3);
	}

	private static Integer[] getDay(int[] days, int k) {
		List<Integer> list = new ArrayList<>();
		for (int i=k;i<days.length;i++) {
			boolean isday= true;
			int l =i-k;
			int r=(i+k);
			
			if(r>=days.length) break;
			while(r>l) {
				
				if (days[l]>=days[l+1] && days[r-1]<=days[r]) {
					l++;
					r--;
				}else {
				isday= false;
				l=Integer.MAX_VALUE;
				}
				
				}
			if (isday) {
				
				list.add(i+1);
			}
			
			
			
		}
		System.out.println(list.toString());
		return list.toArray(new Integer[list.size()]);
		
	}
}
