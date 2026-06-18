package TCS_Question;
public class ArrayRotation_tcs {

    public static int minRotations(int[] a, int[] b) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            boolean match = true;

            for (int j = 0; j < n; j++) {
                if (a[(i + j) % n] != b[j]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return Math.min(i, n - i);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,4,5,1,2};

        System.out.println(minRotations(arr1, arr2));
    }
}