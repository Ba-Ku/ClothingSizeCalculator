package childrenClothingSizeCalculator;

public interface messagesService {

    default void enterMessage(String inputText) {
        try {
            System.out.print("Please enter the " + inputText + " of your kid.\n");
        } catch (Exception exception) {
            System.out.print(exception.getMessage());
        }
    }

    default void logInputToConsole(float inputFloat, String inputText) {
        try {
            System.out.print("The " + inputText + " of your kid is " + inputFloat + "!\n");
        } catch (Exception exception) {
            System.out.print(exception.getMessage());
        }
    }

    default String outputMessage(float clothingSize, String formattedGrowthCoefficient){
        String outputMessage = "\nThe clothingsize of your kid is: " + clothingSize + "!\n" +
                "The growth coefficient of your kid is: " + formattedGrowthCoefficient + "!\n" +
                "Thank you for using our product!";
        return outputMessage;
    }
}
