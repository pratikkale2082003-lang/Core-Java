package collectionframework;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String [] args) {
		ArrayDeque<Integer> d = new ArrayDeque<>();
		
		 d.add(12);
		 d.add(20);
		 d.add(30);
		 d.add(40);
		 
		 System.out.println("Deque : " + d);
		  System.out.println("First : "  + d.getFirst());
		  System.out.println("Last : " + d.getLast());
		 d.removeFirst();
		 d.removeLast();
		 System.out.println("After Deque : " + d);
	}
}
