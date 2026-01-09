package collectionframework;

import java.util.HashSet;

//set : - does not alllow  duplicate element.abstract
// does not maintain insertion order.

//HashSet : stores  element using hashing use HashMap internallay
//           Does not maintain  order of elements
// Allows one null value
//  fast perforamce for add , remove, and search operation

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> a = new HashSet<String>();  
		a.add("Apple");
		a.add("Banana");
		a.add("mango");
		a.add("komal");
		a.add("Apple"); //duplicate value is ignored
		
		 System.out.println(a);
				
		
	}

}

