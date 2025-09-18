import java.util.Scanner;

/**
    Programming challenges 2 chapter 7: Starting out with Java: From
    Control structures to Objects (6th)
    Date: 18 September 2025
 */

public class ChargeAccountDemo
{
    public static void main(String[] args)
    {
        // Create a ChargeAccount object.
        ChargeAccount database = new ChargeAccount();

        // Create a Scanner object to read input from the keyboard.
        Scanner keyboard = new Scanner(System.in);

        // Get a charge account number from the user.
        System.out.print("Enter a charge account number: ");
        int chargeNumber = keyboard.nextInt();

        // Display the validity of the charge account number.
        System.out.println("The charge account is " +
            (database.checkValidity(chargeNumber) ? "valid" : "invalid")
        );
    }
}