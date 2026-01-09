package oops;



public class exampleoop {
	
	String name;
	 void info(String name ) {
		    this.name = name;
		  System.out.println(name);
		 
		 
	
	
	 }
	
	
	public static void main(String[] args) {
		
		exampleoop o = new exampleoop();
	o.info("pratik");

		 System.out.println(o.name);
	}

}
