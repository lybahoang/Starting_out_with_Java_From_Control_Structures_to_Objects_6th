import java.util.Scanner;
/**
 * This program shows my solution to the programming challenge 1 chapter 5.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 10 September 2025.
 */

public class showCharMethod
{
    public static void main(String[] args)
    {
        String userString;  // To hold a string.

        // Create a Scanner object and connect it to the System.in object
        // to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get a string from the user.
        System.out.print("Enter a string: ");
        userString = keyboard.nextLine();

        // Get a position to display the character.
        System.out.print("Enter a position of character in the string: ");
        byte position = keyboard.nextByte();

        while (position > userString.length() || position < 1)
        {
            System.out.println("Error: The position is invalid.");
            System.out.print("Enter a position from 1 to " + userString.length() + ": ");
            position = keyboard.nextByte();
        }

        // Display the character.
        showChar(userString, position - 1);

        // Close the keyboard.
        keyboard.close();
    }

    /**
     * The showChar method displays the character at a specified position
     * in a string
     * @param inputString The string object reference variable
     * @param position The position of character
     */
    public static void showChar(String inputString, int position)
    {
        System.out.println(inputString.charAt(position));
    }
}