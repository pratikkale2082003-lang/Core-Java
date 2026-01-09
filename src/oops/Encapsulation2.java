package oops;

public class Encapsulation2 {
  private String name ;
  
	String  getname() {
		 return name;
		 
	}
	
	  void setname (String name) {
		   this.name= name;
	  }
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsulation2 sc = new Encapsulation2();
		sc.setname("pratik");
		 System.out.println(sc.getname());
	}

}
