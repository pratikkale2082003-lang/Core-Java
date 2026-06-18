package corejava;


//Write a Program to find the  Second  Largest in an Array
public class TestBset_Q1 {
 public static void main(String[] args) {
    
     int arr[] = { 9, 7, 5, 8, 2};
     
 
  int  largest =0;
   for ( int i = 0; i< arr.length; i++){

if ( arr[i] > largest){
   largest = arr[i];
   
}
   }
   
    System.out.println("The Largest Number is : " + largest);
     int second = 0;
      for ( int i = 0; i< arr.length; i++){
      if ( arr[i] > second && arr[i] != largest){
          second = arr[i];
      }
      }
       System.out.println("The Second Largest Number is : "+ second);
}
}
