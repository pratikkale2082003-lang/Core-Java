package collectionframework;


import java.util.PriorityQueue;
import java.util.Queue;

//1) Priority  Queue :  its  does not follows strict FIFO.
public class PriorityQueue1 {

	public static void main(String[] args) {
		Queue q = new  PriorityQueue();
		
		  q.add(50);
		  q.add(100);
		  q.add(30);
		  
		   System.out.println( " PriorityQueue  : " + q);
             System.out.println( "head  elements : " + q.peek());
           
	}

}
