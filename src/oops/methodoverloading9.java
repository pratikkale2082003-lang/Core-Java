package oops;

//is mutiple method as same name but different parameter

public class methodoverloading9 {

	 void  bankaccount() {
		 System.out.println("icci banks");
	 }
	 
	  void bankaccount(int a ) {
		  System.out.println("withdrowal");
	  }
	  
	   void bankaccount(int a, int b) {
		   System.out.println("enter  money");
	   }
	   
	   void bankaccount(float s , long e) {
		   System.out.println("password");
	   }
	   
	   void  bankaccount(int a , String  name) {
		 
		   System.out.println("Account is scuccefullly credited");
		   
	   }
	   
	   
	   public static void main(String[] args) {
		   methodoverloading9  mh = new  methodoverloading9();
		   mh.bankaccount();
		   mh.bankaccount(5);
		   mh.bankaccount(4, 0);
		   mh.bankaccount(0, "pavan");
		   mh.bankaccount(5f, 0);
//		 System.out.println(mh.bankaccount(0, "pratik"));
	}
	   
}
