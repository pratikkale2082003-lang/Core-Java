package corejava;

public class Stringbuilderdemmo {
	
		   



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		
			 StringBuilder  str1 = new StringBuilder("good");
			  
					 
			 System.out.println("before  append  : " + str1);
			 System.out.println(" using append  :  " + str1.append("students"));
			 System.out.println(" after append : " + str1);
			 System.out.println("after reverse  : " + str1.reverse());
			 System.out.println("  index of "+ str1.indexOf("o"));
			 System.out.println(" char at" + str1.charAt(0));
			 System.out.println("index of substring" + str1.indexOf("t", 3));
			 System.out.println(str1.insert(10, "hina"));
			 str1.delete(0,8);
			 System.out.println(" String is : " + str1);
			 System.out.println(str1.repeat(str1, 0));
			 System.out.println(" ");
			 System.out.println("________________________________string buffer________________________________________ ");
			 StringBuffer str2 = new StringBuffer("bad");
			 System.out.println("before apeend " + str2);
			 System.out.println(" ");
			 System.out.println(" ");


		}

	

	}


