package Multithreading;

//multiple thread   single task


public class threadtask3 extends Thread{
	
	public void run() {

		System.out.println(" hello student ");
	}
	
	

	public static void main(String[] args) {
		
		threadtask3 th = new threadtask3();
		threadtask3 th2 = new threadtask3();
		threadtask3 th3 = new threadtask3();
		
	
		 th.start();
		th2.start();
		th3.start();
		
		 
	}

}
