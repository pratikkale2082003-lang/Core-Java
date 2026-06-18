package Multithreading;

public class Runnablenterface implements Runnable {

	@Override
	public void run() {
		 System.out.println("Anuradha Engineering College Chikhli");
		
	}

	 public static void main(String[] args) {
		 Runnablenterface  r =   new Runnablenterface ();
		 
		 Thread th = new Thread(r);
		  th.start();
	}
}
