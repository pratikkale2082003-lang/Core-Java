package practical;

public class AvgofArray2 {
public static void main(String[] args) {
	  int arr [] = {20,30,10};
      
      double  sum = 0;
      for( int i =0; i< arr.length; i++){
          sum = sum+ arr[i];
          
      }
      double avg = sum / arr.length;
      System.out.println("Avg of number is : " + avg);
}
}
