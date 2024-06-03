package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    // Test case for isEven function
    @Test
    public void testIsEven() {
        assertTrue(Main.isEven(2), "2 should be even");
        assertTrue(Main.isEven(10), "10 should be even");
        assertFalse(Main.isEven(3), "3 should be odd");
        assertFalse(Main.isEven(7), "7 should be odd");
    }

    // Test case for main method output (using a custom output stream)
    @Test
    public void testMainOutput() {
        // Set up a custom output stream to capture print statements
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        // Run the main method
        Main.main(null);

        // Expected output as a regular expression
        String expectedOutputRegex = "num1 is even\\s+" +
                                     "num1 is less than num2\\s+" +
                                     "Both num1 and num2 are positive numbers\\s+" +
                                     "num1 is even\\s*";

        // Capture the actual output
        String actualOutput = outContent.toString();

        // Print lengths of expected and actual outputs
        System.out.println("Expected Output Length: " + expectedOutputRegex.length());
        System.out.println("Actual Output Length: " + actualOutput.length());

        // Print the actual output with visible characters
        System.out.println("Actual Output:");
        for (int i = 0; i < actualOutput.length(); i++) {
            char c = actualOutput.charAt(i);
            System.out.printf("'%c' (ASCII %d)%n", c, (int) c);
        }

        // Assert the captured output matches the expected output regex
        assertTrue(actualOutput.matches(expectedOutputRegex), "Output should match the expected output");

        // Reset System.out to its original state
        System.setOut(System.out);
    }
}
