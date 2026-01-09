package corejava;

public class task20 {

		public static int linearSearch(String number, char key) {
			
			for(int i = 0; i<number.length(); i++) {
				if(number.charAt(i) == key) {
					return i;
					
				}
			}
			 return -1;
		}

		public static void main(String [] args) {
			String number   =  "cravita";
			char key = 'v';
			 int index = linearSearch(number,key);
			 if(index==-1) {
				 System.out.println("The key not found ");
				 
			 }
			 else {
				 System.out.println(" the key index is : " + index);
			 }
		}
	

	}


