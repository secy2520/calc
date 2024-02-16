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
    public void testdiv2() {
        Scientific_calc calculator = new Scientific_calc();

        Assertions.assertThrows(ArithmeticException.class, () -> {
            double result = calculator.divide(-4,0);
        });
    }
    @Test
    public void testsquare() {
        Scientific_calc calculator = new Scientific_calc();
        double result = calculator.mySqrt(25);
        Assertions.assertEquals(5, result);
    }
    @Test
    public void testfactorial() {
        Scientific_calc calculator = new Scientific_calc();
        double result = calculator.fact(6);
        Assertions.assertEquals(720, result);
    }
    @Test
    public void testfact2() {
        Scientific_calc calculator = new Scientific_calc();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double result = calculator.fact(-6);
        });
    }
    @Test
    public void testpower1() {
        Scientific_calc calculator = new Scientific_calc();
        double result = calculator.pow(7,2);
        Assertions.assertEquals(49, result);
        double res = calculator.pow(2,-1);
        Assertions.assertEquals(0.5, res);
    }
    @Test
    public void testpower2() {
        Scientific_calc calculator = new Scientific_calc();
        double res = calculator.pow(2,-1);
        Assertions.assertEquals(0.5, res);
    }



    @Test
    public void testlog1() {
        Scientific_calc calculator = new Scientific_calc();
        double result = calculator.nat_log(9);
        Assertions.assertEquals(2.1972245773362196, result);
    }
    @Test
    public void testlog2() {
        Scientific_calc calculator = new Scientific_calc();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double result = calculator.nat_log(-4);
        });
    }


}
