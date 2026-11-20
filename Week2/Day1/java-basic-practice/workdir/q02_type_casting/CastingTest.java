public class CastingTest {
    public static void main(String[] args) {

        int a = 10;
        double b = 3.5;

        int result = (int) (a + b);

        System.out.println(result);

        char ch = 'A';
        int value = ch + 5;

        System.out.println(value);
        System.out.println((char) value);
    }
}
