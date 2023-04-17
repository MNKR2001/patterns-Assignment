package Generics;

public class gclass<E> {
	private E a = null;
	
	public gclass(E p) {
		this.a = p;
	}
	public E getaReff() {
		return this.a;
	}
	public void printType() {
		System.out.println("Type: "+ a.getClass().getName());
	}

}
