package Multithreading;

public class ThreadClass extends Thread {

	   public  void  run() {
		   
		    System.out.println("Mangul Zanak Is Beatiful Place of the Earth");
	   }
	   
	    public static void main(String[] args) {
			
	    	ThreadClass th = new ThreadClass();
	    	th.start();
		}
}
