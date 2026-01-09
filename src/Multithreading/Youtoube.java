package Multithreading;

public class Youtoube extends Thread{

	   void play_video() {
		 
		 System.out.println(" video is  play");
		 
	 }
	 
	 void  play_audio() {
		 
		 System.out.println("audio is Play");
	 }
	  void  caption() {
		  
		  System.out.println("English");
	  }
	  
	   public void run() {
		   System.out.println("youtoube is working");
		   play_video();
		   play_audio();
		   caption();
	   }
	 public static void main(String[] args) {
		 Youtoube ob = new Youtoube();
		 ob.start();
	}
	  
}
