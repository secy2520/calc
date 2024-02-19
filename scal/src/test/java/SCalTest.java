import com.group.app.Scientific_calc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SCalTest {

    @Test
    public void testAdd() {
        Scientific_calc calculator = new Scientific_calc();
        int result = calculator.add(3, 4);
        Assertions.assertEquals(7, result);
    }

    @Test
    public void testSubtract() {
        Scientific_calc calculator = new Scientific_calc();
        int result = calculator.subtract(8, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        Scientific_calc calculator = new Scientific_calc();
        int result = calculator.multiply(5, 6);
        Assertions.assertEquals(30, result);
    }

    @Test
    public void testDivide() {
        Scientific_calc calculator = new Scientific_calc();
        int result = calculator.divide(6, 2);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testDivideByZero() {
        Scientific_calc calculator = new Scientific_calc();
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(6, 0);
        });
    }

    @Test
    public void testSquareRoot() {
        Scientific_calc calculator = new Scientific_calc();
        double result = calculator.mySqrt(25);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testNaturalLog() {
        Scientific_calc calculator = new Scientific_calc();
        double result = calculator.nat_log(9);
        Assertions.assertEquals(2.1972245773362196, result);
    }

    @Test
    public void testFactorial() {
        Scientific_calc calculator = new Scientific_calc();
        double result = calculator.fact(6);
        Assertions.assertEquals(720, result);
    }

    @Test
    public void testFactorialWithNegativeInput() {
        Scientific_calc calculator = new Scientific_calc();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.fact(-6);
        });
    }

    @Test
    public void testPower() {
        Scientific_calc calculator = new Scientific_calc();
        double result = calculator.power(2, 3);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testPowerWithNegativeExponent() {
        Scientific_calc calculator = new Scientific_calc();
        double result = calculator.power(2, -1);
        Assertions.assertEquals(0.5, result);
    }

    @Test
    public void testpower2() {

        Scientific_calc calculator = new Scientific_calc();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.power(0, 0);
        });
    }

}
