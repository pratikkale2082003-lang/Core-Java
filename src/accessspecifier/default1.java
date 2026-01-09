package accessspecifier;


	
	 class A {
		 
		void birds() {
			 System.out.println(" the birds name is parrot");
		 }
	 }
	
	
	class  B extends A {
		
		 void animal() {
			 System.out.println(" Animal  name is Tiger");
		 }
	}
	
	public class default1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		b.animal();
		b.birds();
		
	}

}
