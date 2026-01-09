package Multithreading;

// single runnable  single task
public class runnabletask1  implements Runnable{

	
	@Override
	public void run() {
			int n = 5;
		
		
		 for (int i = 1; i<=10; i++) {
			 System.out.println(n + " x " + i + " = " + (n * i));
		 }
		}
	
	public static void main(String[] args) {
		
		runnabletask1 r1 = new runnabletask1();
		
		Thread th = new Thread(r1);
		th.start();
		
		
	}

	
}
