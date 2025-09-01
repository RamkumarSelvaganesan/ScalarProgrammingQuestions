package scalar.intermediate;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FactorsTest {

    Factors factors;

    @BeforeTest
    public void setup() {
        factors = new Factors();
    }

    // ✅ Tests for getNoOfFactors()
    @Test
    public void testPrimeNumberFactors() {
        Assert.assertEquals(factors.getNoOfFactors(7), 2, "7 should have 2 factors");
    }

    @Test
    public void testCompositeNumberFactors() {
        Assert.assertEquals(factors.getNoOfFactors(10), 4, "10 should have 4 factors");
    }

    @Test
    public void testPerfectSquareFactors() {
        Assert.assertEquals(factors.getNoOfFactors(16), 5, "16 should have 5 factors");
    }

    @Test
    public void testOneFactors() {
        Assert.assertEquals(factors.getNoOfFactors(1), 1, "1 should have 1 factor");
    }

    @Test
    public void testLargeNumberFactors() {
        Assert.assertEquals(factors.getNoOfFactors(100), 9, "100 should have 9 factors");
    }

    @Test
    public void testNegativeNumberFactors() {
        Assert.assertEquals(factors.getNoOfFactors(-10), 4, "-10 should have 4 factors");
    }

    @Test
    public void testZeroFactors() {
        Assert.assertEquals(factors.getNoOfFactors(0), 0, "0 should return 0 factors");
    }

    // ✅ Tests for isPrime()
    @Test
    public void testIsPrimeTrue() {
        Assert.assertTrue(factors.isPrime(7), "7 should be prime");
    }

    @Test
    public void testIsPrimeFalseComposite() {
        Assert.assertFalse(factors.isPrime(10), "10 is not prime");
    }

    @Test
    public void testIsPrimeFalseOne() {
        Assert.assertFalse(factors.isPrime(1), "1 is not prime");
    }

    @Test
    public void testIsPrimeFalseZero() {
        Assert.assertFalse(factors.isPrime(0), "0 is not prime");
    }

    @Test
    public void testIsPrimeFalseNegative() {
        Assert.assertFalse(factors.isPrime(-7), "-7 is not prime");
    }
}
