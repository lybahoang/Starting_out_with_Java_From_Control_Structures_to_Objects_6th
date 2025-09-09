import java.util.Scanner;

/**
 * This program shows my solution to the programming challenge 4 chapter 4.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 08 September 2025.
 */
public class PenniesForPay
{
    public static void main(String[] args)
    {
        int numOfDays;      // The number of worked days.
        int totalPay = 1;   // An accumulator to hold the total pay.
        int salaries = 1;   // The salaries of one day.

        // Create a Scanner object and connect it to the System.in object
        // to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the user's number of worked days.
        do
        {
            System.out.print("How many days have your worked? ");
            numOfDays = keyboard.nextInt();

            if (numOfDays < 1)
            {
                System.out.println("Error: The number of days should at least 2.");
            }
        } while (numOfDays < 1);

        // Display the table of salaries during the period of time and
        // also update the accumulator.
        System.out.println("Days\tSalaries");
        System.out.println("---------------");
        for (int count = 1; count <= numOfDays; count++)
        {
            salaries *= 2;
            System.out.println(count + "\t" + salaries);
            
        }
    }
}