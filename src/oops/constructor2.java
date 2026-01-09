package oops;

public class constructor2 { // parameterize constructor

	String name;
	int roll;
	
	 constructor2(String name ){
		this.name= name;
		
	}
	constructor2(int rollno){
		this.roll=rollno;
	}
	
	public static void main(String[] args) {
		
		constructor2 obj = new constructor2("Pratik kale");
		System.out.println(obj.name);
		
		constructor2 obj2 = new constructor2(36);
		System.out.println(obj2.roll);
	}

}
