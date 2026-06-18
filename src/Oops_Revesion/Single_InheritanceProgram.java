package Oops_Revesion;


 class Fruits  {
	 
	 void sweet() {
		 System.out.println("Mango arge testey");
	 }
 }

  class  potato extends Fruits{
	  void spicy (){
		  System.out.println(" this is vegitable");
	  }
  }



public class Single_InheritanceProgram {
	 public static void main(String[] args) {
		
	
	potato  p = new potato ();
	p.sweet();
	p.spicy();
	 }
}
