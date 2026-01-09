package oops;

public class methodoverloading3 {

	  int sum( int a, int b) {
		   return a+b;
	  }
	
	 float sum(float a , float b){
		 return a+b;
	 }
	
	 int sum(int a, int b, int c) {
		  return a+b+c;
		 
	 }
	
 double  sum(  double a, double b) {
	 return a+b;
	 
 }
	
	
	public static void main(String[] args) {
	
		methodoverloading3 m = new methodoverloading3();
		System.out.println(m.sum(45, 13));
		System.out.println(m.sum((float)3.4, (float)4.6));
		System.out.println(m.sum(51, 33, 27));
		System.out.println(m.sum(10.7, 23.3));
		
	}

}
