package childrenClothingSizeCalculator;

public class growthCoefficientCalculator {

    public float calulateGrowthCoefficient(float inputHeight, float inputWaist, float inputHips) {

        float growthCoefficient = (inputHeight + inputWaist + inputHips) / 3;
        return growthCoefficient;

    }
}
