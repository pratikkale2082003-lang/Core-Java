package TCS_Question;
import java.util.*;

public class HappySadState {

    // Function to check happy number
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        return n == 1;
    }

    public static void main(String[] args) {

        int n = 1000;
        int happy = 0;
        int sad = 0;

        for (int i = 1; i <= n; i++) {
            if (isHappy(i)) {
                happy++;
            } else {
                sad++;
            }
        }

        System.out.println("Happy: " + happy);
        System.out.println("Sad: " + sad);

        // percentage
        System.out.println("Happy %: " + (happy * 100 / n));
        System.out.println("Sad %: " + (sad * 100 / n));
    }
}