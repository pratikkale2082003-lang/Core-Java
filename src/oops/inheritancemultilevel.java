package oops;
//Multilevel inheritance : Chain of inheritance they using extends keyword


  class Fortune { //grandparent
	  
	   void cravita() {
		   System.out.println("100 Placement");
	   }
  }
  
   class  staff extends Fortune{
	    void  hr() {
	    	System.out.println("yest to day lecure");
	    }
   }
   
    class studentss extends staff{
    	 void lec() {
    		 System.out.println("123456");
    	 }
    }
public class inheritancemultilevel {
public static void main(String[] args) {
	studentss s = new studentss();
	s.cravita();
	s.hr();
	s.lec();
	
}
}
