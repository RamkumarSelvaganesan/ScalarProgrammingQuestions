package scalar.intermediate;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MLMCalculatorTest {

    @Test
    public void testMembersAtLevel() {
        // r = 3, Level 0 => 1 member
        Assert.assertEquals(MLMCalculator.membersAtLevel(0, 3), 1);

        // r = 3, Level 1 => 3 members
        Assert.assertEquals(MLMCalculator.membersAtLevel(1, 3), 3);

        // r = 3, Level 5 => 243 members
        Assert.assertEquals(MLMCalculator.membersAtLevel(5, 3), 243);
    }

    @Test
    public void testTotalMembers() {
        // r = 3, Levels 0 to 0 => total 1
        Assert.assertEquals(MLMCalculator.totalMembers(0, 3), 1);

        // r = 3, Levels 0 to 1 => total 4 (1+3)
        Assert.assertEquals(MLMCalculator.totalMembers(1, 3), 4);

        // r = 3, Levels 0 to 5 => total 364
        Assert.assertEquals(MLMCalculator.totalMembers(5, 3), 364);
    }

    @Test
    public void testDifferentRatio() {
        // r = 2, Level 3 => 8 members
        Assert.assertEquals(MLMCalculator.membersAtLevel(3, 2), 8);

        // r = 2, Levels 0 to 3 => total 15
        Assert.assertEquals(MLMCalculator.totalMembers(3, 2), 15);
    }
}
