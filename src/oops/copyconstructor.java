package oops;


public class copyconstructor {

	int emp_id;
	String emp_name;
	
	copyconstructor( int emp_id, String emp_name){  //parametrized constructor
		
		 this.emp_id= emp_id;
		 this.emp_name=emp_name;
		 System.out.println("employee id is : "+ this.emp_id);
		 System.out.println("employee name  is : "+ this.emp_name);
	}
	
	
	copyconstructor( copyconstructor c){ // copy constructor
		this.emp_id=c.emp_id;
		this.emp_name=c.emp_name;
		System.out.println("copy of employee id is : "+ this.emp_id);
		System.out.println("copy of employee id is : "+ this.emp_name);
	}
	public static void main(String[] args) {
		
		copyconstructor obj =   new copyconstructor(36, "Pratik");
	
		copyconstructor emp2 = new copyconstructor(obj);
	}

}
