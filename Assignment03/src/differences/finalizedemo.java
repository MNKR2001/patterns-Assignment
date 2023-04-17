package differences;

public class finalizedemo {
	public static void main(String[]args) {
		finalizedemo obj = new finalizedemo ();
		System.out.println("Hashcode is: " + obj.hashCode ());
		obj = null;
		System.gc();
		System.out.println("End of the garbage collection");
	}
	protected void finalize()
	{
	System.out.println("Called the finalize() method");
	}
}
