import java.util.Scanner;

/**
    Programming Challenge 3: TeamLeader class
 */

public class TeamLeaderDemo
{
    public static void main(String[] args)
    {    
        // Get the team leader's name.
        String name = getName();

        // Get the team leader's number.
        String number = getNumber();

        // Get the team leader's hire date.
        String date = getHireDate();

       // Get the team leader's shift.
       int shift = getShift();

        // Get the team leader's hourly pay rate.
        double hourlyPayRate = getHourlyPayRate();

        // Get the team leader's monthly bonus.
        double monthlyBonus = getMonthlyBonus();

        // Get the team leader's required training hours.
        double requiredHours = getRequiredTrainingHours();

        // Get the team leader's attended training hours.
        double attendedHours = getAttendedTrainingHours();

        // Create a TeamLeader object with the input data.
        TeamLeader teamLeader1 = new TeamLeader(
            name, number, date, shift, hourlyPayRate, monthlyBonus,
            requiredHours, attendedHours
        );    
        
        // Display the information of the team leader.
        System.out.println();
        System.out.println(teamLeader1);
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

    /**
        The getName method asks the user for a team leader's name and
        returns that name
        @return The team leader's name
     */
    public static String getName()
    {
        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the team leader's name.
        System.out.print("Enter the team leader's name: ");
        String name = keyboard.nextLine();

        // Return the name.
        return name;
    }

    /**
        The getNumber method asks the user for a team leader's number
        and returns that number
        @return The team leader's number
     */
    public static String getNumber()
    {
        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the team leader's number.
        System.out.print("Enter the teamp leader's number: ");
        String number = keyboard.nextLine();

        // Validate the team leader's number.
        while (!checkNumber(number))
        {
            System.out.println("Error: The format of the number is invalid.");
            System.out.print("Enter the team leader's number: ");
            number = keyboard.nextLine();
        }

        // Return the number.
        return number;
    }

    /**
        The getHireDate method asks the user for a team leader's hire
        date and returns that date
        @return The team leader's hire date
     */
    public static String getHireDate()
    {
        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the hire date.
        System.out.print("Enter the team leader's hire date: ");
        String date = keyboard.nextLine();

        // Return the hire date.
        return date;
    }

    /**
        The getShift method asks the user for a team leader's shift
        and returns that value
        @return The team leader's shift
     */
    public static int getShift()
    {
        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the team leader's shift.
        System.out.print("Enter the team leader's shift: ");
        int shift = keyboard.nextInt();

        // Validate the team leader 's shift.
        while (shift != 1 && shift != 2)
        {
            System.out.println("Enter 1 for day shift or 2 for night shift.");
            System.out.print("Enter the team leader's shift: ");
            shift = keyboard.nextInt();
        }

        // Return the shift.
        return shift;
    }

    /**
        The getHourlyPayRate method asks the user for a team leader's
        hourly pay rate and returns that rate
        @return The team leader's hourly pay rate
     */
    public static double getHourlyPayRate()
    {
        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the team leader's hourly pay rate.
        System.out.print("Enter the hourly pay rate: ");
        double payRate = keyboard.nextDouble();

        // Validate the team leader's hourly pay rate.
        while (payRate < 0)
        {
            System.out.println("Please enter a value at least 0.");
            System.out.print("Enter the hourly pay rate: ");
            payRate = keyboard.nextDouble();
        }

        // Return the pay rate.
        return payRate;
    }

    /**
        The getMonthlyBonus method asks the user for a team leader's
        monthly bonus and returns that value
        @return The team leader's monthly bonus
     */
    public static double getMonthlyBonus()
    {
        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the team leader's monthly bonus.
        System.out.print("Enter the team leader's monthly bonus: $");
        double bonus = keyboard.nextDouble();

        // Validate the team leader's hourly pay rate.
        while (bonus < 0)
        {
            System.out.println("Please enter a value at least 0.");
            System.out.print("Enter the team leader's monthly bonus: $");
            bonus = keyboard.nextDouble();
        }

        // Return the bonus.
        return bonus;
    }

    /**
        The getRequiredTrainingHours method asks the user for a team
        leader's required number of training hours and returns that
        value
        @return The required number of training hours
     */
    public static double getRequiredTrainingHours()
    {
        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the team leader's required training hours.
        System.out.print("Enter the required training hours: ");
        double hours = keyboard.nextDouble();

        // Validate the team leader's required training hours.
        while (hours < 0)
        {
            System.out.println("Please enter a value at least 0.");
            System.out.print("Enter the required training hours: ");
            hours = keyboard.nextDouble();
        }

        // Return the hours.
        return hours;
    }

    /**
        The getAttendedTrainingHours method asks the user for a team
        leader's attended number of training hours and returns that
        value
        @return The attended number of training hours
     */
    public static double getAttendedTrainingHours()
    {
        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the team leader's attended training hours.
        System.out.print("Enter the attended training hours: ");
        double hours = keyboard.nextDouble();

        // Validate the team leader's attended training hours.
        while (hours < 0)
        {
            System.out.println("Please enter a value at least 0.");
            System.out.print("Enter the attended training hours: ");
            hours = keyboard.nextDouble();
        }

        // Return the hours.
        return hours;
    }
}