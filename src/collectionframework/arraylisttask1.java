package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;



public class arraylisttask1 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		a.add(" lotus");
		a.add("sunflower");
		a.add("rose");
		a.add("marigold");
		a.add("Hibiscus");
		a.add("daisy");
		a.add("Lily");
		
	
//		
		 System.out.println( " before  " + a);
//	a.remove("rose");
		 
//		 
////		 2 nd step
//		 Iterator it = a.iterator();
//		 
//		 while(it.hasNext()) {
//		 
////		 System.out.println(it.next());
//		 
//		  String flower =  (String) it.next();
//		  
//		  if (flower.equals("rose")) {
//			  it.remove();
//		  }
//		 }
//third step
	
	Iterator it = a.iterator();
	
	 for (int i = 0; i< a.size(); i++) {
		 
		 if(a.get(i).equals("rose")) {
		 a.remove(i);
		 i--;
	 }
	
	}
	
	
	

	 System.out.println( " after " + a);
	}
}
