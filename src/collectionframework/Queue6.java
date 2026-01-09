package collectionframework;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q = new ArrayDeque();
		
		q.add("mouse");
		q.add(900);
		q.add("boottol");
		q.add(56.255);
	System.out.println( "queue is : " + q);
		
	System.out.println(" head element : " + q.element());
	
	q.add("%");
	
	 System.out.println("after Queue is : " + q );
	 
	 
	  System.out.println( "peek  : " + q.peek());
	   System.out.println("after  peek " + q);
	   
	    System.out.println("poll : " + q.poll());
	     System.out.println("after poll queue is : " + q);
	}

}
