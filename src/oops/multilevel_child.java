package oops;

public class multilevel_child  extends multilevel_parent{

	 void mcd() {
		 
		 System.out.println(" child class");
		 
	 }
	 
	 public static void main(String[] args) {
		
		 multilevel_child ob = new multilevel_child();
		 ob.mcd();
		 ob.mp();
		ob.mgo();
	}
}
