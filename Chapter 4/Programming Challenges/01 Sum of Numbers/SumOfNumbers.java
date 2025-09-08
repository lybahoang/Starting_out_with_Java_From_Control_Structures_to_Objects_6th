/**
 * This program shows my solution to the programming challenge 1 chapter 3.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 07 September 2025.
 */

import java.util.Scanner;

public class SumOfNumbers
{
    public static void main(String[] args)
    {
        // Variable to hold a positive nonzero integer value.
        int userValue;

        // An accumulator.
        int total = 0;

        // Create a Scanner object and connect it to the System.in object
        // to read input from the user.
        Scanner keyboard = new Scanner(System.in);

        // Get a positive nonzero integer value from the user.
        System.out.print("Enter a positive nonzero integer: ");
        userValue = keyboard.nextInt();

        // A loop to calculate the sum of all integers from 1 up to userValue.
        for (int count = 1; count <= userValue; count++)
        {
            total += count;
        }

        // Display the running total.
        System.out.println("Sum from 1 to " + userValue + " is " + total);
    }
}