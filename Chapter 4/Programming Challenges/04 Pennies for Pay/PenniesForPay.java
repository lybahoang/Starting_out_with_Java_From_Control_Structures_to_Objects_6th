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
        int numOfDays;                      // The number of worked days.
        double totalPayInPennies = 0.0;     // An accumulator to hold the total pay in pennies
        double salariesInPennies;           // To hold the salary each day in pennies
        final int PENNY_PER_DOLLAR = 100;   // Conversion factor.

        // Create a Scanner object and connect it to the System.in object
        // to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the user's number of worked days.
        do
        {
            System.out.print("How many days have your worked? ");
            numOfDays = keyboard.nextInt();

            // If the number of days is less than 1, then display a message indicating
            // which will be a valid input.
            if (numOfDays < 1)
            {
                System.out.println("Error: The number of days should at least 1.");
            }
        } while (numOfDays < 1);

        // Display the table of salaries during the period of time and
        // also update the accumulator.
        System.out.println("Days\tSalaries ($)");
        System.out.println("--------------------");
        for (int count = 1; count <= numOfDays; count++)
        {
            // Calculate the salaries for the corresponding day.
            salariesInPennies = 1 * Math.pow(2.0, (double)(count - 1));

            // Accumulate the salaries.
            totalPayInPennies += salariesInPennies;

            // Display the report salaries for each day.
            System.out.println(count + "\t" + salariesInPennies / PENNY_PER_DOLLAR);
        }

        // Display the total pay.
        System.out.println("--------------------");
        System.out.println("Total pay: $" + totalPayInPennies / PENNY_PER_DOLLAR);
    }
}