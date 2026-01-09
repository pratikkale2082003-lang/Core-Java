package oops;

//Constructor is Special method automatically intialze the object
// does not return value 
//same class name and same method name;

public class Constructor7 {

	 String name;
	 int salary;
	 String city;
	  int id;
	  
	 
	 Constructor7(String name , int id){
		  this.name= name;
		  
	 }
	 Constructor7(int salary){
		 this.salary=salary;
		 
	 }
	 
	  Constructor7(String  city){
		  this.city=city;
		  
	  }
	   public static void main(String[] args) {
		   
		   Constructor7 c = new Constructor7("pratik", 05);
		    System.out.println(c.name+c.id);
		  
		   Constructor7 c1 = new Constructor7(20555);
		    System.out.println(c1.salary);
		   Constructor7 c2 = new Constructor7("Pune");
		     System.out.println(c2.city);
		   
	}
}
