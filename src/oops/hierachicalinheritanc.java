package oops;

 class parent4{  // parentclass
	 
	  void mangul() {
		  System.out.println(" mangul zanak is parent class ");
	  }
 }
 
  class  hospitil  extends  parent4{  // child class
	  
	   void tarapan() {
		   System.out.println(" the owner by kartik");
		  
	   }
	   
	   
	  
  }


public class hierachicalinheritanc extends parent4 { // child class

	
	 void sweet() {
		 System.out.println(" the owner by  akshay");
		 
	 }
	 public static void main(String[] args) {
		
	
	hierachicalinheritanc ob =  new hierachicalinheritanc();
	ob.sweet();
	ob.mangul();
	
	 System.out.println(" ____________________________________________________________________________________  _--------        ---------------------------------------------");
	hospitil ob1 = new hospitil();
	ob1.tarapan();
	 }
}
