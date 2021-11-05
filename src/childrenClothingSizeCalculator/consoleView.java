package childrenClothingSizeCalculator;

public class consoleView {

    public void consoleOutput(String input) {
        try {
            System.out.print(input);
        } catch (Exception exception) {
            System.out.print(exception.getMessage());
        }
    }


}
