package oops;


//Encapsulation :  Wrapping data & method  in a single unit.

//get = to return the value;
// set =  to modify  the value;
 
public class Encapsulation1 {
 private long adhar_no;  // data hiding 
  private String Acc_no;
  
 void set_adhar_no( long  adhar_no) {
	  this.adhar_no= adhar_no;
	  
 }
	
 long get_adhar_no() {
	 return adhar_no;
 }
	
 
 String  getname() {
	 return Acc_no;
	 
 }
 
  void setname(String Acc_no) {
	  this.Acc_no=Acc_no;
	 
	  
 }
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsulation1 ob = new Encapsulation1();
		
	ob.set_adhar_no(4578965584l);
	ob.setname("jdiappiEFJIG");
	
	System.out.println("Student adhar no is  : " + ob.get_adhar_no());
	System.out.println( "Student acc no is  : " + ob.getname());
	}

}
