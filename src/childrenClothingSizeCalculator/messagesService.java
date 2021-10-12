package childrenClothingSizeCalculator;

public interface messagesService {

    default void enterMessage(String inputText) {
        try {
            System.out.println("Please enter the " + inputText + " of your kid.");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    default void logInputToConsole(float inputFloat, String inputText) {
        try {
            System.out.println("The " + inputText + " of your kid is " + inputFloat + "!\n");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
