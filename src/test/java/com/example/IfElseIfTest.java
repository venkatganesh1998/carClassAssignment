package com.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IfElseIfTest {

    @Test
    public void testMain_GradeA() {
        // Simulate user input for grade A
        String input = "95\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Capture output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Run the main method
        IfElseIf.main(new String[]{});

        // Verify the output
        String expectedOutput = "Enter your score: Grade: A\n";
        assertEquals(expectedOutput, out.toString().replace("\r\n", "\n"));
    }

    @Test
    public void testMain_GradeB() {
        // Simulate user input for grade B
        String input = "85\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Capture output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Run the main method
        IfElseIf.main(new String[]{});

        // Verify the output
        String expectedOutput = "Enter your score: Grade: B\n";
        assertEquals(expectedOutput, out.toString().replace("\r\n", "\n"));
    }

    @Test
    public void testMain_GradeC() {
        // Simulate user input for grade C
        String input = "75\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Capture output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Run the main method
        IfElseIf.main(new String[]{});

        // Verify the output
        String expectedOutput = "Enter your score: Grade: C\n";
        assertEquals(expectedOutput, out.toString().replace("\r\n", "\n"));
    }

    @Test
    public void testMain_GradeD() {
        // Simulate user input for grade D
        String input = "65\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Capture output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Run the main method
        IfElseIf.main(new String[]{});

        // Verify the output
        String expectedOutput = "Enter your score: Grade: D\n";
        assertEquals(expectedOutput, out.toString().replace("\r\n", "\n"));
    }

    @Test
    public void testMain_GradeF() {
        // Simulate user input for grade F
        String input = "55\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Capture output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Run the main method
        IfElseIf.main(new String[]{});

        // Verify the output
        String expectedOutput = "Enter your score: Grade: F\n";
        assertEquals(expectedOutput, out.toString().replace("\r\n", "\n"));
    }
}
