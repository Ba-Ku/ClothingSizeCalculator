package childrenClothingSizeCalculator;

public class growthCoefficientCalculatorModel {

    public float calculateGrowthCoefficient(float inputHeight, float inputWaist, float inputChest) throws Exception {
        this.checkIfValuesAreInbound(inputHeight, inputWaist, inputChest);
        float growthCoefficient = (inputHeight + inputWaist + inputChest) / 3;
        return growthCoefficient;
    }

    private void checkIfValuesAreInbound(float inputHeight, float inputWaist, float inputChest) throws Exception {
        if ((inputHeight < 92) || (inputHeight > 176)) {
            throw new Exception("The height has to be between 92 and 176");
        } else if ((inputWaist < 51) || (inputWaist > 70)) {
            throw new Exception("The waist measurements have to be between 51 and 70");
        } else if ((inputChest < 54) || (inputChest > 88)) {
            throw new Exception("The chest measurements have to be between 54 and 88");
        }
    }
}
