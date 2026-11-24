package com.myexception;

public class TestException {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        try{ 
            System.out.println(arr[3]);

            // int x = 10/0;

            String name = "Max";
            name = null;
            System.out.println(name.length());
        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e){
            System.out.println("An exception occurred: " + e.getMessage());
        }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Array index out of bounds: " + e.getMessage());
        // }
        // catch(ArithmeticException e){
        //     System.out.println("You cannot divide a number by zero: " + e.getMessage());
        // }
        // catch(NullPointerException e){
        //     System.out.println("Null pointer exception: " + e.getMessage());
        // }
        // catch(Exception e){
        //     System.out.println("An exception occurred: " + e.getMessage());
        // } finally {
        //     System.out.println("This block is always executed.");
        // }
        System.out.println("Program exited.");
    }
}
