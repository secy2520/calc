import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



    public class CalculatorTest {

        @Test
        public void testAdd() {
            Calculator calculator = new Calculator();
            int result = calculator.add(3, 4);
            assertEquals(7, result);
        }

        @Test
        public void testSubtract() {
            Calculator calculator = new Calculator();
            int result = calculator.subtract(8, 3);
            assertEquals(5, result);
        }

        @Test
        public void testMultiply() {
            Calculator calculator = new Calculator();
            int result = calculator.multiply(5, 6);
            assertEquals(30, result);

        }
        @Test
        public void testDivide()
        {
            Calculator calculator = new Calculator();
            int result = calculator.divide(6,2);
            assertEquals(3,result);
        }
    }
