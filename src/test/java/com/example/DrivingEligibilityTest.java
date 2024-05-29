package com.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrivingEligibilityTest {

    @Test
    public void testEligibleToDrive() {
        String input = "Shashank\nyes\nyes\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        DrivingEligibility.main(new String[]{});

        String expectedOutput = "Name: Do you have a license (yes/no): Are you above 18 (yes/no): You are eligible to drive.";
        assertEquals(expectedOutput, normalizeOutput(out.toString()));
    }

    @Test
    public void testNotEligibleToDrive() {
        String input = "Shashank\nno\nyes\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        DrivingEligibility.main(new String[]{});

        String expectedOutput = "Name: Do you have a license (yes/no): Are you above 18 (yes/no): Not eligible.";
        assertEquals(expectedOutput, normalizeOutput(out.toString()));
    }

    private String normalizeOutput(String output) {
        return output.replaceAll("\\r\\n", "\n").replaceAll("\\r", "\n").trim();
    }
}
