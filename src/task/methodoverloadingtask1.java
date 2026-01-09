package task;

public class methodoverloadingtask1 {

	
	 int math(int a , int b) {
		 System.out.println(" Addition is  : "  );
		  return a+b;
		  
	 }
	
	 float math(float c, float d) 
	 {
		 
		System.out.println("float addition is : ");
		 return c+d;
		 
	 }
	
	 
	  void math(String name) {
		  
  System.out.println("String name is");
		  
	  }
	 void math(  ) {
		 System.out.println(" pratik ");
	 }
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodoverloadingtask1 ob = new methodoverloadingtask1();
		ob.math(5,4 );
		ob.math(4.5f,3.2f );
		
		ob.math("pratik");
		ob.math();
	
		
	}

}
