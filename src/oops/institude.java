package oops;
//  course - parent class/
// institude = child  class
public class institude extends   course{
  String colname;
  int centerno;
  
  void collegename() {
	  System.out.println("Anuradha");
  }
	
  
   void centername() {
	   System.out.println(320);
   } 
    public static void main(String[] args) {
		
    	 
    	institude name = new institude();
    	name.collegename();
    	name.centername();
    	
    	
    	name.cse();
    	name.fortune();
	}
   
   
   
   
}
