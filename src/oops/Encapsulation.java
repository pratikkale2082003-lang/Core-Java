

package oops;


//Encapsulation :- Wrapping data & method in a single unit class.

 import java.util.*;
 class Programmer{
	 
	  private String name;
	  
	   public String getName() {
		    return name;
		   
	   }
	   
	   public  void setName(String name){
		    this.name= name;
	   }
 }

public class Encapsulation {

	public static void main(String[] args) {
	
      Programmer p = new Programmer();
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      p.setName(name);
      System.out.println( " name => "+p.getName() );
	}

}
