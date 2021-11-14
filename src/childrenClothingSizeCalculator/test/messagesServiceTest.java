package childrenClothingSizeCalculator.test;

import childrenClothingSizeCalculator.messagesService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class messagesServiceTest implements messagesService{
    String stringInput = "correct input";
    float floatInput = 1f;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStream(){
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams(){
        System.setOut(originalOut);
    }

    @Test
    void enterMessageUnderTest(){
        String expectedOutput = "Please enter the correct input of your kid.\n";
        enterMessage(stringInput);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void logInputToConsoleUnderTest(){
        String expectedOutput = "The correct input of your kid is 1.0!\n";//Achtung Float - deshalb 1.0
        logInputToConsole(floatInput, stringInput);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void outputMessageUnderTest(){
        String validFormattedString = "11.11";
        String expectedOutput = "\nThe clothingsize of your kid is: 1.0!\nThe growth coefficient of your kid is: " + validFormattedString + "!\n" +
                "Thank you for using our product!";
        assertEquals(expectedOutput, outputMessage(floatInput, validFormattedString));
    }
}