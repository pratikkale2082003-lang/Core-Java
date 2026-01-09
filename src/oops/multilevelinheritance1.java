package oops;


//multilevel inheritance :  the chaincycle inheritance 

 class  diwali2 {   // grandparent
	 
	 
	 void dhamaka() {
		 System.out.println("  bonus ");
		  System.out.println(" fatke ");
	 }
 }

  class faral extends  diwali2 {// parent
	  
	   void sweet() {
		   System.out.println(" chivda ");
		    System.out.println(" chakali");
	   }
  }

  
   class festival extends faral{ // child 
	   
	   void kapde() {
		   System.out.println(" new kapde");
	   }
   }
  
  
public class multilevelinheritance1 {

	public static void main(String[] args) {
	
		festival f = new festival();
		f.dhamaka();
		 System.out.println("--------------------------------------------------------------------");
		 f.sweet();
		 f.kapde();

	}

}
