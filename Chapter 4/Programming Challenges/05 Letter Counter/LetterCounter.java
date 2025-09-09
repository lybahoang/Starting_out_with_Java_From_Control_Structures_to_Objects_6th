import java.util.Scanner;
/**
 * This program shows my solution to the programming challenge 5 chapter 4.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 09 September 2025.
 */

public class LetterCounter
{
    public static void main(String[] args)
    {
        String inputString;         // To hold user's input string.
        String userString;          // To hold the user's input string.
        char targetCharacter;       // To hold the user's target character.
        int counterVariable = 0;    // To hold the number of times the target character
                                    // appearing in userString.

        // Create a Scanner object and connect it to the System.in object
        // to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get a string from the user.
        System.out.print("Enter a string: ");
        userString = keyboard.nextLine();

        // Get a target character from the user.
        do
        {
            System.out.print("Which character do you want to count? ");
            inputString = keyboard.nextLine();
            
            if (inputString.isEmpty())
            {
                System.out.println("Please enter at least one character.");
            }
        } while (inputString.isEmpty());
        targetCharacter = inputString.charAt(0);

        // Run a loop to count the number of times targetCharacter appearing
        // in userString.
        for (int count = 0; count < userString.length(); count++)
        {
            if (Character.toUpperCase(userString.charAt(count)) == 
                Character.toUpperCase(targetCharacter))
            {
                counterVariable++;
            }
        }

        // Display the result.
        System.out.println(targetCharacter + " appears " + counterVariable +
                           " times in the string.");

        // Close the Scanner.
        keyboard.close();          
    }
}