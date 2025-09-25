import java.util.Scanner;

/**
    Programming Challenge 1 Chapter 11.
 */
public class EmployeeProductionWorkerDemo
{
    public static void main(String[] args)
    {
        // Create a ProductionWorker object with a call to the
        // default constructor.
        ProductionWorker productionWorker1 = new ProductionWorker();

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the employee's name.
        System.out.print("Enter the employee's name: ");
        String name = keyboard.nextLine();

        // Get the employee's number.
        System.out.print("Enter the employee's number: ");
        String number = keyboard.nextLine();

        // Validate the employee's number.
        while (!checkNumber(number))
        {
            System.out.println("Error: The format of the employee's number is invalid.");
            System.out.print("Enter the employee's number: ");
            number = keyboard.nextLine();
        }

        // Get the employee's hire date.
        System.out.print("Enter the employee's hire date: ");
        String date = keyboard.nextLine();

        // Get the employee's shift.
        System.out.print("Enter the employee's shift: ");
        int shift = keyboard.nextInt();

        // Validate the employee's shift.
        while (shift != 1 && shift != 2)
        {
            System.out.println("Enter 1 for day shift or 2 for night shift.");
            System.out.print("Enter the employee's shift: ");
            shift = keyboard.nextInt();
        }

        // Get the employee's hourly pay rate.
        System.out.print("Enter the employee's hourly pay rate: ");
        double payRate = keyboard.nextDouble();

        // Validate the employee's hourly pay rate.
        while (payRate < 0)
        {
            System.out.println("Please enter a value at least 0.");
            System.out.print("Enter the employee's hourly pay rate: ");
            payRate = keyboard.nextDouble();
        }

        // Store the data into the object.
        productionWorker1.setName(name);
        productionWorker1.setNumber(number);
        productionWorker1.setHireDate(date);
        productionWorker1.setShift(shift);
        productionWorker1.setHourlyPayRate(payRate);

        // Display the information of the employee.
        System.out.println();
        System.out.println(productionWorker1);
    }

    /**
        The checkNumber method returns true if an employee's number
        is in valid format "XXX-L", where each X is a digit 0-9 and L
        is a letter A-M
        @param number The employee's number
        @return True if the employee's number is in valid format, or
                False otherwise
     */
    public static boolean checkNumber(String number)
    {
        boolean isValid = true;    // A flag.

        // Check if the length of the employee's number is valid.
        if (number.trim().length() != 5)
        {
            isValid = false;
        }
        // Check for the first three characters. They should be a digit
        // from 0 to 9.
        if (!Character.isDigit(number.charAt(0)) ||
            !Character.isDigit(number.charAt(1)) ||
            !Character.isDigit(number.charAt(2))
            )
        {
            isValid = false;
        }
        // Check for a dashed in the number.
        if (number.charAt(3) != '-')
        {
            isValid = false;
        }
        // Check for the letter at the end of the number.
        if (!Character.isLetter(number.charAt(4)))
        {
            isValid = false;
        }

        // Return the checking result.
        return isValid;
    }
}