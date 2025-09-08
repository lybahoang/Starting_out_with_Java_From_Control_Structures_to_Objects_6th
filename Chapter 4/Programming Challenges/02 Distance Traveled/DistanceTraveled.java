import java.util.Scanner;

/**
 * This program shows my solution to the programming challenge 2 chapter 4.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 08 September 2025.
 */

public class DistanceTraveled
{
    public static void main(String[] args)
    {
        float speed;    // The speed of the vehicle.
        float hours;    // The number of hours traveled.

        // Create a Scanner object and connect it to the System.in object
        // to read input.
        Scanner keyboard = new Scanner(System.in);
        
        // Get the speed of the vehicle.
        do
        {
            System.out.print("How fast is your vehicle (in mi/h)? ");
            speed = keyboard.nextFloat();

            if (speed < 0)
            {
                System.out.println("Error: Invalid value for speed."); 
            }
        } while (speed < 0);

        // Get the number of hours that the vehicle has traveled.
        do
        {
            System.out.print("How long has you been travelling? ");
            hours = keyboard.nextFloat();

            if (hours < 1)
            {
                System.out.println("Error: Hour value should be at least 1.");
            }
        } while (hours < 1);

        // Display the report.
        System.out.println("\nHour\tDistance Traveled");
        System.out.println("-------------------------");
        for (int count = 1; count <= hours; count++)
        {
            System.out.println(count + "\t" + (count * speed));
        }
    }
}