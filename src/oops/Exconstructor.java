package oops;


 class Diwali{
	 Diwali(){
		 System.out.println(" diwali is festival");
	 }
	 
	 Diwali(int  a ){
		  System.out.println("faral");
	 }
	 
	 Diwali(String name ){
		  System.out.println(" fatake");
	 }
	 
	 Diwali(double d , long b){
		 System.out.println("navin kapade");
	 }
 }
public class Exconstructor {

	 public static void main(String[] args) {
		
	
	Diwali d1= new Diwali();
	Diwali d2= new Diwali(5);
	Diwali d3= new Diwali("prattik");
	Diwali d4= new Diwali(10.2, 45);
}
}