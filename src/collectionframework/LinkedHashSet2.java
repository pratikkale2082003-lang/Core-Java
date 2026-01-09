package collectionframework;

import java.util.LinkedHashSet;

public class LinkedHashSet2 {

	public static void main(String[] args) {
		LinkedHashSet<String> lh =  new LinkedHashSet<>();
		
          lh.add("pavan");
          lh.add(null);
          lh.add("supesh");
          lh.add("sopan");
          
          
           System.out.println("LinkedHashSet : "+lh);
	}

}
