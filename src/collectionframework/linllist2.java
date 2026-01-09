package collectionframework;

import java.util.Iterator;
import java.util.LinkedList;

public class linllist2 {

	public static void main(String[] args) {

         LinkedList l = new LinkedList();
          l.add("doolyy@gmail.com");
  l.add(567);
  l.add("soni");
  l.add('#');
 
   System.out.println(l.offer(76));
   l.add(81.2);
   System.out.println( "peek : " + l.peek());
   System.out.println("poll : " + l.poll());
   System.out.println( " linked list " + l);
   
   Iterator it = l.iterator();
   
//    while(l.) {
//	}
	}
}
