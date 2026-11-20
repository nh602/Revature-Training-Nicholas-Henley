public class EmployeeProcessor {

    /** @return parsed salary or null if invalid */
    public static Double parseSalary(String s) {
        try {
            return Double.parseDouble(s);
        } catch (Exception e) {
            return null;
        }
    }

    public static double bonus(double basic, double bonusPct) {
        if (basic < 1) return 0;
        return basic * bonusPct / 100;
    }

    public static double finalSalary(double basic, double bonusPct) {
        if (basic < 1) return 0;
        return basic + bonus(basic, bonusPct);
    }

    /** true if finalSalary > 75000 */
    public static boolean aboveThreshold(double finalSalary) {
        return finalSalary > 75000 ? true : false;
    }

    public static String upperName(String name) {
        return name.toUpperCase();
    }

    /** reverse using StringBuilder: Rahul -> luhaR */
    public static String reverseName(String name) {
        StringBuilder sb = new StringBuilder();

        for(int i = name.length() - 1; i >= 0; i--) {
            sb.append(name.charAt(i));
        }

        return sb.toString();
    }

    /**
     * Build the full report. Expected for ("101","Rahul","60000","20","true"):
     *   Employee ID: 101
     *   Employee Name: RAHUL
     *   Basic Salary: 60000.0
     *   Bonus: 12000.0
     *   Final Salary: 72000.0
     *   Active: true
     *   Reversed Name: luhaR
     *   Salary above 75000: No
     */
    public static String report(String id, String name, String basicSalary, String bonusPct, String active) {
        Double basic = parseSalary(basicSalary);
        Double pct = parseSalary(bonusPct);
        if (basic == null || pct == null) {
            return "Invalid salary input";
        }

        double bonus = bonus(basic, pct);
        double finalSalary = finalSalary(basic, pct);

        return String.join("\n",
                "Employee ID: " + id,
                "Employee Name: " + upperName(name),
                "Basic Salary: " + basic,
                "Bonus: " + bonus,
                "Final Salary: " + finalSalary,
                "Active: " + Boolean.parseBoolean(active),
                "Reversed Name: " + reverseName(name),
                "Salary above 75000: " + (aboveThreshold(finalSalary) ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        // TODO: sample run, object reference vs new object demo, invalid input handling
    }
}
