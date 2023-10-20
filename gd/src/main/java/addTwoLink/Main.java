package addTwoLink;

public class Main {
	
	public static void main(String[] args) {
		   AddLinked solution = new AddLinked();

	        // Creating example input lists: l1 = 2 -> 4 -> 3 and l2 = 5 -> 6 -> 4
	        ListNode l1 = new ListNode(1, new ListNode(8, new ListNode(3)));
	        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

	        // Calling addTwoNumbers method
	        ListNode result = solution.addTwoNumbers(l1, l2);

	        // Printing the result
	        while (result != null) {
	            System.out.print(result.val + " -> ");
	            result = result.next;
	        }
	       
	}
}
