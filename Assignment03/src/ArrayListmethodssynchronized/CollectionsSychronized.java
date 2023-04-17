package ArrayListmethodssynchronized;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSychronized {
	public static void main(String[] args) {
		 List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<Integer>());
	        synchronizedList.add(1);
	        synchronizedList.add(2);
	        synchronizedList.add(3);
	        System.out.println("Synchronized List: " + synchronizedList);
		       

	}

}
