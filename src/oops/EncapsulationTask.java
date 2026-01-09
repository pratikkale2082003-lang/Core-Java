package oops;
import java.util.*;






class employee{
	 
	private  int emp_id;
	 private int emp_salaray;
	  private String name;
	   
	   
	
	  void setid(int id) {
		  this.emp_id=id;
		  
	  }
	   int getid() {
		   return emp_id;
		     
	   }
//	   salary
	   
	     void setsalary(int salary) {
	    	 
	    	 this.emp_salaray=salary;
	    	 
	     }
	     
	      int getsalary(){
	    	  return emp_salaray;
	    	  
	      }
	   
	   
	      
	      void setname( String name) {
	    	   this.name = name;
	    	   
	      }

	      
	      String getname() {
	    	  return name;
	    	  
	      }
 }

public class EncapsulationTask {

	public static void main(String[] args) {
		
		
	
		employee ob = new employee();
		
		Scanner sc = new Scanner(System.in);
		
//		name
System.out.print("Empolyee name  is : " );
		String name = sc.nextLine();
		ob.setname(name);
		System.out.println("Employee name is : " + ob.getname());
		
//		id
	System.out.print("Empolyee id is : " );
	int id = sc.nextInt();
	ob.setid(id);
	System.out.println("Empolyee id is : " + ob.getid());
	
	
//	salary
	System.out.print("Empolyee salary is : " );
	int salary = sc.nextInt();
	ob.setsalary(salary);
	System.out.println("empolyee salary is :  "  + ob.getsalary());
       
	sc.close();
	
	
	}

}