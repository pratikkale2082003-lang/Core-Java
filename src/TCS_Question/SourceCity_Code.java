package TCS_Question;

import java.util.*;

public class SourceCity_Code {

	public static void main(String[] args) {
		
		 int V = 5;
		 
		  int [][] e = {{0,1,4},
				  {0,2,1},
				  {2,1,2},
				  {1,3,1},
				  {2,3,5},
				  {3,4,3}};
		  
		   List<int[]>[] g  = new ArrayList[V];
		    for (int i = 0; i< V; i++)
	  g[i] = new ArrayList<>();
		    
		     for (int [] x : e) {
		    	 g[x[0]].add(new int[] {x[1], x[2]});
		    	 g[x[1]].add(new int[] {x[0], x[2]});
		    	 
		    	 
		     }
		     
		    int d [] = new int[V];
		    Arrays.fill(d, Integer.MAX_VALUE);
		    d[0] = 0;
		    
		     PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a [1]-b[1]);
	
	
	pq.add(new int[] {0,0});
	
	 while(!pq.isEmpty()) {
		 int[] cur = pq.poll();
		  for (int [] nb : g[cur[0]]) {
			  
			    if (d [nb[0]] > cur[1] + nb[1]) {
			    	d[nb[0]]= cur[1] + nb[1];
			    	pq.add(new int[] {nb [0],d[nb [0]]});
			    	
			    }
		  }
	 }
	 
	  for (int i = 0; i<V; i++)
		  System.out.println("City " + i + " : " + d [i] );
	  
	}
}
