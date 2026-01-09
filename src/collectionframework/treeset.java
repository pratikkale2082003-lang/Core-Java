package collectionframework;

import java.util.TreeSet;

//TreeSet :  stores element in sorted (Ascending order);
//             does not allow null value
public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t = new TreeSet();
		
		t.add(50);
	   t.add(20);
	   t.add(30);
	   
	   System.out.println("TreeSet : " + t);
	}

}
