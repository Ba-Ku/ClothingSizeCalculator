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
        Exception exception = assertThrows(Exception.class, ()->clothingSizeCalculatorUnderTest.getClothingSize(invalidHeight));
        assertEquals(errorMessage, exception.getMessage());
    }




    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Grenzwerttests<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/

}