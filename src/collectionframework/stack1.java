package collectionframework;

import java.util.Stack;

public class stack1 {

	 public static void main(String[] args) {
		Stack s = new Stack();
		
		 s.push("pavan");
		 s.push(10);
		 s.add(6.3);
		 s.push(true);
		 s.add("#");
		
		 System.out.println( "Stack is " + s);
		  s.pop();
		
		  System.out.println( "After pop Stack is :  " + s);
		  s.remove(0);
		   System.out.println(" is stack is empty : " + s.empty());
		   
		    System.out.println("capcity  of stack : " + s.capacity());
		     System.out.println(" after peek stacks. : " + s.peek() );
		      System.out.println("search : " + s.search(true));
	}
}
