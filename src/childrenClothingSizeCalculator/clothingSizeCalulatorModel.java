package childrenClothingSizeCalculator;

public class clothingSizeCalulatorModel {

    public String getClothingSize(float heightInput) throws Exception { //rebuild with other methods into switch

        if(heightInput< 92){ //try catch?
            throw new Exception("The inputvalue for height does not match with common sizes for childrensclothing!");
        } else if ((heightInput >= 92) && (heightInput < 98)) {
            return "92";
        } else if ((heightInput >= 98) && (heightInput < 104)) {
            return "104";
        } else if ((heightInput >= 104) && (heightInput < 110)) {
            return "110";
        } else if ((heightInput >= 110) && (heightInput < 116)) {
            return "116";
        } else if ((heightInput >= 116) && (heightInput < 122)) {
            return "122";
        } else if ((heightInput >= 122) && (heightInput < 128)) {
            return "128";
        } else if ((heightInput >= 128) && (heightInput < 134)) {
            return "134";
        } else if ((heightInput >= 134) && (heightInput < 140)) {
            return "140";
        } else if ((heightInput >= 140) && (heightInput < 146)) {
            return "146";
        } else if ((heightInput >= 146) && (heightInput < 152)) {
            return "152";
        } else if ((heightInput >= 152) && (heightInput < 158)) {
            return "158";
        } else if ((heightInput >= 158) && (heightInput < 164)) {
            return "164";
        } else if ((heightInput >= 164) && (heightInput < 170)) {
            return "170";
        } else if ((heightInput >= 170) && (heightInput < 176)) {
            return "176";
        } else if(heightInput>176){
            throw new Exception("The inputvalue for height does not match with common sizes for childrensclothing!");
        } else{
            throw new Exception("Unexpected Error!");
        }
    }
}
