package week2.day2.assignment1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BillingApplicationTest {

    @Test
    public void testDiscountBelow1000() {
        // Rs. 800 is below the discount threshold, so no discount is expected.
        double expected = 0.0;
        double actual = BillingApplication.calculateDiscount(800);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testDiscountExactly1000() {
        // At Rs. 1,000, the 5% discount gives Rs. 50.
        double expected = 50.0;
        double actual = BillingApplication.calculateDiscount(1000);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testDiscount4999() {
        // Rs. 4,999 is below Rs. 5,000, so it receives the 5% discount.
        double expected = 249.95;
        double actual = BillingApplication.calculateDiscount(4999);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testDiscountExactly5000() {
        // At Rs. 5,000, the discount rate changes to 10%, giving Rs. 500.
        double expected = 500.0;
        double actual = BillingApplication.calculateDiscount(5000);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testDiscountAbove5000() {
        // Rs. 7,000 is above Rs. 5,000, so it receives the 10% discount.
        double expected = 700.0;
        double actual = BillingApplication.calculateDiscount(7000);
        assertEquals(expected, actual, 0.001);
    }
}
