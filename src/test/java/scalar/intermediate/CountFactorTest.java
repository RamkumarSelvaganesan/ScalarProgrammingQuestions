package scalar.intermediate;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CountFactorTest {

    CountFactor countFactor;

    @BeforeTest
    public void setup() {
        countFactor = new CountFactor();
    }

    @Test
    public void testPrimeNumber() {
        // Prime number (7) should have 2 factors: 1, 7
        Assert.assertEquals(countFactor.getNoOfFactors(7), 2);
    }

    @Test
    public void testCompositeNumber() {
        // Composite number (10) should have 4 factors: 1, 2, 5, 10
        Assert.assertEquals(countFactor.getNoOfFactors(10), 4);
    }

    @Test
    public void testPerfectSquare() {
        // Perfect square (16) should have 5 factors: 1, 2, 4, 8, 16
        Assert.assertEquals(countFactor.getNoOfFactors(16), 5);
    }

    @Test
    public void testOne() {
        // Edge case: 1 should have 1 factor: 1
        Assert.assertEquals(countFactor.getNoOfFactors(1), 1);
    }

    @Test
    public void testLargeNumber() {
        // Large number to ensure performance
        Assert.assertEquals(countFactor.getNoOfFactors(100), 9);
    }

    @Test
    public void testNegativeNumber() {
        // Negative input handling (expect same as abs value)
        Assert.assertEquals(countFactor.getNoOfFactors(-10), 4);
    }

    @Test
    public void testZero() {
        // Edge case: 0 has infinite divisors; define behavior as 0
        Assert.assertEquals(countFactor.getNoOfFactors(0), 0);
    }
}
