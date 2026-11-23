/**
 * Java Methods Lab - fill in every method body, then write main().
 * Each method is a stub that throws UnsupportedOperationException (shows as TODO in the tests).
 * Delete the "throw" lines as you implement them. Keep the signatures.
 */
public class MethodLab {

    // ---------- Part 1 ----------
    public static void printProfile(String name, int age, double height, boolean student, char grade) {
        System.out.println("Name: %s".formatted(name));
        System.out.println("Age: %d".formatted(age));
        System.out.println("Height: %.1f".formatted(height));
        System.out.println("Student: %b".formatted(student));
        System.out.println("Grade: %c".formatted(grade));
    }

    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static boolean fitsInByte(int value) {
        return (value >= -128 && value <128) ? true : false;
    }


    // ---------- Part 2 ----------
    public static int addTexts(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    public static Integer boxTwice(int x) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void describe(Integer n) {
        throw new UnsupportedOperationException("TODO");
    }

    public static boolean sameValue(Integer a, Integer b) {
        throw new UnsupportedOperationException("TODO");
    }


    // ---------- Part 3 ----------
    public static int truncate(double d) {
        throw new UnsupportedOperationException("TODO");
    }

    public static double widen(int i) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void overflowDemo() {
        throw new UnsupportedOperationException("TODO");
    }

    public static char shiftLetter(char c, int by) {
        throw new UnsupportedOperationException("TODO");
    }


    // ---------- Part 4 ----------
    public static void describeValue(int v) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void describeValue(double v) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void describeValue(String v) {
        throw new UnsupportedOperationException("TODO");
    }


    // ---------- Part 5 ----------
    public static void tryChange(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void appendBang(StringBuilder sb) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void replaceBuilder(StringBuilder sb) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void shout(String s) {
        throw new UnsupportedOperationException("TODO");
    }


    // ---------- Part 6 ----------
    public static void compareRefs() {
        throw new UnsupportedOperationException("TODO");
    }

    public static int safeLength(String s) {
        throw new UnsupportedOperationException("TODO");
    }


    // ---------- Part 7 ----------
    public static String initials(String first, String last) {
        throw new UnsupportedOperationException("TODO");
    }

    public static String clean(String raw) {
        throw new UnsupportedOperationException("TODO");
    }

    public static boolean isPalindromeWord(String w) {
        throw new UnsupportedOperationException("TODO");
    }

    public static String maskEmail(String email) {
        throw new UnsupportedOperationException("TODO");
    }


    // ---------- Part 8 ----------
    public static String buildCsv(String a, String b, String c) {
        throw new UnsupportedOperationException("TODO");
    }

    public static String edit(String text) {
        throw new UnsupportedOperationException("TODO");
    }

    public static long timeJoin(boolean useBuilder) {
        throw new UnsupportedOperationException("TODO");
    }

    public static String safeAppend(StringBuffer sb, String part) {
        throw new UnsupportedOperationException("TODO");
    }


    // ---------- Part 9 ----------
    public static String formatReceipt(String customer, int quantity, double unitPrice) {
        throw new UnsupportedOperationException("TODO");
    }


    // ---------- Section B ----------
    public static double toFahrenheit(double celsius) {
        throw new UnsupportedOperationException("TODO");
    }

    public static int percent(int obtained, int total) {
        throw new UnsupportedOperationException("TODO");
    }

    public static String describeInt(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void swap(int a, int b) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void addTitle(StringBuilder name) {
        throw new UnsupportedOperationException("TODO");
    }

    public static String addTitleToString(String name) {
        throw new UnsupportedOperationException("TODO");
    }

    public static int countChar(String s, char c) {
        throw new UnsupportedOperationException("TODO");
    }

    public static String capitalize(String word) {
        throw new UnsupportedOperationException("TODO");
    }

    public static String padLeft(String s, int width, char fill) {
        throw new UnsupportedOperationException("TODO");
    }

    public static String joinWithDash(String s, int times) {
        throw new UnsupportedOperationException("TODO");
    }

    public static int roundHalfUp(double d) {
        throw new UnsupportedOperationException("TODO");
    }

    public static int factorialInt(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    public static long factorialLong(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    public static int countVowels(String s) {
        throw new UnsupportedOperationException("TODO");
    }

    public static String summarize(String text) {
        throw new UnsupportedOperationException("TODO");
    }


    public static void main(String[] args) {
        // Call every method from here and print the labelled output shown in the lab sheet.
        throw new UnsupportedOperationException("TODO");
    }
}
