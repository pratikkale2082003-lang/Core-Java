package oops;

public class person {

	String name;
	long mob;
	   void  walk() {
		   
		   System.out.println(" walking....");
	   }
	   
	 void speak() {
		 System.out.println("Speaking .....");
		 
	 }

	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  person p1 = new person();
		  p1.name= "pratik";
		  p1.mob= 8055283547l;
		  
		   p1.speak();
		   p1.walk();
		   
		   System.out.println( "person p1  name is  : " + p1.name);
			  System.out.println("person p1 mob  is : " + p1.mob);
			  
			  
		  person p2 = new person();
		  
		  p2.name ="suresh";
		  p2.mob= 8605209331l;
		 
		  
		  p2.speak();
		  p2.walk();
		  
		  System.out.println( "person p2  name is  : " + p2.name);
		  System.out.println("person p2 mob  is : " + p2.mob);
		  
	}

}
