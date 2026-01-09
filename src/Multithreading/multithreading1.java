package Multithreading;
//package theard clas : java.lang.Thread

// exetends the thread class 
public class multithreading1  extends Thread{

//	2.  overide run mathed  write down  the run  method for particular subtask
	public void run() {
		
//		int c = 10/ 0;
		
	
		System.out.println("thread 1 is running ...............");
		
	}
	 public static void main(String[] args) {
//		 3. create the object of class
		 multithreading1 m = new multithreading1();
		 
//		 4.execute the thread
//		  m.run();
		 
	System.out.println(m.getState());
		 
		m.start(); //one time only run step
 System.out.println(m.getState());
 System.out.println("is alive for first time : " + m.isAlive());

 System.out.println("is alive for  second  time : " + m.isAlive());
System.out.println(m.getState());	

	}
}
