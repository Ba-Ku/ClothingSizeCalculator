package childrenClothingSizeCalculator.test;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class checkValuesServiceTest implements childrenClothingSizeCalculator.checkValuesService {

    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Äquivalenzklassen<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/

    @Test
    void checkIfNumberIsAboveZeroNumberIsZero() {
        float invalidNumberBelowOrEqualToZero = 0;
        String errorMessage = "Number has to be bigger than 0!";
        Exception exception = assertThrows(Exception.class, ()-> checkIfNumberIsAboveZero(invalidNumberBelowOrEqualToZero));
        assertEquals(errorMessage, exception.getMessage());
    }


    @Test
    void checkIfValuesAreInboundHeightMinusTo92() {
        String validValueDescriptionForNumber = "height";
        float invalidHeightTooLow = 90;
        String errorMessage = "The height has to be between 92 and 176";
        Exception exception = assertThrows(Exception.class, () -> checkIfValuesAreInbound(invalidHeightTooLow, validValueDescriptionForNumber));
        assertEquals(errorMessage, exception.getMessage());
    }

    @Test
    void checkIfValuesAreInboundHeightBigger176() {
        String validValueDescriptionForNumber = "height";
        float invalidHeightTooHigh = 180;
        String errorMessage = "The height has to be between 92 and 176";
        Exception exception = assertThrows(Exception.class, () -> checkIfValuesAreInbound(invalidHeightTooHigh, validValueDescriptionForNumber));
        assertEquals(errorMessage, exception.getMessage());
    }

    @Test
    void checkIfValuesAreInboundWaistMinusTo51() {
        String validValueDescriptionForNumber = "waist";
        float invalidWaistTooSmall = 50;
        String errorMessage = "The waist measurements have to be between 51 and 70";
        Exception exception = assertThrows(Exception.class, () -> checkIfValuesAreInbound(invalidWaistTooSmall, validValueDescriptionForNumber));
        assertEquals(errorMessage, exception.getMessage());
    }

    @Test
    void checkIfValuesAreInboundWaistBigger70() {
        String validValueDescriptionForNumber = "waist";
        float invalidWaistTooBig = 71;
        String errorMessage = "The waist measurements have to be between 51 and 70";
        Exception exception = assertThrows(Exception.class, () -> checkIfValuesAreInbound(invalidWaistTooBig, validValueDescriptionForNumber));
        assertEquals(errorMessage, exception.getMessage());
    }

    @Test
    void checkIfValuesAreInboundChestMinusTo54() {
        String validValueDescriptionForNumber = "chest";
        float invalidChestTooSmall = 50;
        String errorMessage = "The chest measurements have to be between 54 and 88";
        Exception exception = assertThrows(Exception.class, () -> checkIfValuesAreInbound(invalidChestTooSmall, validValueDescriptionForNumber));
        assertEquals(errorMessage, exception.getMessage());
    }

    @Test
    void checkIfValuesAreInboundChestBigger88() {
        String validValueDescriptionForNumber = "chest";
        float invalidChestTooBig = 90;
        String errorMessage = "The chest measurements have to be between 54 and 88";
        Exception exception = assertThrows(Exception.class, () -> checkIfValuesAreInbound(invalidChestTooBig, validValueDescriptionForNumber));
        assertEquals(errorMessage, exception.getMessage());
    }

    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Negativtest<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/



    @Test
    void checkIfInputIsDigit() throws Exception {
        Scanner testScanner = new Scanner("String is an invalid type!");
        String errorMessage = "Input has to be a number!";
        Exception exception = assertThrows(Exception.class,()-> checkIfInputIsDigit(testScanner));
        assertEquals(errorMessage, exception.getMessage());
        testScanner.close();
    }
}