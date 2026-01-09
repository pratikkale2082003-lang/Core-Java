package practical;

public class logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n =3;
for( int i = 1; i <=n; i++) {
	 for(int s = n; s>=i; s--){
	System.out.print(" ");
}
	 
	 for(int j = 1; j<=i; j++) {
		 System.out.print(i + " ");
	 }
	 System.out.println();
}

	}

}
