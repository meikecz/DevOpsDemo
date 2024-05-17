package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GreeterTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testGreet() {
        Greeter greeter = new Greeter();
        greeter.greet();
        String expectedOutput = "Hallo, willkommen bei DevOps, Meike!" + System.lineSeparator();
        assertTrue(outContent.toString().contains(expectedOutput), "Die Ausgabe sollte den erwarteten Begrüßungstext enthalten.");
    }
}
