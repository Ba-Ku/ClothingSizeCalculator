package childrenClothingSizeCalculator.test;

import childrenClothingSizeCalculator.consoleView;
import org.junit.jupiter.api.Test;



class consoleViewTest {
    String validInputString = "The consoleView has passed the test!";
    consoleView consoleViewUnderTest = new consoleView();

    @Test
    void consoleOutputValidString(){
        String correctString = "The consoleView has passed the test!";

        //assertEquals(correctString, consoleViewUnderTest.consoleOutput(validInputString));
        // ich teste hier einen string output - das ganze ist aber ein log auf die console - wie ist hier der testfall?
    }

}