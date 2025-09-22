import java.util.Scanner;

public class PasswordVerifierDemo
{
    public static void main(String[] args) {
        String password;       // To hold the user's password.

        // Display the guideline for the password.
        System.out.println("Let's create the password for your account.");
        System.out.println("The password should be at least six characters long.");
        System.out.println("The password should contain at least one uppercase " +
        "and at least one lowercase letter.");
        System.out.println("The password should have at least one digit.");
        System.out.print("Enter your password: ");

        // Create a Scanner object to read input from the user.
        Scanner keyboard = new Scanner(System.in);

        // Get the user's password.
        password = keyboard.nextLine();

        // Verify the user's password.
        if (PasswordVerifier.verifyPassword(password))
        {
            System.out.println("Your password is valid.");
        }
        else
        {
            if (!PasswordVerifier.verifyLength(password))
            {
                System.out.println("Your password is not long enough.");
            }
            if (!PasswordVerifier.verifyLetter(password))
            {
                System.out.println("Your password does not contain enough uppercase " +
                                   "or lowercase.");
            }
            if (!PasswordVerifier.verifyDigit(password))
            {
                System.out.println("Your password does not have digit.");
            }
        }
    }
}