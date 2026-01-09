package Multithreading;
//Synchronization : -is used to prevent two threads from accessing the same data at the same time.
public class Synchronization  extends Thread{

	 public void run() {
		  for(int i =1; i<40; i++) {
			   if(i % 2 == 0) {
				   System.out.println(Thread.currentThread().getName()+ " : " + i);
				   
			   }
			
			    try {
			    	Thread.sleep(1000);
			    }
			     catch(InterruptedException e ) {
			    	System.out.print(e); 
			     }
		  }
	 }
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Synchronization t1 = new Synchronization();
		Synchronization t2 = new Synchronization();
		
		t1.start();
		t1.join();
		System.out.println("------------------------------------------------------");
		t2.start();
		
		
	}

}
