public class Main {
    public static void main(String[] args) {
        ResultService portal = new ResultService();

        portal.sendResult(null);
        System.out.println(portal.classAverage(450, 0));
        System.out.println(portal.readMarks("eighty"));
        System.out.println(portal.getSubject(5));

        Student priya = new Student("Priya", 90);
        try {
            portal.recordMarks(priya, -20);
            System.out.println("Marks: " + priya.marks);   // prints -20 - wrong!
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        
    }
}
