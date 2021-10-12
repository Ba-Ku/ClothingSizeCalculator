package childrenClothingSizeCalculator;

public class clothingSizeCalulatorModel {

    public float getClothingSize(float heightInput) throws Exception {//Grenzwerttest
        float clothingSize;

        if (heightInput < 92) {
            throw new Exception("The inputvalue for height does not match with common sizes for childrensclothing! It is too low.");
        } else if ((heightInput >= 92) && (heightInput < 98)) {
            clothingSize = 92;
        } else if ((heightInput >= 98) && (heightInput < 104)) {
            clothingSize = 104;
        } else if ((heightInput >= 104) && (heightInput < 110)) {
            clothingSize = 110;
        } else if ((heightInput >= 110) && (heightInput < 116)) {
            clothingSize = 116;
        } else if ((heightInput >= 116) && (heightInput < 122)) {
            clothingSize = 122;
        } else if ((heightInput >= 122) && (heightInput < 128)) {
            clothingSize = 128;
        } else if ((heightInput >= 128) && (heightInput < 134)) {
            clothingSize = 134;
        } else if ((heightInput >= 134) && (heightInput < 140)) {
            clothingSize = 140;
        } else if ((heightInput >= 140) && (heightInput < 146)) {
            clothingSize = 146;
        } else if ((heightInput >= 146) && (heightInput < 152)) {
            clothingSize = 152;
        } else if ((heightInput >= 152) && (heightInput < 158)) {
            clothingSize = 158;
        } else if ((heightInput >= 158) && (heightInput < 164)) {
            clothingSize = 164;
        } else if ((heightInput >= 164) && (heightInput < 170)) {
            clothingSize = 170;
        } else if ((heightInput >= 170) && (heightInput < 176)) {
            clothingSize = 176;
        } else if (heightInput > 176) {
            throw new Exception("The inputvalue for height does not match with common sizes for childrensclothing! It is too hight.");
        } else {
            throw new Exception("Unexpected Error!");
        }
        return clothingSize;
    }
}
