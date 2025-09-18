import java.util.Scanner;

/**
    Programming challenges 2 chapter 7: Starting out with Java: From
    Control structures to Objects (6th)
    Date: 18 September 2025
 */
public class PayrollDemo
{
    public static void main(String[] args)
    {
        // Create a Payroll object.
        Payroll myPayroll = new Payroll();

        // Create a Scanner object to read input from the keyboard.
        Scanner keyboard = new Scanner(System.in);

        // Get the employee's worked hours and pay rates.
        final int EMPLOYEES = 7;
        int hours;      // To hold the employee's worked hours.
        double rate;    // To hold the employee's pay rate.

        for (byte count = 0; count < EMPLOYEES; count++)
        {
            // Get the employee's worked hours.
            System.out.print("Enter the worked hours for employee ");
            System.out.print(myPayroll.getId(count) + ": ");
            hours = keyboard.nextInt();

            // Check the input for employee's worked hours.
            while (hours < 0)
            {
                System.out.println("Hours should be a nonnegative integer.\n");
                System.out.print("Enter the worked hours for employee ");
                System.out.print(myPayroll.getId(count) + ": ");
                hours = keyboard.nextInt();
            }

            // Store the hours in the object.
            myPayroll.setHours(count, hours);

            // Get the employee's pay rates.
            System.out.print("Enter the pay rate for employee ");
            System.out.print(myPayroll.getId(count) + ": ");
            rate = keyboard.nextDouble();

            // Check the input for employee's pay rate.
            while (rate < 6.0)
            {
                System.out.print("Pay rate should be at least 6.0\n");
                System.out.print("Enter the pay rate for employee ");
                System.out.print(myPayroll.getId(count) + ": ");
                rate = keyboard.nextDouble();
            }

            // Store the pay rate in the object
            myPayroll.setPayRate(count, rate);
        } 

        // Display the employees' identification number and gross wages.
        System.out.printf("\n%-12s%-8s%-11s%-12s\n",
        "ID Number", "Hours", "Pay rate", "Gross Wages");
        System.out.println("------------------------------------------");
        for (byte index = 0; index < EMPLOYEES; index++)
        {
            System.out.printf("%-12d%-8d%-11.3f%-12.3f\n",
            myPayroll.getId(index),
            myPayroll.getHours(index),
            myPayroll.getPayRate(index),
            myPayroll.getGrossPay(index));
        }
    }
}