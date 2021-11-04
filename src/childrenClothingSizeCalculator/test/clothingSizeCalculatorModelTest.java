package childrenClothingSizeCalculator.test;

import childrenClothingSizeCalculator.clothingSizeCalculatorModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class clothingSizeCalculatorModelTest {
    clothingSizeCalculatorModel clothingSizeCalculatorUnderTest = new clothingSizeCalculatorModel();


    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Äquivalenzklassen<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
    @Test
    void getClothingSizeMinusTo92() {
        float invalidHeightTooLow = 1;
        String errorMessage = "The inputvalue for height does not match with common sizes for childrensclothing! May we suggest searching for babyclothing?";
        Exception exception = assertThrows(Exception.class, () -> clothingSizeCalculatorUnderTest.getClothingSize(invalidHeightTooLow));
        assertEquals(errorMessage, exception.getMessage());
    }

    @Test
    void getClothingSizeIs92() throws Exception {
        float validHeight = 92;
        float expectedResult = 92;
        assertEquals(expectedResult, clothingSizeCalculatorUnderTest.getClothingSize(validHeight));
    }

    @Test
    void getClothingSize92To98() throws Exception {
        float validHeight = 96;
        float expectedResult = 98;
        assertEquals(expectedResult, clothingSizeCalculatorUnderTest.getClothingSize(validHeight));
    }

    @Test
    void getClothingSize98To104() throws Exception {
        float validHeight = 102;
        float expectedResult = 104;
        assertEquals(expectedResult, clothingSizeCalculatorUnderTest.getClothingSize(validHeight));
    }

    @Test
    void getClothingSize104To110() throws Exception {
        float validHeight = 106;
        float expectedResult = 110;
        assertEquals(expectedResult, clothingSizeCalculatorUnderTest.getClothingSize(validHeight));
    }

    @Test
    void getClothingSize110To116() throws Exception {
        float validHeight = 112;
        float expectedResult = 116;
        assertEquals(expectedResult, clothingSizeCalculatorUnderTest.getClothingSize(validHeight));
    }

    @Test
    void getClothingSize116To122() throws Exception {
        float validHeight = 118;
        float expectedResult = 122;
        assertEquals(expectedResult, clothingSizeCalculatorUnderTest.getClothingSize(validHeight));
    }

    @Test
    void getClothingSize122To128() throws Exception {
        float validHeight = 124;
        float expectedResult = 128;
        assertEquals(expectedResult, clothingSizeCalculatorUnderTest.getClothingSize(validHeight));
    }

    @Test
    void getClothingSize128To134() throws Exception {
        float validHeight = 130;
        float expectedResult = 134;
        assertEquals(expectedResult, clothingSizeCalculatorUnderTest.getClothingSize(validHeight));
    }

    @Test
    void getClothingSize134To140() throws Exception {
        float validHeight = 136;
        float expectedResult = 140;
        assertEquals(expectedResult, clothingSizeCalculatorUnderTest.getClothingSize(validHeight));
    }

    @Test
    void getClothingSize140To146() throws Exception {
        float validHeight = 142;
        float expectedResult = 146;
        assertEquals(expectedResult, clothingSizeCalculatorUnderTest.getClothingSize(validHeight));
    }

    @Test
    void getClothingSize146To152() throws Exception {
        float validHeight = 148;
        float expectedResult = 152;
        assertEquals(expectedResult, clothingSizeCalculatorUnderTest.getClothingSize(validHeight));
    }

    @Test
    void getClothingSize152To158() throws Exception {
        float validHeight = 154;
        float expectedResult = 158;
        assertEquals(expectedResult, clothingSizeCalculatorUnderTest.getClothingSize(validHeight));
    }

    @Test
    void getClothingSize158To164() throws Exception {
        float validHeight = 160;
        float expectedResult = 164;
        assertEquals(expectedResult, clothingSizeCalculatorUnderTest.getClothingSize(validHeight));
    }

    @Test
    void getClothingSize164To170() throws Exception {
        float validHeight = 166;
        float expectedResult = 170;
        assertEquals(expectedResult, clothingSizeCalculatorUnderTest.getClothingSize(validHeight));
    }

    @Test
    void getClothingSize170To176() throws Exception {
        float validHeight = 172;
        float expectedResult = 176;
        assertEquals(expectedResult, clothingSizeCalculatorUnderTest.getClothingSize(validHeight));
    }

    @Test
    void getClothingSize178AndBigger() throws Exception {
        float invalidHeight = 178;
        String errorMessage = "The inputvalue for height does not match with common sizes for childrensclothing! May we suggest searching for adultclothing?";
        Exception exception = assertThrows(Exception.class, () -> clothingSizeCalculatorUnderTest.getClothingSize(invalidHeight));
        assertEquals(errorMessage, exception.getMessage());
    }

    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Grenzwertanalyse<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/

    @Test
    void getClothingSizeLimitValue92() throws Exception {
        float heightValueUnderLimitValue = 91.99f;
        float heightValueIsLimitValue = 92f;
        float heightValueOverLimitValue = 92.01f;
        String heightValueUnderLimitValueExpectedErrorMessage = "The inputvalue for height does not match with common sizes for childrensclothing! May we suggest searching for babyclothing?";
        float heightValueIsLimitValueExpectedResult = 92;
        float heightValueOverLimitValueExpectedResult = 98;

        Exception exception = assertThrows(Exception.class, ()-> clothingSizeCalculatorUnderTest.getClothingSize(heightValueUnderLimitValue));
        assertEquals(heightValueUnderLimitValueExpectedErrorMessage, exception.getMessage());
        assertEquals(heightValueIsLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueIsLimitValue));
        assertEquals(heightValueOverLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueOverLimitValue));
    }

    @Test
    void getClothingSizeLimitValue98() throws Exception {
        float heightValueUnderLimitValue = 97.99f;
        float heightValueIsLimitValue = 98f;
        float heightValueOverLimitValue = 98.01f;
        float heightValueUnderLimitValueExpectedResult = 98f;
        float heightValueIsLimitValueExpectedResult = 98f;
        float heightValueOverLimitValueExpectedResult = 104f;

        assertEquals(heightValueUnderLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueUnderLimitValue));
        assertEquals(heightValueIsLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueIsLimitValue));
        assertEquals(heightValueOverLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueOverLimitValue));
    }

    @Test
    void getClothingSizeLimitValue104() throws Exception {
        float heightValueUnderLimitValue = 103.99f;
        float heightValueIsLimitValue = 104f;
        float heightValueOverLimitValue = 104.01f;
        float heightValueUnderLimitValueExpectedResult = 104f;
        float heightValueIsLimitValueExpectedResult = 104f;
        float heightValueOverLimitValueExpectedResult = 110f;

        assertEquals(heightValueUnderLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueUnderLimitValue));
        assertEquals(heightValueIsLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueIsLimitValue));
        assertEquals(heightValueOverLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueOverLimitValue));
    }

    @Test
    void getClothingSizeLimitValue110() throws Exception {
        float heightValueUnderLimitValue = 109.99f;
        float heightValueIsLimitValue = 110f;
        float heightValueOverLimitValue = 110.01f;
        float heightValueUnderLimitValueExpectedResult = 110f;
        float heightValueIsLimitValueExpectedResult = 110f;
        float heightValueOverLimitValueExpectedResult = 116f;

        assertEquals(heightValueUnderLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueUnderLimitValue));
        assertEquals(heightValueIsLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueIsLimitValue));
        assertEquals(heightValueOverLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueOverLimitValue));
    }

    @Test
    void getClothingSizeLimitValue116() throws Exception {
        float heightValueUnderLimitValue = 115.99f;
        float heightValueIsLimitValue = 116f;
        float heightValueOverLimitValue = 116.01f;
        float heightValueUnderLimitValueExpectedResult = 116f;
        float heightValueIsLimitValueExpectedResult = 116f;
        float heightValueOverLimitValueExpectedResult = 122f;

        assertEquals(heightValueUnderLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueUnderLimitValue));
        assertEquals(heightValueIsLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueIsLimitValue));
        assertEquals(heightValueOverLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueOverLimitValue));
    }

    @Test
    void getClothingSizeLimitValue122() throws Exception {
        float heightValueUnderLimitValue = 121.99f;
        float heightValueIsLimitValue = 122f;
        float heightValueOverLimitValue = 122.01f;
        float heightValueUnderLimitValueExpectedResult = 122f;
        float heightValueIsLimitValueExpectedResult = 122f;
        float heightValueOverLimitValueExpectedResult = 128f;

        assertEquals(heightValueUnderLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueUnderLimitValue));
        assertEquals(heightValueIsLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueIsLimitValue));
        assertEquals(heightValueOverLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueOverLimitValue));
    }

    @Test
    void getClothingSizeLimitValue128() throws Exception {
        float heightValueUnderLimitValue = 127.99f;
        float heightValueIsLimitValue = 128f;
        float heightValueOverLimitValue = 128.01f;
        float heightValueUnderLimitValueExpectedResult = 128f;
        float heightValueIsLimitValueExpectedResult = 128f;
        float heightValueOverLimitValueExpectedResult = 134f;

        assertEquals(heightValueUnderLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueUnderLimitValue));
        assertEquals(heightValueIsLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueIsLimitValue));
        assertEquals(heightValueOverLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueOverLimitValue));
    }

    @Test
    void getClothingSizeLimitValue134() throws Exception {
        float heightValueUnderLimitValue = 133.99f;
        float heightValueIsLimitValue = 134f;
        float heightValueOverLimitValue = 134.01f;
        float heightValueUnderLimitValueExpectedResult = 134f;
        float heightValueIsLimitValueExpectedResult = 134f;
        float heightValueOverLimitValueExpectedResult = 140f;

        assertEquals(heightValueUnderLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueUnderLimitValue));
        assertEquals(heightValueIsLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueIsLimitValue));
        assertEquals(heightValueOverLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueOverLimitValue));
    }

    @Test
    void getClothingSizeLimitValue140() throws Exception {
        float heightValueUnderLimitValue = 139.99f;
        float heightValueIsLimitValue = 140f;
        float heightValueOverLimitValue = 140.01f;
        float heightValueUnderLimitValueExpectedResult = 140f;
        float heightValueIsLimitValueExpectedResult = 140f;
        float heightValueOverLimitValueExpectedResult = 146f;

        assertEquals(heightValueUnderLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueUnderLimitValue));
        assertEquals(heightValueIsLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueIsLimitValue));
        assertEquals(heightValueOverLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueOverLimitValue));
    }

    @Test
    void getClothingSizeLimitValue146() throws Exception {
        float heightValueUnderLimitValue = 145.99f;
        float heightValueIsLimitValue = 146f;
        float heightValueOverLimitValue = 146.01f;
        float heightValueUnderLimitValueExpectedResult = 146f;
        float heightValueIsLimitValueExpectedResult = 146f;
        float heightValueOverLimitValueExpectedResult = 152f;

        assertEquals(heightValueUnderLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueUnderLimitValue));
        assertEquals(heightValueIsLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueIsLimitValue));
        assertEquals(heightValueOverLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueOverLimitValue));
    }

    @Test
    void getClothingSizeLimitValue152() throws Exception {
        float heightValueUnderLimitValue = 151.99f;
        float heightValueIsLimitValue = 152f;
        float heightValueOverLimitValue = 152.01f;
        float heightValueUnderLimitValueExpectedResult = 152f;
        float heightValueIsLimitValueExpectedResult = 152f;
        float heightValueOverLimitValueExpectedResult = 158f;

        assertEquals(heightValueUnderLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueUnderLimitValue));
        assertEquals(heightValueIsLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueIsLimitValue));
        assertEquals(heightValueOverLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueOverLimitValue));
    }

    @Test
    void getClothingSizeLimitValue158() throws Exception {
        float heightValueUnderLimitValue = 157.99f;
        float heightValueIsLimitValue = 158f;
        float heightValueOverLimitValue = 158.01f;
        float heightValueUnderLimitValueExpectedResult = 158f;
        float heightValueIsLimitValueExpectedResult = 158f;
        float heightValueOverLimitValueExpectedResult = 164f;

        assertEquals(heightValueUnderLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueUnderLimitValue));
        assertEquals(heightValueIsLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueIsLimitValue));
        assertEquals(heightValueOverLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueOverLimitValue));
    }

    @Test
    void getClothingSizeLimitValue164() throws Exception {
        float heightValueUnderLimitValue = 163.99f;
        float heightValueIsLimitValue = 164f;
        float heightValueOverLimitValue = 164.01f;
        float heightValueUnderLimitValueExpectedResult = 164f;
        float heightValueIsLimitValueExpectedResult = 164f;
        float heightValueOverLimitValueExpectedResult = 170f;

        assertEquals(heightValueUnderLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueUnderLimitValue));
        assertEquals(heightValueIsLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueIsLimitValue));
        assertEquals(heightValueOverLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueOverLimitValue));
    }

    @Test
    void getClothingSizeLimitValue170() throws Exception {
        float heightValueUnderLimitValue = 169.99f;
        float heightValueIsLimitValue = 170f;
        float heightValueOverLimitValue = 170.01f;
        float heightValueUnderLimitValueExpectedResult = 170f;
        float heightValueIsLimitValueExpectedResult = 170f;
        float heightValueOverLimitValueExpectedResult = 176f;

        assertEquals(heightValueUnderLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueUnderLimitValue));
        assertEquals(heightValueIsLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueIsLimitValue));
        assertEquals(heightValueOverLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueOverLimitValue));
    }

    @Test
    void getClothingSizeLimitValue176() throws Exception {
        float heightValueUnderLimitValue = 175.99f;
        float heightValueIsLimitValue = 176f;
        float heightValueOverLimitValue = 176.01f;
        float heightValueUnderLimitValueExpectedResult = 176;
        float heightValueIsLimitValueExpectedResult = 176;
        String heightValueOverLimitValueExpectedErrorMessage = "The inputvalue for height does not match with common sizes for childrensclothing! May we suggest searching for adultclothing?";

        assertEquals(heightValueUnderLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueUnderLimitValue));
        assertEquals(heightValueIsLimitValueExpectedResult, clothingSizeCalculatorUnderTest.getClothingSize(heightValueIsLimitValue));
        Exception exception = assertThrows(Exception.class, ()-> clothingSizeCalculatorUnderTest.getClothingSize(heightValueOverLimitValue));
        assertEquals(heightValueOverLimitValueExpectedErrorMessage, exception.getMessage());
    }

}