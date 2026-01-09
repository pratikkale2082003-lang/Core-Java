package Multithreading;
//multiple thread and multiple task

 class multiple extends Thread{
	 
	 public void run() {
		 System.out.println(" thread 2.....");
	 }
 }
public class threadtask4 extends Thread{

	public  void run() {
		System.out.println(" thread 1......");
		
	}
	 public static void main(String[] args) {
		
		 threadtask4 ob1= new  threadtask4();
		
		 ob1.start();
		 
		 multiple ob2 = new multiple();
		 ob2.start();
		
	}
}
