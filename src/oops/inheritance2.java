package oops;




	  class Led{ // parent class
		   String  laptop;
		     int price;
		      int battary;
		      
		      String performance(String  high) {
		    	  laptop = high;
		    	  return laptop;
		      }
		      
		      
		       int  battary(int  power) {
		    	    battary = power;
		    	    return battary;
		    	    
		       }
		        int money( int  money1 ) { 
		        	 price = money1;
		        	 return price;
		        }
		     
	  }
	
	   class Lcd extends Led{ // child class
		   
		   String coding;
		   
		    void programming() {
		    	System.out.println("Java");
		    	
		    }
		    
		    public static void main(String[] args) {
		    	
		    }
		   
	   }
	
	   public class inheritance2 {
			
			public static void main(String[] args) {
				
				Lcd mob = new Lcd();
				    mob.programming();
				    
				    mob.laptop= "hpvictus";
			           System.out.println(mob.laptop);
			           
			           mob.performance("intel");
		           System.out.println(mob.performance("intel"));
		           
		          
		           System.out.println(mob.battary(5000));
		           
		           
		           System.out.println(mob.money(5000));
			}

		}
	   
	
	   