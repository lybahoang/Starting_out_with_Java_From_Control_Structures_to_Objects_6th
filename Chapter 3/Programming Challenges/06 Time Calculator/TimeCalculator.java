/**
 * This program shows my solution to the programming challenge 6 chapter 3.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 08 September 2025.
 */

import java.util.Scanner;

public class TimeCalculator
{
    public static void main(String[] args) {
        // Variable to hold the number of seconds.
        int seconds;

        // Create a Scanner object and connect it to the System.in object
        // to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the number of seconds from the user.
        System.out.print("Enter the number of seconds: ");
        seconds = keyboard.nextInt();

        // Convert the number of seconds to minutes, hours, days if relevant.
        if (seconds >= 86400)
        {
            float days = seconds / 86400f;
            System.out.printf("Days: %.2f\n", days);
        }
        else if (seconds >= 3600)
        {
            float hours = seconds / 3600f;
            System.out.printf("Hours: %.2f\n", hours);
        }
        else if (seconds >= 60)
        {
            float minutes = seconds / 60f;
            System.out.printf("Minutes: %.2f\n", minutes);
        }
        else
        {
            System.out.println("Invalid seconds.");
        }
    }
}