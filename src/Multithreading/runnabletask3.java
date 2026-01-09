package Multithreading;

//multiple runnable single task
public class runnabletask3 implements Runnable {

	 public void run() {
		 
		 System.out.println("Multiple task executed");
	 }
	 
	 public static void main(String[] args) {
		 runnabletask3  o = new runnabletask3();
		 runnabletask3 ob = new runnabletask3();
		 runnabletask3 ob1 = new runnabletask3();
		 
		 Thread th1 = new Thread(o);
		 Thread th2 = new Thread(ob);
		 Thread th3 = new Thread(ob1);
		 
		 th1.start();
		 th2.start();
		 th3.start();
	}
}
