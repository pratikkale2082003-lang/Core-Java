package Multithreading;

public class threadtask9  extends Thread{

	  void  count(){
		  
		   int n = 12456;
		   int count = 0;
		    while(n > 0) {
		    	n = n/10;
		    	count++;
		    }
		   System.out.println( count);
	  }
	public void run() {
		count();
	}
	 public static void main(String[] args) {
		
		  threadtask9 th = new threadtask9();
		  th.start();
		  
	}
}
