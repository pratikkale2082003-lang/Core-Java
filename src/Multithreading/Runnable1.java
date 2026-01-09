package Multithreading;

public class Runnable1  implements  Runnable {// implements  Runnable  interface

public void run() {// override run method
	
	 System.out.println(" hello java");
	
}
public static void main(String[] args) {

	Runnable1 ob = new Runnable1();// create the object
	
	Thread th = new Thread(ob); // creating the object of thread class
	
	th.start();// execute of start method 
}
}



