package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class nongeneric1 {

	public static void main(String[] args) {
		
		//		ArrayList list = new ArrayList();

		
		List a = new ArrayList();
		 a.add(10);
		 a.add("pavan");
		 a.add(7.2);
		 a.add('d');
		a.add(true);
		  a.add(2,4578995555656l);
		  a.addFirst("pune");
		  a.addLast("mumbai");
		 
		  
		  System.out.println("contains  : " + a.contains("pune"));
//		 a.clear();
//		System.out.println( " remove  : " + a.remove(7.2));  
		  a.get(1);
		  a.getFirst();
		  a.getLast();
		  
		  System.out.println( " get : " + a.get(5));
			
		  System.out.println( " index off : " + a.indexOf("mumbai"));
		  
		  System.out.println(" getlast : " + a.getLast());
		  System.out.println( " getfirst : " + a.getFirst());
		  System.out.println(" is empty : " + a.isEmpty());
		  System.out.println( " last indexof : " + a.lastIndexOf("pavan"));
		  System.out.println("remove(by index) : "  + a.remove(2) );
		  System.out.println("remove(byobject) : " + a.remove(2));
		  System.out.println( "removefirst : "  + a.removeFirst());
		  System.out.println("removelast : " + a.removeLast());
//		  System.out.println( "set : " + a.set(4, 7));
//		  System.out.println( "sort : " + a.sort(5));
		  System.out.println( "size : " + a.size());
 
		  
		 System.out.println( "hetrogeneus : " + a);
	}

}
