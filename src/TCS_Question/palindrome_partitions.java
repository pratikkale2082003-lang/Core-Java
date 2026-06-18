package TCS_Question;

import java.util.*;

// Using BackTracking

public class palindrome_partitions {

	static boolean isPalindrome(String str) {
		 int l = 0; 
		 int r = str.length()-1;
		 
		  while( l < r) {
			  
			   if (str.charAt(l) != str.charAt(r))
				   return false;
			   l++;
			   r--;
			   
		  }
	return true;
	}
	
	
	 static  void solve (String str , int start, List<String> list) {
		 
		 if(start == str.length()) {
			 System.out.println(list);
			  return;
			  
		 }
		 
		  for ( int  i = start; i<str.length(); i++) {
			  String sub = str.substring(start, i + 1);
			 
			  
			   
				   if (isPalindrome(sub)) {
					   
					    list.add(sub);
					     solve (str, i+1, list);
					       list.remove(list.size()-1);
					       
					
				   }
			   
		  }
	 }
	public static void main(String[] args) {
		
		 String str = "abb";
		  solve( str, 0, new ArrayList<>());
		  

	}
	

}
