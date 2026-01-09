package oops;

public class Pen {

		 String color ;
		  int tip;
		  
	void  setcolor(String newcolor) {
		 color = newcolor;
		 
	}

	 void settip(int newtip) {
		   tip = newtip;
		   
	 }

		public static void main(String[] args) {
			  Pen p = new Pen();
		        p.setcolor("blue");
		        p.settip(5);

		        System.out.println("p color is : " + p.color);
		        System.out.println("p tip is   : " + p.tip);
		    
		    p.setcolor("yellow");
		    System.out.println("p color1 is   : " + p.color);

		  
		  


		}

	}
