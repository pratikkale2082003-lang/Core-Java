package collectionframework;

import java.util.Vector;

// vector is syncronized
public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<Integer> r = new Vector<Integer>();

r.add(45);
r.add(50);
r.add(80);

// iterate the  object of  collection the value of index 1 to 60


 System.out.println(" before " + r);
 
  r.set(1, 60);
  
  System.out.println(" after " + r);
	}

}
