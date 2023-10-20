package contianer;

import java.util.HashMap;

public class calculateWater {
	public static  int maxArea(int[] height) {

		HashMap<Integer,Integer> murralla = new HashMap<>();
			
			murralla.put(0,height[0]);
		int contador =0;
		int max=0;

		for ( int i =0;i<height.length;i++){
			int barrier= murralla.get(contador);
			int lastBarrier= height[i];
				if(barrier<height[i]){
						murralla.put(i,height[i]);
						contador++;
						}

			int min =  Math.min(barrier,lastBarrier);
						
						if(min*(i-contador)>max){
							max=min*(i-contador);
						}
			
		}
		return max;
    
}
	
	
	public static void main(String[] args) {
		int[] m = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(m));
	}
}
