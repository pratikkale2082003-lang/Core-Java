package oops;

// method overriding

class A{  // a parent class
	 A(){
		 System.out.println( "Class A ");
	 }
	 
	 A(int num ){
		 System.out.println("A number is " + num );
	 }
}

class B  extends A { //b is child class 
	
	B(){
		 System.out.println("Class B");
	}
	
	 B(int n ){
		  super(25); //super is method  
		 System.out.println("B number is  "+ n);
	 }
}

public class constructor4 {

	public static void main(String[] args) {
		

		  new B();
		  new B(5);
	}

}
