package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class nongeneric_colection {

	public static void main(String[] args) {
		
//		ArrayList list = new ArrayList();
		List c  = new ArrayList();
		
               c.add(50);
              c.add("pratik");
	         c.add(5.3)	;
             c.add('a');
             c.add(true);
             c.add( 2, 4587885566l);
	 System.out.println(" hetrogeneous  : "  + c);
	} 

}
