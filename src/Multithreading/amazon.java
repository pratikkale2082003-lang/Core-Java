package Multithreading;

public class amazon  extends Thread{

	
	 public void run() {
		 
		  System.out.println(" Shopping appp ");
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		amazon am = new amazon();
		
		am.start();
		
		
	}

}