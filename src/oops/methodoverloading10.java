package oops;

//method over loading :  multiple method with a same name but different parameter


  class  bankaccpunt{
	 void  payment() {
		 System.out.println( 10+20);
	 }
	   
	 void  payment(int a ) {
		  System.out.println(" 2000");
	 }
	 void  payment(String a,int b) {
		 System.out.println("pratik");
	 }
  }


public class methodoverloading10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankaccpunt b = new bankaccpunt();
		b.payment();
		b.payment(10);
		b.payment("pratik", 1);
	}

}
