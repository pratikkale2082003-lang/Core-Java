package Multithreading;

public class thread_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1  = new Thread(); // create object of thread class        
		
		 t1.setName("Audio_thread");                                      //  1
		 System.out.println("name : " + t1.getName());    //                  2
		 
		 
		  t1.setPriority(3);
		  System.out.println("priority : " + t1.getPriority());            // 3
		  System.out.println("id : " + t1.getId());              //           4
		  System.out.println("Min : " + Thread.MIN_PRIORITY);//               5
		  System.out.println("Max : " + Thread.MAX_PRIORITY); //              6
		  System.out.println("Norm : " + Thread.NORM_PRIORITY ); //           7
		  System.out.println("isAlive : " + t1.isAlive());       //           8
		  System.out.println("isVirtual :  "  +t1.isVirtual());//             9
		  System.out.println("isDaemon : " + t1.isDaemon());    //           10
		 
	}
 
}
