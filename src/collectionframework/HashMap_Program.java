package collectionframework;

import java.util.HashMap;

public class HashMap_Program{

public static void main(String[] args) {
	   HashMap <Integer, String> map = new HashMap<>();
	   map.put(101, "Pratik" );
	   map.put(102, "Rahul");
	   map.put(103, "Amit");
	   
	   System.out.println(map);
	
	   
	   System.out.println(map.get(102));
}
}
