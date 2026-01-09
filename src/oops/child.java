package oops;
//inheritance
public class child extends Parent{

	
	 void second() {
		 System.out.println(" child property ");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 child  obj = new child();
		 obj.second();
		 obj.first();
	}

}

