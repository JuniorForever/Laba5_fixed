import org.junit.Test;

import static org.junit.Assert.*;

public class IntegralCalculateTest {
    IntegralCalculate integralCalculate = new IntegralCalculate();
    @Test
    public void integralCalculationNotRecursive() throws Exception {
            double actual = integralCalculate.integralCalculationNotRecursive(13, 10, 2);
            double expected = -1055.25;
            assertEquals(actual, expected, 0);
    }

    @Test
    public void integralCalculationRecursive() throws Exception {
            double actual = integralCalculate.integralCalculationRecursive(13, 10, 2);
            double expected = -1055.25;
            assertEquals(actual, expected, 0);
    }
}