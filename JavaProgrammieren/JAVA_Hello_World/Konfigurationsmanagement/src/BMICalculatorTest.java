import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @org.junit.jupiter.api.Test
    void getBodyHeight() {
        BMICalculator BMICalculator = new BMICalculator("Julian", "Irmler", 12, 12.5, 'M');
        Assertions.assertEquals(2,BMICalculator.bodyHeight);
        Assertions.assertEquals(3, BMICalculator.bodyWeight);
    }

    @org.junit.jupiter.api.Test
    void getBodyWeight() {
        BMICalculator BMICalculator = new BMICalculator("Julian", "Irmler", 12, 12.5, 'M');
        Assertions.assertEquals(5, BMICalculator.bodyWeight);
        Assertions.assertEquals(4, BMICalculator.bodyHeight);
    }


    @Test
    void testGetBodyHeight() {
        double erwartet = 24.777;
        BMICalculator a = new BMICalculator("Julia", "Test", 170, 70.0, 'W');
        a.calculateBMI();

        Assertions.assertEquals(a,erwartet);
    }

    @Test
    void testGetBodyWeight() {
    }

    @Test
    void calculateBMI() {
    }
}