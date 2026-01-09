package oops;



 class Animal111{
	 
	   void eat() {
		   
		   System.out.println(" tiger is most powerful ");
		   System.out.println("tiger color is white");
		   System.out.println(" non veg ");
		   
	   }
 }
	class Birds extends Animal111{
		
	 void eat() {
 super.eat();

		 System.out.println(" pikcock is most beatiful ");
		   System.out.println(" pickock color  is blue");
		   System.out.println(" veg ");
	 }
	
	   
 }




public class overriddingtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birds e = new Birds();
		
 e.eat();
		
		 
	}

}
