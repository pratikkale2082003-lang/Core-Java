package oops;

public class parametric_constructor {


	parametric_constructor(int a, int b, int c){
		System.out.println("multiplication is : " + (a * b* c));
	}
	
	parametric_constructor( int c , int d){
		System.out.println("addition  is : " + (c+d));
	}
	
	parametric_constructor(float e, float f){
		System.out.println("substraction  is : " + (e-f));
		
	}
	parametric_constructor(){
		System.out.println( "suceessfully achive");
	}
	
	
	public static void main(String[] args) {
		
		parametric_constructor ob = new parametric_constructor(2,3,6);
		parametric_constructor ob1 = new parametric_constructor(5,8);
		parametric_constructor ob2 = new parametric_constructor( 13f,7f);
		parametric_constructor o = new parametric_constructor();
	}

}
