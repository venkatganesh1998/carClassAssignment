package com.example;

import java.util.Scanner;

public class DrivingEligibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Do you have a license (yes/no): ");
        String hasLicenseInput = scanner.nextLine();
        boolean hasLicense;
        if (hasLicenseInput.equalsIgnoreCase("yes")) {
            hasLicense = true;
        } else {
            hasLicense = false;
        }

        System.out.print("Are you above 18 (yes/no): ");
        String above18Input = scanner.nextLine();
        boolean above18;
        if (above18Input.equalsIgnoreCase("yes")) {
            above18 = true;
        } else {
            above18 = false;
        }

        if (hasLicense && above18) {
            System.out.println("You are eligible to drive.");
        } else {
            System.out.println("Not eligible.");
        }
    }
}
