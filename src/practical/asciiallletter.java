package practical;

public class asciiallletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String str = "i love india";
           
            for (int i = 0; i < str.length(); i++) {
            	 char ch = str.charAt(i);
            	 
            	  if ( ch == 'l' ||ch == 'o' ||ch == 'v'||ch == 'e') {
            		  System.out.println(ch + " : " + (int) ch);
            	  }
            }
	}

}
