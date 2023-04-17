package StringclassandBuffer;

public class Stringcandb {
	public static void main(String[]args) {
		String str = "Hello";
		str += " world"; 
		System.out.println(str); 

		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" world"); 
		System.out.println(sb.toString()); 

	}

}
