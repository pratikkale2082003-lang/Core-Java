package collectionframework;

import java.util.ArrayList;

public class Arraylisttask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		
		
		a.add("buldhana");
		a.add("nagpur");
		a.add("pune");
		a.add("mumbai");
		a.add("amravati");
		a.add("washim");
		a.add("akola");
		
		System.out.println( "before " + a );
		
		a.set(2, "hydrabad");
		
		
		System.out.println( " after "+ a);
	}

}
