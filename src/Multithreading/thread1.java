package Multithreading;

public class thread1 extends Thread {

	  void play() {
		  System.out.println("cricket");
	  }
	
	
	 public void run() {
		 play();
		  System.out.println("you can go to play...");
	 }
	public static void main(String[] args) {
		
		 thread1  th = new  thread1();
		 th.start();
		
	}

}
