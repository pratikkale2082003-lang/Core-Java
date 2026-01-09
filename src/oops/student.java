package oops;
//Get


public class student {
	String name;
	 int age;
	 float persantage;
	 
	 
	  void calcpercentage(int phy, int che, int math) {
		  persantage = (phy+che+ math)/3;
		  
	  }
	  
	   

	public static void main(String[] args) {
		
		student s = new student();
		s.name= "pratik";
		s.age= 22;
		s.calcpercentage(87, 50, 65);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.persantage);

	

				
		
		
	}



}