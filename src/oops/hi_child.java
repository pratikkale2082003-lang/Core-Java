package oops;

// hierachical inhheritance

class parent1 {

	  void p() {
		 System.out.println("   father class  ");
	 }
}

class child3  extends parent1{
	   void c2() {
	 System.out.println(" childern class ");

}
}


public class hi_child extends parent1{
	
	 void c1() {
		 System.out.println("child1");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hi_child ch = new hi_child();
		ch.p();
		ch.c1();
		
		
		 child3  ob = new child3();
		 
		  ob.c2();
		  
	}

}
