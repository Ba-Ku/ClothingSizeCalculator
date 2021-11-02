package childrenClothingSizeCalculator.test;

import childrenClothingSizeCalculator.growthCoefficientCalculatorModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class growthCoefficientCalculatorModelTest {
    float validHeight = 100;
    float validWaist = 55;
    float validChest = 55;
    growthCoefficientCalculatorModel growthCoefficientCalculatorModelUnderTest = new growthCoefficientCalculatorModel();

    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Äquivalenzklassen<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
    @Test
    void calculateGrowthCoefficientHeightMinusTo92() {
        float invalidHeightTooLow = 90;
        String errorMessage = "The height has to be between 92 and 176";
        Exception exception = assertThrows(Exception.class, () -> growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(invalidHeightTooLow, validWaist, validChest));
        assertEquals(errorMessage, exception.getMessage());
    }

    @Test
    void calculateGrowthCoefficientHeightBigger176() {
        float invalidHeightTooHigh = 180;
        String errorMessage = "The height has to be between 92 and 176";
        Exception exception = assertThrows(Exception.class, () -> growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(invalidHeightTooHigh, validWaist, validChest));
        assertEquals(errorMessage, exception.getMessage());
    }

    @Test
    void calculateGrowthCoefficientWaistMinusTo51() {
        float invalidWaistTooSmall = 50;
        String errorMessage = "The waist measurements have to be between 51 and 70";
        Exception exception = assertThrows(Exception.class, () -> growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(validHeight, invalidWaistTooSmall, validChest));
        assertEquals(errorMessage, exception.getMessage());
    }

    @Test
    void calculateGrowthCoefficientWaistBigger70() {
        float invalidWaistTooBig = 71;
        String errorMessage = "The waist measurements have to be between 51 and 70";
        Exception exception = assertThrows(Exception.class, () -> growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(validHeight, invalidWaistTooBig, validChest));
        assertEquals(errorMessage, exception.getMessage());
    }

    @Test
    void calculateGrowthCoefficientChestMinusTo54() {
        float invalidChestTooSmall = 50;
        String errorMessage = "The chest measurements have to be between 54 and 88";
        Exception exception = assertThrows(Exception.class, () -> growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(validHeight, validWaist, invalidChestTooSmall));
        assertEquals(errorMessage, exception.getMessage());
    }

    @Test
    void calculateGrowthCoefficientChestBigger88() {
        float invalidChestTooBig = 90;
        String errorMessage = "The chest measurements have to be between 54 and 88";
        Exception exception = assertThrows(Exception.class, () -> growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(validHeight, validWaist, invalidChestTooBig));
        assertEquals(errorMessage, exception.getMessage());
    }

    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Grenzwerttests<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/


    @Test
    void calculateGrowthCoefficient() throws Exception {
        float correctResult = 70;
        assertEquals(correctResult, growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(validHeight, validWaist, validChest));
    }

}