package Multithreading;

public class Synchronization1 extends Thread {
	
public void run() {
	 try {
	    	even();
	    }
	     catch(InterruptedException e ) {
//	    	System.out.print(e); 
	    	 e.printStackTrace();
	     }
}
		 public synchronized void even() throws InterruptedException {
			  for(int i =1; i<=40; i++) {
				   if(i % 2 == 0) {
					   System.out.println(Thread.currentThread().getName()+ " : " + i);
					   
				   }
			  }
		  }
		
		   
		
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			Synchronization1 t1 = new Synchronization1();
			Synchronization1 t2 = new Synchronization1();
			Synchronization1 t3 = new Synchronization1();
			
			t1.start();
			t1.join(); // wait untill thread 1 is completing the task
			System.out.println("------------------------------------------------------");
			t2.start();
			t2.join(); //wait untill thread 2 is completing task
			Thread.sleep(1000);
			System.out.println("------------------------------------------------------");
			t3.start();
		}

	}


