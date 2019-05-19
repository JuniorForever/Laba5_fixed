import org.junit.Test;

public class IntegralParametrsExceptionTest {
    IntegralCalculate integralCalculate = new IntegralCalculate();
    @Test(expected = IntegralParametrsException.class)
    public void integralParametrsExceptionTest() throws IntegralParametrsException{
        integralCalculate.integralCalculationRecursive(10,11,0);
    }
}