package practical;
// multi level task
 class  country {
	 
	  void co_name() {
		  System.out.println("India");
		  
	  }
 }

  class  state extends country {
	  
	   void st_name(){
		   System.out.println("Maharastra");
		  
	  }
  }
 
   class city extends state {
	   
	    void cityname() {
	    	System.out.println("Pune");
	    }
   }

public class inheritancetask {

	public static void main(String[] args) {
		
		city  name = new city();
		name.co_name();
		name.st_name();
		name.cityname();
				

	}

}
