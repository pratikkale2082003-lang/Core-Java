package Multithreading;



 class Time extends Thread{
	 public void run() {
		 
		  for ( int i  = 1; i<=60; i++) {
		 
		 System.out.println(i + " second ");
	 }
 }

 }

  class times extends Thread{
	  public void run() {
			 
		  for ( int i  = 1; i<=60; i++) {
		 
		 System.out.println(i + " minute ");
	 }
 }
  }

  
  


public class throwtask6  extends Thread{

	 
		public void run() {
			 for ( int i  = 1; i<=24; i++) {
				 
				 System.out.println(i + " hour ");
			 }
		 }



	
	
	public static void main(String[] args) throws InterruptedException {
	
		throwtask6 th = new throwtask6();
		times t1 =  new times();
		Time t =  new Time();
		
		
		t.start();
		 t.join();
		 
		 
		 System.out.println("--------------------------------------------------------------------------------------------------------");
		 Thread.sleep(5000);
		t1.start();
	
		
		t1.join();
		
		System.out.println("-----------------------------------------------------------------------------------------------------");
		Thread.sleep(5000);
		th.start();
		

	}

}
