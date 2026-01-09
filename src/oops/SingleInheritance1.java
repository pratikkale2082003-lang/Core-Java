
package oops;


 class cravita {
	 
	 void craviy() {
		  System.out.println("Cravita technology  for it Company");
	 }
	 
	  
 }
  class fortunecloud extends cravita{
	   void fortune() {
		   
		    System.out.println(" Fortune Cloud Said : 100 % Skilll == 100 Placemenets");
	   }
  }
public class SingleInheritance1 {

	 public static void main(String[] args) {
		 fortunecloud f = new  fortunecloud();
		 
		  f.craviy();
		  f.fortune();
	}
}
