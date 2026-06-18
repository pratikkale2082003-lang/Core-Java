package oops;

public class CopyConstructor8 {

	
	 String name;
	  int rollno;
	  String city;
	    double  marks;
	    
	    CopyConstructor8(String name,  int rollno,  String city, double marks){
	    	
	    	 this.name=name;
	    	 this.rollno= rollno;
	    	 this.city = city;
	    	  this.marks= marks;
	    	  
	    	    System.out.println("Student Name is : " + this.name);
	    	    System.out.println("Roll no is : " + this.rollno);
	    	    System.out.println("City is : " + this.city);
	    	    System.out.println("Marks is : " + this.marks);
	    }
	    
	    
	    CopyConstructor8(CopyConstructor8 c){
	    	this.name = c.name;
	    	this.rollno = c.rollno;
	    	this.city = c.city;
	    	this.marks=c.marks;
	    	
	    	   System.out.println("Student Name is : " + this.name);
	    	    System.out.println("Roll no is : " + this.rollno);
	    	    System.out.println("City is : " + this.city);
	    	    System.out.println("Marks is : " + this.marks);
	    	
	    
	    }
	    
	     public static void main(String[] args) {
			
	    	 CopyConstructor8  ob = new CopyConstructor8("Pratik", 36,"Pune",85.25);
	    	 
	    	  System.out.println("------------------------------------------------");
	    	  CopyConstructor8 ob1 = new CopyConstructor8(ob);
	    	  
	     }
}
