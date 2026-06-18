package practical;

public class MergetwoArray {

	 public static void main(String[] args) {
		
	
	 int arr1[] = {1, 3, 7};
	 int arr2[] = { 2, 4, 6};
	 
	  int []merge = new int[arr1.length + arr2.length];
	  
	   int i = 0, j = 0, k = 0;
	   
//	    merge Using For Loop
	   
	    for (; i <arr1.length && j < arr2.length;) {
	    	if(arr1[i]<= arr2[j]) {
	    		 merge [k++] = arr1[i++];
	    		 
	    	} else {
	    		 merge[k++] = arr2[j++];
	    		
	    	}
	    }
//	     copy remaining Element of arr1
	     for (; i < arr1.length; i++) {
	    	  merge [k++] = arr1[i];
	    	  
	     }
	     // copy remaining elements of arr2
	      for (; j < arr2.length; j++) {
	    	  merge [k++] = arr2[j];
	    	  
	      }
//	       print merged array
	         for (int n : merge) {
	        	 System.out.print(n + " vbBBBB>");
	         }
}
}