package collectionframework;

import java.util.HashSet;

public class hashset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HashSet h = new HashSet();
		 
		  h.add(" pratik");
		  h.add(45.21);
		  h.add(94.67);
		  h.add("mahesh");
	
		  
		  
		   System.out.println(" HashMap : " + h );
		    h.clear();
		    System.out.println("After Hashmap : " + h);
		    
		    System.out.println(" is empty : " + h.isEmpty() );
	}

}
