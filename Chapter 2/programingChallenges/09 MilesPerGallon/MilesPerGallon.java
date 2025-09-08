/**
 * This program shows my solution to the programming challenge 9 chapter 2.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 08 September 2025.
 */

import java.util.Scanner;

public class MilesPerGallon
{
    public static void main(String[] args) {
        // Declare variables to hold the number of miles driven
        // and the gallons of gass used.
        double milesDriven, gallons;

        // Create a Scanner object and connect it to the System.in
        // object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the number of miles driven.
        System.out.print("How many miles did you drive? ");
        milesDriven = keyboard.nextDouble();

        // Get the number of gallons of gas used.
        System.out.print("How many gallons did you use? ");
        gallons = keyboard.nextDouble();

        // Calculate the miles-per-gallon of the car.
        double MPG = milesDriven / gallons;

        // Display the result.
        System.out.println("Miles-per-Gallon is " + MPG);
    }
}