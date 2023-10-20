package tercerMayor;

public class thirdLarge {
	
	
	public static void main(String[] args) {
		
		int [] large = {98,8,90,67,82,21,90};
		
		largeNum(large);
	}






static public   void  largeNum(int [] arr) {
	
	if (arr.length < 3) {
        System.out.println("There are not enough elements in the array to find the third largest number.");
    } else {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if (arr[i] > thirdMax && arr[i] != firstMax && arr[i] != secondMax) {
                thirdMax = arr[i];
            }
        }

        System.out.println("The third largest number is: " + thirdMax);
}
}
}
