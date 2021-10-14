package childrenClothingSizeCalculator;

import java.text.DecimalFormat;

public class childrenClothingSizeCalculatorController {
    private float height;
    private float waist;
    private float chest;

    public childrenClothingSizeCalculatorController() {
    }

    public void startCalculator() throws Exception {
        this.getInputFromConsole();
        this.displayOutputMessageViaConsoleView();
    }

    private void getInputFromConsole() {
        scannerModel inputScanner = new scannerModel();
        inputScanner.getInputFromConsole();
        this.height = inputScanner.getHeight();
        this.waist = inputScanner.getWaist();
        this.chest = inputScanner.getChest();
    }

    private float calculateSize() throws Exception {
        clothingSizeCalculatorModel clothingSizeCalculator = new clothingSizeCalculatorModel();
        float clothingSize = clothingSizeCalculator.getClothingSize(this.height);
        return clothingSize;
    }

    private float calculateGrowthCoefficient() throws Exception {
        growthCoefficientCalculatorModel growthCalculator = new growthCoefficientCalculatorModel();
        float growthCoefficient = growthCalculator.calculateGrowthCoefficient(this.height, this.waist, this.chest);
        return growthCoefficient;
    }

    private String calculateValuesAndFormulateMessage() throws Exception {
        float clothingSize = this.calculateSize();
        float growthCoefficient = this.calculateGrowthCoefficient();
        String formattedGrowthCoefficient = new DecimalFormat("#.##").format(growthCoefficient);
        String outputMessage = "The clothingsize of your kid is: " + clothingSize + "!\n" +
                "The growth coefficient of your kid is: " + formattedGrowthCoefficient + "!\n" +
                "Thank you for using our product!";
        return outputMessage;
    }

    private void displayOutputMessageViaConsoleView() throws Exception {
        consoleView consoleView = new consoleView();
        String outputMessage = calculateValuesAndFormulateMessage();
        consoleView.consoleOutput(outputMessage);
    }

}
