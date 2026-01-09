package collectionframework;
//Queue =  in java data structure used to stores  elements FIFO First in First Out)


import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	 public static void main(String[] args) {
		
		 Queue<String> q = new LinkedList();
		 
		 q.add(" sushant");
		 q.add(" shruti ");
		 q.add("sopan" );
		 
		  System.out.println("Queue elements :  " + q);
	}
}
