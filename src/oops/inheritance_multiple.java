package oops;


public class inheritance_multiple{

	
	public static void main(String[] args) {
		
		 student5  s = new  student5 ();
		 s.classname();
		 s.collegename();
	}
}

interface college{
	
 void collegename();
	 
 
}




 interface Class {
	 
	  void classname();
	  
 }
 
class student5 implements college,Class{

	@Override
	public void classname() {
		
		System.out.println("fortunecloud");
	}

	@Override
	public void collegename() {
		// TODO Auto-generated method stub
		 System.out.println("Anuradha College");
	}
	
}





