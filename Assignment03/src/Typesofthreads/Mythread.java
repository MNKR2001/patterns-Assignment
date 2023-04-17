package Typesofthreads;

public class Mythread extends Thread {
    public void run() {
        System.out.println("Thread started");
    }
    public static void main(String[] args) {
        Mythread thread = new Mythread();
        thread.start();
    }
}