/**
 * This program shows my solution to the programming challenge 2 chapter 3.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 07 September 2025.
 */

import java.util.Scanner;   // Needed for the Scanner class.

public class MagicDates
{
    public static void main(String[] args)
    {
        byte month;     // The month in numeric form (1-12).
        byte day;       // The day in numeric form (1-31).
        byte year;      // A two-digit year (00-99).

        // Create a Scanner object and connect it to the Sytem.in
        // object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the month from the user.
        System.out.print("Enter a month (1-12): ");
        month = keyboard.nextByte();

        // Get the day from the user.
        System.out.print("Enter a day (1-31): ");
        day = keyboard.nextByte();

        // Get a two-digit year from the user.
        System.out.print("Enter a two-digit year: ");
        year = keyboard.nextByte();

        // If the month times the day is equal to the year, display a message
        // saying that the date is magic.
        if ((short)year == (short)(day * month))
        {
            System.out.print("The date is magic.");
        }
        else
        {
            System.out.print("The date is not magic.");
        }
    }
}