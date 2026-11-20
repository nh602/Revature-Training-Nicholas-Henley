public class ReverseNumber {

    /** Reverse the digits of n. Return 0 if the result overflows int. */
    public static int reverse(int n) {
        int out = 0;

        while (n != 0) {
            // extract rightmost digit
            int digit = n % 10;

            // Check for positive overflow
            if (out > Integer.MAX_VALUE / 10 ||
                (out == Integer.MAX_VALUE / 10 &&
                digit > Integer.MAX_VALUE % 10)) {
                return 0;
            }

            // check for negative overflow
            if (out < Integer.MIN_VALUE / 10 ||
                (out == Integer.MIN_VALUE / 10 &&
                digit < Integer.MIN_VALUE % 10)) {
                return 0;
            }

            // Shift number left and add digit to the right
            out = out * 10 + digit;
            // drop the rightmost digit of n
            n /= 10;
        }

        return out;
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.printf("Reversed: %d", reverse(num));
    }
}
