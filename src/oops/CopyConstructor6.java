package oops;

public class CopyConstructor6 {



           String  emp_name;
           int id;
           String  company;
           int   salary;
           
           CopyConstructor6 (String emp_name, int id , String company, int salary ){
        	   
        	    this.emp_name=emp_name;
        	    this.id= id;
        	    this.company=company;
        	    this.salary=salary;
        	    
        	     System.out.println("Employee name is " + this.emp_name);
        	     System.out.println("Employee id is: " + this.id);
        	      System.out.println("Company  name is : " + this.company);
        	       System.out.println("Salary is : " + this.salary);
        	    
           }
           CopyConstructor6 (CopyConstructor6 c){
        	   
        	   this.emp_name=c.emp_name;
        	   this.id=c.id;
        	   this.company=c.company;
        	    this.salary=c.salary;
        	    
        	System.out.println("Employee name is " + this.emp_name);
       	     System.out.println("Employee id is: " + this.id);
       	      System.out.println("Company  name is : " + this.company);
       	       System.out.println("Salary is : " + this.salary);
           }
           
	
public static void main(String[] args) {
	
	 CopyConstructor6  ob =   new CopyConstructor6("Pratik", 36,"TCS",50000);
	 System.out.println("---------------------------------------------------------------------------------------------------------");
	 CopyConstructor6  ob1 = new CopyConstructor6 (ob);
	 
}
}
