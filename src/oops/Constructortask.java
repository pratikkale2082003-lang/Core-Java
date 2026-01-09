 package oops;


 class Student{
	 
	 String name;
	 int roll_no;
	 String city;
	 long phone_no;
	 
	 Student(String name , int roll_no, String city, long phone_no){
		 
		 this.name= name;
		 this.roll_no=roll_no;
		 this.city= city;
		 this.phone_no=phone_no;
		 
		 System.out.println("Student name is : " + this.name);
		 System.out.println("Student rollno is : " +this.roll_no);
		 System.out.println("Student city is : " + this.city);
		 System.out.println("Student phoneno  is : " + this.phone_no);
	 }
 

 Student( Student s){
	 
	 this.name=s.name;
	 this.roll_no=s.roll_no;
	 this.city=s.city;
	 this.phone_no= s.phone_no;
	 System.out.println(" copy to Student name is : " + this.name);
	 System.out.println(" copy to Student rollno is : " +this.roll_no);
	 System.out.println(" copy to Student city is : " + this.city);
	 System.out.println(" copy to Student phoneno  is : " + this.phone_no);
 }


 }



public class Constructortask {

	public static void main(String[] args) {
	
		Student  ob1 = new Student("Pratik", 36, "Pune", 8605209331l);
		
         Student emp = new Student(ob1);
	}

}
