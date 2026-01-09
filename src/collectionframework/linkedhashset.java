package collectionframework;

//LinkedHashSet :  it s is child class of HashSet.
//                   maintains insertion  order
//                   Allows one null elements


import java.util.LinkedHashSet;

public class linkedhashset {
public static void main(String[] args) {
	LinkedHashSet l = new LinkedHashSet();
	
	 l.add(" pavan");
	 l.add(10);
	 l.add(true);
	 l.add('c');
	 l.add(null);
	
	 System.out.println( "LinkedHashSet : " +l);
}
}
