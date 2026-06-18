package TCS_Question;

public class Arrayofsubset {
	
	 static int max = 0;
	  static void  solve(int [] arr, int i , int sum, int limit) {
		  
		   if ( sum > limit)
			    return;
		   
		   
		   
		    max = Math.max(max, sum);
		    
		     if ( i ==  arr.length)
		    	  return;
		     
		     
//		      include  element
		      solve(arr, i+1, sum + arr[i], limit);
		      
		      
//		       execute element
		       solve(arr, i+1, sum, limit);
		  
	  }

	 public static void main(String[] args) {
		
		  int [] arr = {2,3,5,7};
		  
		  int   limit =10;
		  
		  
		  
		   solve(arr, 0, 0, limit);
		   
		   System.out.println(max);
		  
		   
	}
}
