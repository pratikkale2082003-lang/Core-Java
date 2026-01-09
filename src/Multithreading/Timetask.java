package Multithreading;

public class Timetask  extends Thread{


	 void secand() {
		 System.out.println("Second : 1 to 60 sec.......");
	 }
	
	void  Minute() {
		 System.out.println("Minute : 1 to 60 min.......");
	}
	
	 void Hour() {
		 System.out.println("Hour  : 1  to 24 hour.......");
	 }
	
	
	 public void run() {
		 secand();
		 Minute();
		 Hour();
	 }
	
	
	
	public static void main(String[]
			args) {
		
		Timetask  t = new  Timetask();
		t.start();
		

	}

}
