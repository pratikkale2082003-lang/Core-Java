package oops;


 abstract class Principal { //Parent class
	
	 void campus(){
		 System.out.println(" Principal Said : Anuradha Engineering college are 100% placement");
		 
	 }
	 
	abstract  void college();
}

 class Teacher extends Principal{// child1
	 
	 
	 void college() {
		 System.out.println("  Teacher Said : 100 %  Attendence Compulsary");
	 }
 }


  class Student8  extends Teacher{//child2
	  
	   void college() {
		   System.out.println(" Student Said : College to third class ");
	   }
  }


public class Abstraction7 {

	public static void main(String[] args) {
		Teacher ob = new Teacher();
		ob.campus();
		ob.college();
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		Student8 st = new Student8();
		st.campus();
		st.college();
	}

}
