package oops;

 class  balnkaccount{
	 
	  private String name;
	  private int salary;
	  
	  private  int age;
	 
	  
  

	   public String getName() {
		   return name;
	   }


	   public void setName(String name) {
		   this.name = name;
	   }


	   public int getSalary() {
		   return salary;
	   }


	   public void setSalary(int salary) {
		   this.salary = salary;
	   }


	   public int getAge() {
		   return age;
	   }


	   public void setAge(int age) {
		   this.age = age;
	   }
 }
public class Encapsulation10 {

	 public static void main(String[] args) {
		 balnkaccount b = new balnkaccount();
		 b.setAge(22);
		 b.setName("pratik");
		 b.setSalary(25000);
		  System.out.println("name is : " + b.getName());
		  System.out.println("AGe is : " + b.getAge());
		   System.out.println("Salary is : " + b.getSalary());
	}
}
