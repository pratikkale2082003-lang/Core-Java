package oops;

interface bankaccount{
	
	 abstract void Atm();
	
	 
	 default void WIthdrawal(){
		  
		  System.out.println("Withdrowal is sucessfully");
		  
	 }
		  static void  checkbalanece() {
				 
			  System.out.println("THe balance is 50000");
		 }
}


class  money implements  bankaccount{

	@Override
	public void Atm() {
		// TODO Auto-generated method stub
		System.out.println("Atm is sucessfully achive");
	}
	
}

public class interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 money  m = new  money ();
		 m.Atm();
		 m.WIthdrawal();
 
		 bankaccount.checkbalanece();
		
	}

}
