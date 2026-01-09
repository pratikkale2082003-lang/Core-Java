package oops;


//Encapsulation is  wrapping data and method for a single  unit..

// get = to the return value;
// set = to the modify value
public class Encapsulation9 {
	
	
	 private int student_id;
	 private String  stu_mail;
	 
	 
	 void setId( int id ) {
		 
		  this.student_id= id;
		  
	 }
	  int getId() {
		return student_id;
		  
	  }
	  
	  
	   void setname(String mail ) {
		   
		   this.stu_mail= mail;
		   
	   }
	    String  getname() {
	    	 return stu_mail;
	    	 
	    }
	    
	     public static void main(String[] args) {
	    	 Encapsulation9 e = new Encapsulation9();
	    	 e.setId(5722);
	    	 e.setname("pratikkale@2003");
	    	  System.out.println(e.getId());
	    	  System.out.println(e.getname());
		}
	   
}
