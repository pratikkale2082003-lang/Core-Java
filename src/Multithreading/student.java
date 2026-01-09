package Multithreading;

public   class student implements Runnable{


	public void run() {
		// TODO Auto-generated method stub
		
		 System.out.println(" most intelleigents studebrs");
	}
	 public static void main(String[] args) {
		 student s = new student ();
		
		  Thread th = new Thread(s);
		  th.start();
		 
	}

}
