import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class ImmutableDemo {
	
	public static void main(String[] Args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		
		 System.out.println("Initial list: "+ list);
		
		//creating an immutable list from arraylist
		List<Integer> immutablelist = Collections.unmodifiableList(list);
		
		immutablelist.add(30);
	}

}
