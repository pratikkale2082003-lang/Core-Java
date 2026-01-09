package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class generic1 {

	 public static void main(String[] args) throws InterruptedException {
		
		 ArrayList<String> a = new ArrayList<String>();
		 
		  a.add("pratik");
		  a.add("nikita");
		  a.add("sneha");
		  a.add("vaishnvi");
		  a.add("akshay");
		  a.add("kartik");
	
		  
		  
		 
		  System.out.println("before generic collection : " + a);
		   a.sort(null);
		   System.out.println("\nafter generic collection : " + a);
		   
		   Iterator it = a.iterator();
		    while(it.hasNext()) {
		    	System.out.println(it.next());
		    	Thread.sleep(2000);
		    }
	}
}
