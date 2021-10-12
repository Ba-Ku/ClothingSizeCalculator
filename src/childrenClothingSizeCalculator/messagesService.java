package childrenClothingSizeCalculator;

public interface messagesService {

    default void enterMessage(String inputText) {
        System.out.println("Please enter the " + inputText + " of your kid.");
    }

    default void logInputToConsole(float inputFloat, String inputText) {
        System.out.println("The " + inputText + " of your kid is " + inputFloat + "!\n");
    }
}
