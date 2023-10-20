package amazonRecentViews;

import java.util.LinkedList;
import java.util.List;

public class RecentViews {
	
	
	public static List<String> updateRecentlyViewedItems(List<String> logs) {
			LinkedList<String> list = new LinkedList<>();
			
			for(String item: logs) {
				if(list.contains(item)) {
					list.remove(item);
				}
				list.addFirst(item);
			}
			return list;
    }

    public static void main(String[] args) {
        List<String> logs = List.of("Echo Show8", "Kindie Oasis", "Echo Show8","Fire TV Stick", "Echo Show8");
        List<String> result = updateRecentlyViewedItems(logs);
        System.out.println("Recently Viewed Items: " + result);
    }

}
