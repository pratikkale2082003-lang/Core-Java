package oops;



 class College{
	 
	 String name;
	 int Student;
	 char rank;
	 int cen_no;
	 
	 College(String name , int Student, char rank, int cen_id ){
		 this.name=name;
		 this.Student=Student;
		 this.rank=rank;
		 this.cen_no=cen_id;
		 
		 System.out.println("Anuradha Engineering College" + this.name);
		 System.out.println("Student count is : "+ this.Student );
		 System.out.println("Rank is : " + this.rank);
		 System.out.println("centre no is : " + this.cen_no);
		 
	 }
	 
	 College(College c ) {
		this.name=c.name;
		this.Student=c.Student;
		this.rank=c.rank;
		this.cen_no=c.cen_no;
		
		 
		 System.out.println(" Copy to Anuradha Engineering College " + this.name);
		 System.out.println(" Copy to Student count is : "+ this.Student );
		 System.out.println(" Copy to Rank is : " + this.rank);
		 System.out.println(" Copy to centre no is : " + this.cen_no);
	 }
	 
 }

public class Constructor6 {

	public static void main(String[] args) {
		

		College C = new College("Chikhli ", 45, 'A', 320);
		
		
		College c2 = new College(C);
		
	}

}
