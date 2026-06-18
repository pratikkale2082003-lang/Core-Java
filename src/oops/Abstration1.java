package oops;

 abstract class Friuts {
	 
	  abstract void  fruits();
 }


  class Apple  extends Friuts {

	@Override
	void fruits() {
		// TODO Auto-generated method stub
		
		 System.out.println("Mango Is So yummy");
	}
	  
  }


public class Abstration1 {
public static void main(String[] args) {
	

	Apple a = new Apple();
	a.fruits();
}
}