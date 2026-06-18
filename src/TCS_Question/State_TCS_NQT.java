package TCS_Question;


import java.util.*;

public class State_TCS_NQT {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         System.out.println("Ennter Number : ");
        int total = sc.nextInt(); // 1000

        // Case 1: 70% happy
        int happy1 = (total * 70) / 100;
        int sad1 = total - happy1;

        // Case 2: 50% happy
        int happy2 = (total * 50) / 100;
        int sad2 = total - happy2;

        System.out.println("Happy State 70%: " + happy1);
        System.out.println("Sad State 30%: " + sad1);

        System.out.println("Happy State 50%: " + happy2);
        System.out.println("Sad State 50%: " + sad2);
         sc.close();
    }
}