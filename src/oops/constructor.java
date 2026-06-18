package oops;

//constructor is special method executed the when object or intialized.
//Rules: 
//1) constructor name should same name &same classname.
//2) constructor can have Access Specifier
//3) constructor doesn't return types
//4) constructor are called onces object creation
  class default_constructor{
	  
	  default_constructor(){ // non parametrize 
		  System.out.println(" hello default constructor....");
	  }
	  
	  
	  
	  default_constructor(int n ){  
		  System.out.println(" parametrize constructor");
	   }
	  
	  
	  default_constructor(int a, int b ){  
		  System.out.println(" nm constructor");
		   
	  }
	  

	  default_constructor(float c , float d){
		   System.out.println("  float constructor");
	  }
  }


public class constructor {

	public static void main(String[] args) {
		default_constructor ob = new default_constructor();
		default_constructor ob1 = new default_constructor(5);
		default_constructor ob3 = new default_constructor(5,6);
		default_constructor ob4 = new default_constructor((float)1.5 ,(float)3.4 );
	}

}










