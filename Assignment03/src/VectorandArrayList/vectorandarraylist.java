package VectorandArrayList;

import java.util.ArrayList;
import java.util.Vector;

public class vectorandarraylist {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("Vector: " + vector);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("cherry");
        System.out.println("ArrayList: " + arrayList);
	}
}

