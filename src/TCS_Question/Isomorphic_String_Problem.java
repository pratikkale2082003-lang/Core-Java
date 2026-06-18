package TCS_Question;



//Two strings are isomorphic if characters in one string can be replaced to get the other string.

//input : s1 = "egg"
//        s2 = "abb"


//output : true

// Using Map
import java.util.*;
public class Isomorphic_String_Problem {

	 public  static void main(String [] args) {
		 
		  String s1 = "egg";
		  String s2 = "abb";
		  
		   HashMap<Character, Character> map = new HashMap<>();
		   boolean isometric = true;
		   
		    for (  int i = 0; i < s1.length(); i++) {
		    	
		    	 char  c1 = s1.charAt(i);
		    	 char c2 = s2.charAt(i);
		    	 
		    	 
		    	 
		    	  if (map.containsKey(c1)) {
		    		  if (map.get(c1) != c2) {
		    			  
		    			    isometric = false;
		    			    break;
		    			    
		    		  }
		    		    
		    	  }
		    	  else {
		    		  map.put(c1, c2);
		    		  
		    	  }
		    }
		    System.out.println(isometric);
		    
	 }
}
