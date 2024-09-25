import org.example.Main;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class CalculatorTest {
    private Main calculator;

    @Before
    public void setUp() {
        calculator = new Main(); // Assuming your calculator class is named Main
    }

    // Test for square root function
    @Test
    public void testSquareRoot() {
        double result = calculator.squareRoot(25);
        Assert.assertEquals(5.0, result, 0.0001);

        result = calculator.squareRoot(0);
        Assert.assertEquals(0.0, result, 0.0001);

        // Test with a negative number to check if it's handled (you can customize behavior in the Main class)
        result = calculator.squareRoot(-9);
        Assert.assertTrue("Square root of negative number should be NaN", Double.isNaN(result));
    }

    // Test for factorial function
    @Test
    public void testFactorial() {
        long result = calculator.factorial(5);
        Assert.assertEquals(120, result);

        result = calculator.factorial(0); // Factorial of 0 should be 1
        Assert.assertEquals(1, result);

        result = calculator.factorial(1); // Factorial of 1 should be 1
        Assert.assertEquals(1, result);
    }

    // Test for natural logarithm (ln(x))
    @Test
    public void testNaturalLogarithm() {
        double result = calculator.naturalLogarithm(Math.E); // ln(e) should be 1
        Assert.assertEquals(1.0, result, 0.0001);

        result = calculator.naturalLogarithm(1); // ln(1) should be 0
        Assert.assertEquals(0.0, result, 0.0001);

        // Test with a non-positive number (natural logarithm is undefined for non-positive numbers)
        result = calculator.naturalLogarithm(-5);
        Assert.assertTrue("Natural logarithm of negative number should be NaN", Double.isNaN(result));

        result = calculator.naturalLogarithm(0);
        Assert.assertTrue("Natural logarithm of zero should be -Infinity", Double.isInfinite(result));
    }

    // Test for power function (x^b)
    @Test
    public void testPower() {
        double result = calculator.power(2, 3); // 2^3 should be 8
        Assert.assertEquals(8.0, result, 0.0001);

        result = calculator.power(5, 0); // Any number to the power of 0 should be 1
        Assert.assertEquals(1.0, result, 0.0001);

        result = calculator.power(2, -2); // 2^-2 should be 0.25
        Assert.assertEquals(0.25, result, 0.0001);
    }
}
