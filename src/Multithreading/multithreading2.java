package Multithreading;

 

public class multithreading2  implements  Runnable{ // implement  Runable  interface

	@Override
	public void run() {       // override run method
		
		 System.out.println(" hello");
		
	}
	 public static void main(String[] args) {
	
		 multithreading2 th =  new multithreading2();// create the object
		 
		 Thread th1 = new Thread(th); // creating the object of thread class
		 
		th1.start(); // execute of start method 
	}

}