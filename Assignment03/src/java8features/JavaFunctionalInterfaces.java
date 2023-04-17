package java8features;

public class JavaFunctionalInterfaces {
	interface MvFunctionalInterface {
		public int addMethod(int a, int b);
	}
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		MvFunctionalInterface sum = (a, b) -> a + b;
		System.out.println("Result: "+sum.addMethod (12, 100));
	}

}
