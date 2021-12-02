package childrenClothingSizeCalculator;

import java.util.Scanner;

public interface checkValuesService {

    default boolean checkIfNumberIsAboveZero(float number) throws Exception {
        if (number <= 0) {
            throw new Exception("Number has to be bigger than 0!");
        } else {
            return true;
        }
    }

    default boolean checkIfInputIsDigit(Scanner inputScanner) throws Exception {
        if (inputScanner.hasNextFloat()) {
            return true;
        } else {
            throw new Exception("Input has to be a number!");
        }
    }

    default void checkIfValuesAreInbound(float number, String valueDescriptionForNumber) throws Exception {
        switch (valueDescriptionForNumber) {
            case "height":
                checkIfHeightIsInbound(number);
                break;
            case "waist":
                checkIfWaistIsInbound(number);
                break;
            case "chest":
                checkIfChestIsInbound(number);
                break;
        }
    }

    default void checkIfHeightIsInbound(float height) throws Exception {
        if ((height < 92) || (height > 176)) {
            throw new Exception("The height has to be between 92 and 176");
        }
    }

    default void checkIfWaistIsInbound(float waist) throws Exception {
        if ((waist < 51) || (waist > 70)) {
            throw new Exception("The waist measurements have to be between 51 and 70");
        }
    }

    default void checkIfChestIsInbound(float chest) throws Exception {
        if ((chest < 54) || (chest > 88)) {
            throw new Exception("The chest measurements have to be between 54 and 88");
        }
    }
}
