package childrenClothingSizeCalculator;

public class childrenClothingSizeCalculatorController {
    private float height;
    private float waist;
    private float hips;

    public childrenClothingSizeCalculatorController() {
    }

    public void startCalulator() throws Exception {
        this.getInputFromConsole();
        this.calculateSize();
        this.calculateGrowthCoeffizient();
    }

    private void getInputFromConsole() {
        scannerModel inputScanner = new scannerModel();
        inputScanner.getInputFromConsole();
        this.height = inputScanner.getHeight();
        this.waist = inputScanner.getWaist();
        this.hips = inputScanner.getHips();
    }

    private void calculateSize() throws Exception {
        clothingSizeCalulatorModel clothingSizeCalulator = new clothingSizeCalulatorModel();
        clothingSizeCalulator.getClothingSize(this.height);
    }

    private float calculateGrowthCoeffizient(){
        growthCoefficientCalculator growthCalulator  = new growthCoefficientCalculator();
        float growthCoefficient = growthCalulator.calulateGrowthCoefficient(this.height, this.waist, this.hips);
        System.out.println(growthCoefficient);
        return growthCoefficient;
    }


}
