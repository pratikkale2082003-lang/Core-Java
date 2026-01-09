package task;
class college{
	
	 void co_name1() {
		 System.out.println("ASSIMS College");
	 }
}


 class student5  extends college{
	 
	  void s_id() {
		  System.out.println(" Grade is A +");
	  }
 }
 
 
  class  branch1 extends college{
	  
	   void branch() {
System.out.println("Computer Science Enginering");
	   }
  }
  
  
      public class hierachical2 {
      public static void main(String[] args) {
    	  branch1 b = new branch1();
    	  b.co_name1();
    	  b.branch();
    	 
    	  student5 s = new student5();
    	  s.s_id();
    	 
}

}
