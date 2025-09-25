import java.util.Scanner;

/**
    Programming Challenge 2: ShiftSupervisor Class
 */
public class ShiftSupervisorDemo
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read input of the supervisor.
        Scanner keyboard = new Scanner(System.in);

        // Get the supervisor's name.
        System.out.print("Enter the supervisor's name: ");
        String name = keyboard.nextLine();

        // Get the supervisor's number.
        System.out.print("Enter the supervisor's number: ");
        String number = keyboard.nextLine();

        // Validate the supervisor's number.
        while(!checkNumber(number))
        {
            System.out.println("Error: The supervisor's number is invalid.");
            System.out.print("Enter the supervisor's number: ");
            number = keyboard.nextLine();
        }

        // Get the supervisor's hire date.
        System.out.print("Enter the supervisor's hire date: ");
        String date = keyboard.nextLine();

        // Get the supervisor's annual salary.
        System.out.print("Enter the supervisor's annual salary: $");
        double salary = keyboard.nextDouble();

        // Validate the salary.
        while (salary < 0)
        {
            System.out.println("Please enter a nonnegative value.");
            System.out.print("Enter the supervisor's annual salary: $");
            salary = keyboard.nextDouble();
        }

        // Get the supervisor's annual bonus.
        System.out.print("Enter the supervisor's annual bonus: $");
        double bonus = keyboard.nextDouble();

        // Validate the bonus.
        while (bonus < 0)
        {
            System.out.println("Please enter a nonnegative value.");
            System.out.print("Enter the supervisor's annual bonus: $");
            bonus = keyboard.nextDouble();
        }

        // Create a ShiftSupervisor object with the input data.
        ShiftSupervisor shiftSupervisor1 = new ShiftSupervisor(
            name, number, date, salary, bonus
        );

        // Display the information of the shift supervisor.
        System.out.println();
        System.out.println(shiftSupervisor1);
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