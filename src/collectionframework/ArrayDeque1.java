package collectionframework;

import java.util.*;


//3)  Deque (Double Ended Queue) =   you can insert and remove element from both end
public class ArrayDeque1 {

	
	 public static void main(String[] args) {
		
		 Deque<String> d = new ArrayDeque<>();
		 d.add("pratik");
		  d.add("manish");
		  d.add("sanket");
		  d.add("prashant");
		  System.out.println("Deque : "+ d);
		  
		   d.removeFirst();
		   d.removeLast();
		   System.out.println(" After Deque : "+ d);
	}
}

//addFirst()	  Front ला element add करतो
//addLast()  	  Rear ला element add करतो
//removeFirst()	  Front मधून remove करतो
//removeLast()	  Rear मधून remove करतो
//peekFirst()    	Front element पाहतो
//peekLast()	  Last element पाहतो