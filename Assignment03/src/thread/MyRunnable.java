package thread;

public class MyRunnable implements Runnable{
	public void run() {
        System.out.println("Thread started");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

	}

}
