package oops;


interface AA{
	
	 void city();
	 
}

interface BB{
	
	 void country ();
	  
}



	 class C implements AA, BB {
		 
		 public void city() { // public is compulsary 
			 
			 System.out.println("India");
		 }
		 
		 
		   public void country() { //public keyword is compulsary();
		   
			  System.out.println("japan ");
		  }
 }


 

public class multipleInheritance4  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C  ob = new C();
		ob.city();
		ob.country();
	}

}
