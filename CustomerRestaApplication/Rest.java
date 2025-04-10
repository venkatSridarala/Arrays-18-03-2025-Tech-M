package Collections;
import java.util.HashMap;
import java.util.Set;
public class Rest {
	HashMap<String, Integer> menu=null;
	Rest(){
		menu=new HashMap<String,Integer>();
		menu.put("Idly", 40);
		menu.put("Dosa", 70);
		menu.put("Upma", 35);
	}
	void showMenu() {
		Set<String> food=menu.keySet();
		System.out.println("The Food Items Are:");
		for(String f:food) {
			System.out.println(f+" Item Price Is "+menu.get(f));
		}
	}
	boolean addFoodItem(String fName, int price) {
		if(menu.containsKey(fName)) {
			System.out.println("The Item Is Already Present.");
			return false;
		}
		else {
			menu.put(fName, price);
			System.out.println("Items Added Successful");
			return true;
		}
	}
}
