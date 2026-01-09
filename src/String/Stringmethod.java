package String;

public class Stringmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "fortunecloud";
		
		System.out.println("1. String is  :   " +str);
		
		System.out.println("2. length is : " + str.length());
		
		System.out.println("3. Uppercase : " + str.toUpperCase());
		System.out.println("4. Lowercase  : " +str.toLowerCase());
		System.out.println( "5. Equals : " + str.equals("Fortunecloud"));
		System.out.println("6. Char At : " + str.charAt(3));
		System.out.println( "7. indexof  : " + str.indexOf("e") );
		System.out.println("8. Ends with : " + str.endsWith("d"));
		System.out.println("9. Start with : "+ str.startsWith("g"));
		System.out.println("10. Replace : " + str.replace("e" , "a"));
		System.out.println("11. concat : " + str.concat("technology"));
		System.out.println("12. split : " + str.split("/s"));
//		System.out.println();
	}

}
