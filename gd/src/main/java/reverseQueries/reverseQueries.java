package reverseQueries;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
public class reverseQueries {

	
    public static List<Integer> performOperations(List<Integer> arr, List<List<Integer>> operations) {
    	for (List<Integer> op: operations) {
    		List<Integer> sublist = arr.subList(op.get(0), op.get(1));
    		Collections.reverse(sublist);
    		
    	}
    	System.out.println(operations);
		return arr;
    }
	
	  public static void main(String[] args) throws IOException {
		  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        List<Integer> arr = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0);

	        int operationsRows = 6; // number of operations

	        List<List<Integer>> operations = new ArrayList<>();

	        // Adding operations
	        operations.add(Arrays.asList(4, 5));
	        operations.add(Arrays.asList(3, 6));
	        operations.add(Arrays.asList(2, 7));
	        operations.add(Arrays.asList(1, 8));
	        operations.add(Arrays.asList(0, 9));

	        List<Integer> result = reverseQueries.performOperations(arr, operations);

	        // Print the result to the console
	        System.out.println(result.stream().map(Object::toString).collect(Collectors.joining(" ")));

	        bufferedReader.close();
	    }
}
