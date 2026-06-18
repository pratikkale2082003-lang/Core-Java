package task;

// multiple  thread single task
public class ThreadTask3 extends Thread {

	 public void run() {
		 System.out.println("Hello Students ");
	 }
	 
	  public static void main(String[] args) {
		  ThreadTask3 th = new  ThreadTask3();
		  ThreadTask3 th1 = new   ThreadTask3();
		  ThreadTask3 th2 = new  ThreadTask3();
		  
		   th.start();
		   th1.start();
		    th2.start();
		    
	}
}
