public class Swap {

    /** swap using + and - ; return {newA, newB} */
    public static int[] swapArithmetic(int a, int b) {
        if (a > b) {
            a -= b;     // a becomes difference between a and b
            b += a;     // b becomes original a
            a = b - a;  // a becomes original b via subtracting difference (itself)
        } else {
            b -= a;     // same as above but in reverse
            a += b;
            b = a - b;
        }

        int[] out = {a, b};
        return out;
    }

    /** swap using XOR ; return {newA, newB} */
    public static int[] swapXor(int a, int b) {
        a = a ^ b;
        b = b ^ a;
        a = b ^ a;

        int[] out = {a, b};
        return out;
    }

    public static void main(String[] args) {
        // TODO
    }
}
