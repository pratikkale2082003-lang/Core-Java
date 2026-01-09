package oops;

public class copyconstructor5 {

	 String name ;
	 int id ;
	 
	 copyconstructor5 (String name, int id){
		 this.name= name;
		 this.id=id;
		 System.out.println( " Student name is : " + this.name);
		  System.out.println("Student id is : " + this.id);
	 }
	
	 copyconstructor5( copyconstructor5 c){
		 this.name=c.name;
		 this.id=c.id;
		 System.out.println("copy Student name is : " + this.name);
		 System.out.println(" copy Student id is : " + this.id);
	 }
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copyconstructor5  c = new copyconstructor5 ("Pratik", 56);
		
		copyconstructor5 ob = new copyconstructor5(c);
	}

}
