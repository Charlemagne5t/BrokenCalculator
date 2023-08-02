import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void brokenCalcTest1() {
        int startValue = 2;
        int target = 3;
        int expected = 2;
        int actual = new Solution().brokenCalc(startValue, target);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void brokenCalcTest2() {
        int startValue = 5;
        int target = 8;
        int expected = 2;
        int actual = new Solution().brokenCalc(startValue, target);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void brokenCalcTest3() {
        int startValue = 3;
        int target = 10;
        int expected = 3;
        int actual = new Solution().brokenCalc(startValue, target);

        Assert.assertEquals(expected, actual);
    }
}
