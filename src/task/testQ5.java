package task;

public class testQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "For1tuneClo2ud3";
		
		String result = str.replaceAll("[0-9]", "");
		System.out.println("original string : " + str);
		System.out.println("After removing number : " + result);
	}

}
