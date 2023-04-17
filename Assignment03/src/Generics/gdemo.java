package Generics;

public class gdemo {
	public static void main(String[] args) {
		gclass<String> g =new gclass<String>("Nithin");
		g.printType();
		gclass<Boolean> ge = new gclass<Boolean>(Boolean.TRUE);
		ge.printType();
	}

}
