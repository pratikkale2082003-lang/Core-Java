package task;


// one thread  And One Task
public class ThreadTask1  extends Thread {

 public  void run() {
	 
	   int n = 4;
	   
	    for (int i =1; i<=10; i++) {
	    	System.out.println(n +" x "+i + " = " + (n*i));
	    	
	    }
 }
  public static void main(String[] args) {
	  ThreadTask1 th = new ThreadTask1();
	  th.start();
}
}
