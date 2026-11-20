public class CastingDemo {
    public static void main(String[] args) {
        // demonstrate implicit (widening) and explicit (narrowing) casting

        int a = 10;
        double b = 3.5;

        // Implicit: int to double
        double widened = a;
        System.out.println(widened);

        // Explicit: double to int
        int result = (int) b;
        System.out.println(result);

        char ch = 'A';

        // Implicit: char to int
        int value = ch + 5;
        System.out.println(value);

        // Explicit: int to char
        System.out.println((char) value);
    }
}
