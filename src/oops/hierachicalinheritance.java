package oops;

//  hierachical inheritance =  one parent class and multiple child class.

 class parent7 {
	 
	  void  p(){
		  System.out.println("parent");
	  }
 }

 class child2   extends parent7{
	 void c2() {
	 System.out.println("child2");

}
}
   class Child5 extends parent7{
	   
	 void c1() {
		  
		   System.out.println("child1");
	   }
   }

   public class hierachicalinheritance {
	   public static void main(String[] args) {
	   	
	   	 Child5 ch = new Child5();
	   	  
	       ch.p();
	   	 ch.c1();
	   	 
	   	child2  ob = new child2();
	   	ob.c2();
	   }
	   }

