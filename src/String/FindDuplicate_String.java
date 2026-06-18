package String;

import java.util.Scanner;

public class FindDuplicate_String {

	  public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter String : ");
			        String str = sc.next();

			        for (int i = 0; i < str.length(); i++) {
			            int count = 1;

			            for (int j = i + 1; j < str.length(); j++) {
			                if (str.charAt(i) == str.charAt(j)) {
			                    count++;
			                }
			            }

			            if (count > 1 && str.indexOf(str.charAt(i)) == i) {
			                System.out.print(str.charAt(i) + " ");
			            }
			        }
			    }
			}