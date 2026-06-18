package oops;




class  Math{
	
	Math(){ // non Parametric Consttructors
		System.out.println("Hello Default Constructors ");
	}
	
	Math(int n){
		System.out.println("Paramteric Contrustors ");
	}
	
	Math(  int a , int b ){
		System.out.println("Int Constructors ");
	}
	
	
public class DefaultConstructor {
	 public static void main(String[] args) {
			Math m = new Math();
			Math m1 = new Math(12);
			Math m2= new Math(22, 32);
		}
	}

}
