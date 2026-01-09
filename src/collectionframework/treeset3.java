package collectionframework;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset3 {

	 public static void main(String[] args) throws InterruptedException {
		TreeSet<String> t = new TreeSet<>();
		t.add("ladu");
		t.add("barfi");
		t.add("shankarpale");
		t.add("gulabjambun");
		t.add("chakali");
		t.add("pedha");
		t.add("jalebi");
		System.out.println("sweet are : " + t);
		
//		  decending set, iterator, clear, getfirst, getlast.
	
		
	
//		 decending set
//		 System.out.println(" after sweet are : " +  t.descendingSet());
		 
		System.out.println(" size : " + t.size());
		 System.out.println( " floor : " + t.floor("ganjar halwa"));
		 System.out.println(" first : " + t.getFirst());
		 System.out.println(" lt.ower : " + t.lower(" rasmalai"));
		 System.out.println( " higher : " + t.higher("bundi"));
		 System.out.println( " last : " + t.getLast());
		 System.out.println( " pollfirst : " + t.pollFirst());
		 System.out.println(" polllast  : " + t.pollLast());
//		 System.out.println(" remove : " + t.remove(1));
		 System.out.println(  " subset : " + t.subSet("gulabjambun", "ladu"));
//		 System.out.println(t.su);
		 System.out.println( "tailset : " + t.tailSet("gulabjambun") );
		 System.out.println("isempty : " + t.isEmpty());
		 System.out.println( " after sweet : " + t);
			
	 
	 Iterator i = t.iterator();
	 while(i.hasNext());
	 System.out.println(i.next());
		  Thread.sleep(4000);
		  
	}
	 
	 
}
