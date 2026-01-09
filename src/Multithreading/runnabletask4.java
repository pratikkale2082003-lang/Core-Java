package Multithreading;
// multiple  runnable multiple task
 class subrunnable implements Runnable{


	public void run() {
	  System.out.println(" Excute  Runnable 2............");
		
	}
	 
 }
public class runnabletask4 implements Runnable {

	public void run() {
		System.out.println(" Runnable 1");
		
	}
	 public static void main(String[] args) {
	
		 runnabletask4 ob = new runnabletask4();
		 
		 Thread th = new Thread(ob);
		 th.start();
		 
		 subrunnable ob1 = new subrunnable();
		 
		 Thread th1 = new Thread(ob1);
		 th1.start();
	}

}
