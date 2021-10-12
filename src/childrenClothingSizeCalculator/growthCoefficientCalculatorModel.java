package childrenClothingSizeCalculator;

public class growthCoefficientCalculatorModel {

    public float calculateGrowthCoefficient(float inputHeight, float inputWaist, float inputHips) throws Exception {
        float growthCoefficient = (inputHeight + inputWaist + inputHips) / 3;
        if (growthCoefficient <= 0) {
            throw new Exception("Growth Coefficient too small!");
        } else if (growthCoefficient > 120) {
            throw new Exception("Growth Coefficient too big!");
        } else {
            return growthCoefficient;
        }

    }
}
