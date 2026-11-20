public class WrapperConversion {

    /** @return the parsed Integer, or null if s isn't a valid int */
    public static Integer parseAge(String s) {
        Integer x;
        try {
            x = Integer.parseInt(s);
        } catch (Exception e) {
            return null; // returns null on NumberFormatException
        };

        return x;
    }

    /** @return the parsed Double, or null if s isn't a valid double */
    public static Double parseSalary(String s) {
        Double out;
        try {
            out = Double.parseDouble(s);
        } catch (Exception e) {
            return null;
        }

        return out;
    }

    public static Boolean parseActive(String s) {
        Boolean active;
        try {
            active = Boolean.parseBoolean(s);
        } catch (Exception e) {
            return null;
        }

        return active;
    }

    /** salary after a 10% increment */
    public static double incrementSalary(double salary) {
        return salary * 1.1;
    }

    public static void main(String[] args) {
        String age = "25";
        String salary = "45000.75";
        String active = "true";

        // Printf statement using string format (coding is my passion)
        System.out.printf(
            "Age: %d\nActive: %B\nSalary (after raise): %.2f\n", 
            parseAge(age), 
            parseActive(active), 
            parseSalary(salary)
        );
    }
}
