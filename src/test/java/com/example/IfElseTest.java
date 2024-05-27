package com.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IfElseTest {

    @Test
    public void testMain_EligibleToVote() {
        // Simulate user input for eligible to vote
        String input = "20\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Capture output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Run the main method
        IfElse.main(new String[]{});

        // Verify the output
        String expectedOutput = "Enter your age: You are eligible to vote.\n";
        assertEquals(expectedOutput, out.toString().replace("\r\n", "\n"));
    }

    @Test
    public void testMain_NotEligibleToVote() {
        // Simulate user input for not eligible to vote
        String input = "16\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Capture output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Run the main method
        IfElse.main(new String[]{});

        // Verify the output
        String expectedOutput = "Enter your age: You are not eligible to vote.\n";
        assertEquals(expectedOutput, out.toString().replace("\r\n", "\n"));
    }
}
