package oops;





class Classroom{
	  String name;
	  int id;
	  
	  Classroom(String name){
		  
		  this.name=name;
		  System.out.println("Student name is : " + this.name);
	  }
	   Classroom(int id){
		   this.id=id;
		   System.out.println("Student id is : " + this.id);
	   }
	   
	   Classroom(Classroom s){
		   this.name=s.name;
		   this.id=s.id;
		   System.out.println(" copy to Student name is : " + this.name);
		   System.out.println(" copy to Student id is : " + this.id);
	   }
	   
	
}
public class Constructortask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classroom ob = new Classroom("Sahil");
		Classroom ob1 = new Classroom(50);
		
		Classroom cl = new Classroom(ob);
		Classroom cl2 = new Classroom(ob1);
	}

}
