package oops;

import java.util.Scanner;


//  Encapsulation : Wrapping Data And Method into Single Unit  Using gettter and setter.

// Example : 
//            1) Car : Car Engine is coverd  inside the body  it detail are hidden  n and protected

//            2)  Atm MAchime :  cannot directly access money  use Pin & button

//            3)  The Capsule enclose  the medicine  prevent direct acess the inside medicine 



//    Advantage of Encapsulation:
//                              1) Data Hiding =  डेटा लपवत आहे
//                              2) Security =  सुरक्षा
//                              3) Control  = नियंत्रण
//                              4) Code Reusability = कोड कमी करणे
//                              5) Easy Maintance = सुलभ देखभाल
//                              6) Improve Flexibility = लवचिकता


// Getter() =  its Used to fetch the value.          show  the value
// Setter() =  its used  to update/ add the value.


class mobile {
	 
	   private String Model;
	    private  int price;
	    
	    
	     public void setModel(String Model) {
	    	  this.Model= Model;
	    	  
	     }
	     public String getModel() {
	    	 return Model;
	    	   }
	     
	    	 
	      public void  setprice(int price) {
	    	  this.price=price;
	    	  
	      }
	    	  
	      
	       public int getprice() {
	    	   return price;
	    	   
	       }
	    
 }
 




public class Encapsulation__Example {

	 public static void main(String [] args) {
		 
		  Scanner sc = new Scanner(System.in);
		  
	 
	mobile m = new mobile();
	
	
	 System.out.print("Enter Model : ");
	 String model = sc.nextLine();
	 
	   System.out.print("Enter Price : ");
	    int price = sc.nextInt();
	    
	m.setModel(model);
	m.setprice(price);
	
	 System.out.println("--------------------------------------------------------------------");
	 System.out.println("Model name is : " + m.getModel());
	 System.out.println("price is : " + m.getprice());
	  sc.close();
	  
	 }
}
