package oops;

public class simpleconstructor {
	simpleconstructor(){
		 System.out.println(" hei");
	}
	simpleconstructor(int a){
		
		 System.out.println("hii");
}
	simpleconstructor( float a){
	System.out.println("hey");
	}
	 public static void main(String[] args) {
		 simpleconstructor s = new simpleconstructor();
		 simpleconstructor g = new simpleconstructor(4);
		 simpleconstructor sr = new simpleconstructor(4.5f);
	}
}