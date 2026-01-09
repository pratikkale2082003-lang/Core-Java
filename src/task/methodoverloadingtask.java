package task;

//circle, square,rectangle task
 import java.util.*;
public class methodoverloadingtask {

	 
		  void circle() { 
		  
		 Scanner sc = new Scanner (System.in);
		 System.out.print("Enter the number : ");
	     float rad = sc. nextFloat();
	     float area =3.14f *rad * rad;
	     System.out.println("Area of circle is  : " + area);
	      sc.close();
	 }
		 
		   int num;
	 void circle(int num){
		 Scanner sc = new Scanner(System.in);

	   
	         int Square = num * num;
	         System.out.println(" the square  of " + num + " is :" + Square);

	         sc.close();
	 }
	 
//	  int l;
//	  int b;
	   void   circle( int l, int b) {
		  System.out.println( "the rectangle is : " + ( l * b) );
		  
	  }
		  
	    void circle (int i, int j, int k) {
	    	System.out.println("the cub is : " + (i*j*k));
	    }
	   
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodoverloadingtask m = new methodoverloadingtask();
		
		 m.circle();
		m.circle(5);
		 m.circle(8, 4);
		 m.circle(2, 2, 2);
	}

}
