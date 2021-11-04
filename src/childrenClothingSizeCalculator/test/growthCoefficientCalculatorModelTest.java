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

    @Test
    void calculateGrowthCoefficient() throws Exception {
        float correctResult = 70;
        assertEquals(correctResult, growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(validHeight, validWaist, validChest));
    }

    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Grenzwertanalyse<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/

    @Test
    void calculateGrowthCoefficientHeightLimitValue92() throws Exception {
        float heightValueUnderLimitValue = 91.99f;
        float heightValueIsLimitValue = 92f;
        float heightValueOverLimitValue = 92.01f;
        String heightValueUnderLimitValueExpectedErrorMessage = "The height has to be between 92 and 176";
        float heightValueIsLimitValueExpectedResult = (92f + 55f + 55f) / 3f;
        float heightValueOverLimitValueExpectedResult = (92.01f + 55f + 55f) / 3f;

        Exception exception = assertThrows(Exception.class, () -> growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(heightValueUnderLimitValue, validWaist, validChest));
        assertEquals(heightValueUnderLimitValueExpectedErrorMessage, exception.getMessage());
        assertEquals(heightValueIsLimitValueExpectedResult, growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(heightValueIsLimitValue, validWaist, validChest));
        assertEquals(heightValueOverLimitValueExpectedResult, growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(heightValueOverLimitValue, validWaist, validChest));
    }

    @Test
    void calculateGrowthCoefficientHeightLimitValue176() throws Exception {
        float heightValueUnderLimitValue = 175.99f;
        float heightValueIsLimitValue = 176f;
        float heightValueOverLimitValue = 176.01f;
        float heightValueUnderLimitValueExpectedResult = (175.99f + 55f + 55f) / 3f;
        float heightValueIsLimitValueExpectedResult = (176f + 55f + 55f) / 3f;
        String heightValueOverLimitValueExpectedErrorMessage = "The height has to be between 92 and 176";

        assertEquals(heightValueUnderLimitValueExpectedResult, growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(heightValueUnderLimitValue, validWaist, validChest));
        assertEquals(heightValueIsLimitValueExpectedResult, growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(heightValueIsLimitValue, validWaist, validChest));
        Exception exception = assertThrows(Exception.class, () -> growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(heightValueOverLimitValue, validWaist, validChest));
        assertEquals(heightValueOverLimitValueExpectedErrorMessage, exception.getMessage());
    }

    @Test
    void calculateGrowthCoefficientWaistLimitValue51() throws Exception {
        float waistValueUnderLimitValue = 50.99f;
        float waistValueIsLimitValue = 51f;
        float waistValueOverLimitValue = 51.01f;
        String waistValueUnderLimitValueExpectedErrorMessage = "The waist measurements have to be between 51 and 70";
        float waistValueIsLimitValueExpectedResult = (100f + 51f + 55f) / 3f;
        float waistValueOverLimitValueExpectedResult = (100f + 51.01f + 55f) / 3f;

        Exception exception = assertThrows(Exception.class, () -> growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(validHeight, waistValueUnderLimitValue, validChest));
        assertEquals(waistValueUnderLimitValueExpectedErrorMessage, exception.getMessage());
        assertEquals(waistValueIsLimitValueExpectedResult, growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(validHeight, waistValueIsLimitValue, validChest));
        assertEquals(waistValueOverLimitValueExpectedResult, growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(validHeight, waistValueOverLimitValue, validChest));
    }

    @Test
    void calculateGrowthCoefficientWaistLimitValue70() throws Exception {
        float waistValueUnderLimitValue = 69.99f;
        float waistValueIsLimitValue = 70f;
        float waistValueOverLimitValue = 70.01f;
        float waistValueUnderLimitValueExpectedResult = (100f + 69.99f + 55f) / 3f;
        float waistValueIsLimitValueExpectedResult = (100f + 70f + 55f) / 3f;
        String waistValueOverLimitValueExpectedErrorMessage = "The waist measurements have to be between 51 and 70";

        assertEquals(waistValueUnderLimitValueExpectedResult, growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(validHeight, waistValueUnderLimitValue, validChest));
        assertEquals(waistValueIsLimitValueExpectedResult, growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(validHeight, waistValueIsLimitValue, validChest));
        Exception exception = assertThrows(Exception.class, () -> growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(validHeight, waistValueOverLimitValue, validChest));
        assertEquals(waistValueOverLimitValueExpectedErrorMessage, exception.getMessage());
    }

    @Test
    void calculateGrowthCoefficientChestLimitValue54() throws Exception {
        float chestValueUnderLimitValue = 53.99f;
        float chestValueIsLimitValue = 54f;
        float chestValueOverLimitValue = 54.01f;
        String chestValueUnderLimitValueExpectedErrorMessage = "The chest measurements have to be between 54 and 88";
        float chestValueIsLimitValueExpectedResult = (100f + 55f + 54f) / 3f;
        float chestValueOverLimitValueExpectedResult = (100f + 55f + 54.01f) / 3f;

        Exception exception = assertThrows(Exception.class, () -> growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(validHeight, validWaist, chestValueUnderLimitValue));
        assertEquals(chestValueUnderLimitValueExpectedErrorMessage, exception.getMessage());
        assertEquals(chestValueIsLimitValueExpectedResult, growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(validHeight, validWaist, chestValueIsLimitValue));
        assertEquals(chestValueOverLimitValueExpectedResult, growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(validHeight, validWaist, chestValueOverLimitValue));
    }

    @Test
    void calculateGrowthCoefficientChestLimitValue88() throws Exception {
        float chestValueUnderLimitValue = 87.99f;
        float chestValueIsLimitValue = 88f;
        float chestValueOverLimitValue = 88.01f;
        float chestValueUnderLimitValueExpectedResult = (100f + 55f + 87.99f) / 3f;
        float chestValueIsLimitValueExpectedResult = (100f + 55f + 88f) / 3f;
        String chestValueOverLimitValueExpectedErrorMessage = "The chest measurements have to be between 54 and 88";

        assertEquals(chestValueUnderLimitValueExpectedResult, growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(validHeight, validWaist, chestValueUnderLimitValue));
        assertEquals(chestValueIsLimitValueExpectedResult, growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(validHeight, validWaist, chestValueIsLimitValue));
        Exception exception = assertThrows(Exception.class, () -> growthCoefficientCalculatorModelUnderTest.calculateGrowthCoefficient(validHeight, validWaist, chestValueOverLimitValue));
        assertEquals(chestValueOverLimitValueExpectedErrorMessage, exception.getMessage());
    }

}