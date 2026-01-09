package oops;

public class encapsulation3 {

private String name;  //global varible / instance of varible
 private 	int age;
	private long mob_no;
	
	
	void setname(String name) {
		this.name=name;
		
	}
	 String getname() {
		 return name;
		 
	 }
	 
	 void setage(int age ) {
		 this.age=age;
		 
	 }
	
	  int getage() {
		  return age;
		  
	  }
void setnumber(long number) {
	this.mob_no= number;
	
	  }

 long getnumber() {
	 return mob_no;
 }
 
 public static void main(String[] args) {
	 encapsulation3 en = new encapsulation3();
	 
	 en.setname("pratik kale ");
	 System.out.println("Student  name is  : " + en.getname());
	 
	 
	 en.setage(22);
	 System.out.println("Student age is : "+ en.getage());
	 
	 
	 en.setnumber(8055283547l);
	 System.out.println("Student mobile no is : "+ en.getnumber());
}
}

 