package hashtableandmap;

import java.util.HashMap;
import java.util.Hashtable;

public class hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> hashtable = new Hashtable<>();
		hashtable.put("key1", "value1");
		hashtable.put("key2", "value2");
		hashtable.put("key3", "value3");
		String value = hashtable.get("key2");
		System.out.println(value);
		
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("key1", "value1");
		hashMap.put("key2", "value2");
		hashMap.put("key3", "value3");
		String v = hashMap.get("key2");
		System.out.println(v);

	}

}
