import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {


    @org.junit.jupiter.api.Test
    void getBodyHeight() {
        BMICalculator BMICalculator = new BMICalculator("Julian", "Irmler", 12, 12.5, 'M');
        Assertions.assertEquals(12.0,BMICalculator.bodyHeight);
        Assertions.assertEquals(12.5, BMICalculator.bodyWeight);
    }

    @org.junit.jupiter.api.Test
    void getBodyWeight() {
        BMICalculator BMICalculator = new BMICalculator("Julian", "Irmler", 130, 12.5, 'M');
        Assertions.assertEquals(12.5, BMICalculator.bodyWeight);
        Assertions.assertEquals(130, BMICalculator.bodyHeight);
    }


    @Test
    void calculateBMI() {
        BMICalculator b = new BMICalculator("Julia", "Test", 180, 120.0, 'W');
        double erwartet = 37.03;
        b.calculateBMI();

        Assertions.assertEquals(b, erwartet);

    }
    @Test
    void caluclateBMICategory() {


    }




}