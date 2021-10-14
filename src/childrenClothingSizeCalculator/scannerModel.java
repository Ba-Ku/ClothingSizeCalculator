package childrenClothingSizeCalculator;

import java.util.Scanner;

public class scannerModel implements messagesService {
    private float height;
    private float waist;
    private float chest;

    public scannerModel() {
    }

    public void getInputFromConsole() {

        Scanner consoleInputScanner = new Scanner(System.in);
        try {
            enterMessage("height");
            this.height = this.checkIfInputIsDigitAndScanFromConsole(consoleInputScanner);
            this.checkNumberAboveZeroAndLogToConsole(this.height, "height");

            enterMessage("waist measurements");
            this.waist = this.checkIfInputIsDigitAndScanFromConsole(consoleInputScanner);
            this.checkNumberAboveZeroAndLogToConsole(this.waist, "waist");

            enterMessage("chest measurements");
            this.chest = this.checkIfInputIsDigitAndScanFromConsole(consoleInputScanner);
            this.checkNumberAboveZeroAndLogToConsole(this.chest, "chest");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        consoleInputScanner.close();
    }

    private void checkNumberAboveZeroAndLogToConsole(float number, String numberDescription) throws Exception {
        if (number <= 0) {
            throw new Exception("Number has to be bigger than 0!");
        } else {
            logInputToConsole(number, numberDescription);
        }
    }

    private float checkIfInputIsDigitAndScanFromConsole(Scanner inputScanner) throws Exception {
        if (inputScanner.hasNextFloat()) {
            float outputValue = inputScanner.nextFloat();
            return outputValue;
        } else {
            throw new Exception("Input has to be a number!");
        }
    }

    public float getHeight() {
        return height;
    }

    public float getWaist() {
        return waist;
    }

    public float getChest() {
        return chest;
    }
}
