

package collectionframework;

//1) SimpleQueue  :  First in first out  order
import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {
 public static void main(String[] args) throws InterruptedException {
	
	 Queue a = new LinkedList();
	 
	  a.add("pratik");
	   a.add(10);
	   a.add(45.7);
	   
	    System.out.println( "before : " + a);
	   
	    System.out.println("peek : "+  a.peek());
 }
}
