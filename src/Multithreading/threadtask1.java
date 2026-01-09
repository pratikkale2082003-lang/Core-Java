package Multithreading;

// single thread single task
public class threadtask1 extends Thread {

	public void run() {
		int n = 5;
		
		 for (int i = 1; i<=10; i++) {
			 System.out.println(n + " x " + i + " = " + (n * i));
		 }

		
	}
	public static void main(String[] args) {
		threadtask1  ob = new threadtask1();
		ob.start();
		
	}
}
