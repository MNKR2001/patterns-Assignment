package differences;

public class finallydemo {
	public static void main(String[]args) {
		try {
			System.out.println("inside block");
			int n = 50/0;
			System.out.println(n);
		}
		catch (ArithmeticException e) {
			System.out.println("Excdeption handled");
			System.out.println(e); 
		}finally {
			System.out.println("finally is excecuted");
		}
		System.out.println("remaining code");
	}

}
