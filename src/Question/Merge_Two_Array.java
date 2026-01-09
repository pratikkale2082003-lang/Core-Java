package Question;

public class Merge_Two_Array {
public static void main(String[] args) {
	int arr1 [] = {1,3,5};
	int arr2 [] = {2,4,6};
	
	int merge [] = new int [arr1.length+ arr2.length];
	
	 int  index = 0;
	 
	  for (int i = 0; i< arr1.length; i++) {
		  
		   merge[index++] = arr1[i];
		   
	  }
	  
	   for ( int i = 0; i < arr2.length; i++) {
		    merge[index++] = arr2[i];
		    
		   
	   }
	   for ( int i : merge) {
		   
		   System.out.print(i + " ");
	   }
	
}
}
