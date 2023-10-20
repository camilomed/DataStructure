package zigzag;

import java.util.Arrays;

public class ZigzagSol {
	 public static String convert(String s, int numRows) {
	     

		 StringBuilder [] strB= new StringBuilder[numRows];
  for (int i = 0; i < numRows; i++) {
            strB[i] = new StringBuilder();
        }
int row=0;
int dirrection=1;
		 for (int i=0;i<s.length();i++){

			 strB[row].append(s.charAt(i));
			 
			 if(row<numRows && dirrection ==1){
				
				 if(row+1==numRows){
					 dirrection=-1;
					 row--;
				 }else {
					 row++;
				 }
			 }else
			 if(row>=0 && dirrection ==-1){
				 
				 if(row==0){
					 dirrection=1;
					 row++;
				 }else {
					 row--;
				 }
			 }

		 }
		       StringBuilder result = new StringBuilder();
        for (StringBuilder sb : strB) {
            result.append(sb);
        }
				System.out.println(result.toString());
		 return result.toString();



	    }
	 
	 public static void main(String[] args) {
		 System.out.println(		convert("PAYPALISHIRING", 3));
	}
}
