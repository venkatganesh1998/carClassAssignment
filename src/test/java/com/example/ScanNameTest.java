package com.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScanNameTest {

    @Test
    public void testMain() {
        // Simulate user input
        String input = "John\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Capture output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Run the main method
        ScanName.main(new String[]{});

        // Verify the output
        String expectedOutput = "Enter your name: Hello, John!\n";
        assertEquals(expectedOutput, out.toString().replace("\r\n", "\n"));
    }
}
