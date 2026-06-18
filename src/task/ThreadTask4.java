package task;

 class  multiplethread   extends Thread{
	  public  void run () {
		  
		   System.out.println("Thread 2....");
	  }
 }
public class ThreadTask4 extends Thread {

	 public  void run() {
		 
		  System.out.println("Thank  You !........");
		 
	 }
	  public static void main(String[] args) {
		  ThreadTask4  th = new ThreadTask4();
		   th.start();
		   multiplethread  ob2 = new multiplethread();
		   ob2.start();
	}
}
