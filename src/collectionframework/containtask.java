package collectionframework;

import java.util.ArrayList;

public class containtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList b = new ArrayList();
		
		 b.add(45);
		 b.add("rutu");
		 
		  int flag = 0;
		  
		  for (int i = 0; i< b.size(); i++) {
			  
			   if (b.get(i).equals("rutu")) {
				   
				    flag++;
			   }
		  }
		   if(flag == 0) {
			   System.out.println("rutu object not exits");
		   }
		   else {
			   System.out.println("rutu object exits");
		   }
	}

}
