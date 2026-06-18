package Question;

public class WithoutMainMethod {

    static {
        System.out.println("Hello Without main Method (static block)");
        System.exit(0);
    }

//    public static void main(String[] args) {
        // main method is mandatory from Java 7+
//    }
}
