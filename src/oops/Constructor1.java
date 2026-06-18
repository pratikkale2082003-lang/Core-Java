package oops;

public class Constructor1 {

	String name;
	long number;
	int salary;
	
	Constructor1(String name ){
		 this.name = name;
		 
	}
	Constructor1 (long num){
		this.number=num;
		
	}
	
	 Constructor1(int sal){
		 this.salary=sal;
		 
	 }
	 public static void main(String[] args) {
		 Constructor1 c = new Constructor1("pratik");
		  System.out.println(c.name);
		  
		  
		 Constructor1 c1 = new Constructor1(456998899999999l);
		 System.out.println(c1.number);
		 Constructor1 v = new Constructor1(10);
		 
		 System.out.println(v.salary);
	}
	
}
