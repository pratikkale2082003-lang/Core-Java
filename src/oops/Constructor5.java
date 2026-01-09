package oops;



 class Employee{
	 
	 String name;
	  int salary;
	  String co_name;
	  int id;
	  
	  Employee(String name , int salary, String co_name, int id ) {
	  this.name=name;
	  this.salary=salary;
	  this.co_name=co_name;
	  this.id=id;
	  
	  System.out.println("Employee name is : " + this.name);
	  System.out.println("Employee salary is : " + this.salary);
	  System.out.println("Employee company name is : "+ this.co_name);
	  System.out.println("Empolyee id is : " + this.id);
	  
 }

	  
	  Employee(Employee e ){
		   this.name=e.name;
		   this.salary=e.salary;
		   this.co_name= e.co_name;
		   this.id= e.id;
		   
		   
		   System.out.println(" copy to Employee name is : " + this.name);
			  System.out.println("copy to Employee salary is : " + this.salary);
			  System.out.println("copy to Employee company name is : "+ this.co_name);
			  System.out.println(" copy to Empolyee id is : " + this.id);
	  }




 }





public class Constructor5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee("pratik", 25000, "TCS", 778);
		
		
		Employee emp3 = new Employee(emp);
	}

}
