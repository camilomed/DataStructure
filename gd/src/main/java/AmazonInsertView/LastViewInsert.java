package AmazonInsertView;
import java.util.*;



class Item {
    String name;
    int cost;
    String operationType;

    public Item(String operationType, String name, int cost) {
        this.operationType = operationType;
        this.name = name;
        this.cost = cost;
    }
}

public class LastViewInsert {
	 public static void main(String[] args) {
			
		 List<String> inventory = new ArrayList<>();

		   List<Item> operations = List.of(
				   new Item("INSERT", "fries", 4),
	                new Item("INSERT", "soda", 2),
	                new Item("VIEW", "-", -1),
	                new Item("VIEW", "-", -1),
	                new Item("INSERT", "hamburger", 5),
	                new Item("VIEW", "-", -1),
	                new Item("INSERT", "nuggets", 4),
	                new Item("INSERT", "cookie", 1),
	                new Item("VIEW", "-", -1),
	                new Item("VIEW", "-", -1)
	        );
	        
	        listcheck(operations);
	}

	private static void listcheck(List<Item> operations) {
		
		LinkedList<Item> ma = new LinkedList<>();
		int countInsert=0;
		int countView=0;
		for (int i=0;i<operations.size();i++) {
			
			if("INSERT".equals(operations.get(i).operationType)) {
				Item item = new Item("",operations.get(i).name,operations.get(i).cost);
				ma.add(item);
				countInsert++;
			}else {
				ma.sort(Comparator.comparingInt(arr -> arr.cost));
				System.out.println(ma.get(countView).name);
				countView++;
			}
			
		}
		
		
	}
}
