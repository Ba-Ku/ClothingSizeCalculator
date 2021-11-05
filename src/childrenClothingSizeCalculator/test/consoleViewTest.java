package childrenClothingSizeCalculator.test;

import childrenClothingSizeCalculator.consoleView;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;



class consoleViewTest {
    String validInputString = "The consoleView has passed the test!";
    consoleView consoleViewUnderTest = new consoleView();

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStream(){
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams(){
        System.setOut(originalOut);
    }

    @Test
    public void consoleOutputTest(){

        consoleViewUnderTest.consoleOutput(validInputString);
        //System.out.print(validInputString);//wieder durch oberes ersetzen
        assertEquals(validInputString, outContent.toString());


        //assertEquals(correctString, consoleViewUnderTest.consoleOutput(validInputString));
        // ich teste hier einen string output - das ganze ist aber ein log auf die console - wie ist hier der testfall?
    }

}