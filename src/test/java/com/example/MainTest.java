package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

    @Test
    public void testMain() {
        // Set up a new PrintStream to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;

        // Redirect System.out to the PrintStream
        System.setOut(printStream);

        // Call the main method
        Main.main(new String[]{});

        // Restore the original System.out
        System.setOut(originalOut);

        // Get the output as a String
        String output = outputStream.toString().trim();

        // Assert that the output is "Hello world!"
        assertEquals("Hello world!", output);
    }
}
