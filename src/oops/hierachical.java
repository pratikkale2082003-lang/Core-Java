package oops;

//hierachical inheritance =  one parent class and multiple child class.




class fccoolege{ //parent class
	
	 void  co_name(){
		 System.out.println(" college  :  fergusion college");
		 
	 }
}

 class branch extends fccoolege{ //childclass 
	 
	 
	 void b_name() {
		 System.out.println(" branch :  Computer Science Engineering ");
	 }
 }


class Student2  extends fccoolege{ //child class 
	
	 void id() {
		 
		 System.out.println("  name : Pratik kale ");
	 }
}




public class hierachical {

	public static void main(String[] args) {
		 Student2 s = new  Student2();
		 s.co_name();
		 s.id();
		
		 branch b = new branch();
		  b.b_name();

	}

}
