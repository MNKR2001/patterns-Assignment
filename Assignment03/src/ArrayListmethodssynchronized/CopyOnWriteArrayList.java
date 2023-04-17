package ArrayListmethodssynchronized;

public class CopyOnWriteArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList synchronizedList = new CopyOnWriteArrayList();
        synchronizedList.add(1);
        synchronizedList.add(2);
        synchronizedList.add(3);
        System.out.println("Synchronized List: " + synchronizedList);

	}

	private void add(int i) {
		// TODO Auto-generated method stub
		
	}

}
