import java.io.*;
import java.util.Scanner;

/**
 * This program shows my solution to the programming challenge 3 chapter 4.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 08 September 2025.
 */

public class DistanceFile
{
    public static void main(String[] args) throws IOException
    {
        float speed;    // The vehicle's speed.
        float hours;    // The number of hours traveled.

        // Create a Scanner object and connect it to the System.in object
        // to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the vehicle's speed.
        System.out.print("How fast your vehicle was (mi/h)? ");
        speed = keyboard.nextFloat();

        // Get the number of hours traveled by the vehicle.
        System.out.print("How long did you travel (hr)? ");
        hours = keyboard.nextFloat();

        // Create a PrintWriter object and connect it to a file.
        PrintWriter outputFile = new PrintWriter("distance.txt");

        // Write the report to the file.
        outputFile.println("Hours\tDistance traveled");
        outputFile.println("-------------------------");
        for (int hour = 1; hour <= hours; hour++)
        {
            outputFile.println(hour + "\t\t" + (hour * speed));
        }

        // Close the file.
        outputFile.close();
    }
}