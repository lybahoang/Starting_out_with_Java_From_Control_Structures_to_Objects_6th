import java.io.*;
import java.util.Scanner;

/**
 * This program shows my solution to the programming challenge 5 chapter 4.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 09 September 2025.
 */

public class FileLetterCounter
{
    public static void main(String[] args) throws IOException
    {
        int counterVariable = 0;    // To hold the times the target character appears

        // Create a Scanner object and connect it to the System.in object
        // to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the file name from the user.
        System.out.print("Enter the name of a file: ");
        String fileName = keyboard.nextLine();

        // Get the target character from the user.
        System.out.print("Enter a target character: ");
        String inputString = keyboard.nextLine();
        while (inputString.isEmpty())
        {
            System.out.println("Please enter at least one character: ");
            inputString = keyboard.nextLine();
        }
        char targetCharacter = inputString.charAt(0);

        // Make sure the file exists.
        File file = new File(fileName);
        if (!file.exists())
        {
            System.out.println("The file " + fileName + " is not found.\n");
            System.exit(0);
        }

        // Open the file for reading.
        Scanner inputFile = new Scanner(file);
        
        // Read each line of file in the file and count.
        while (inputFile.hasNextLine())
        {
            // Read one line of the file.
            inputString = inputFile.nextLine();

            // Scan the line to count the target character.
            for (int count = 0; count < inputString.length(); count++)
            {
                if (Character.toUpperCase(inputString.charAt(count)) == 
                    Character.toUpperCase(targetCharacter))
                {
                    counterVariable++;
                }
            }
        }

        // Display the result.
        System.out.println(targetCharacter + " appears " + counterVariable +
                           " times in the file.");

        // Close the file.
        inputFile.close();

        // Close the keyboard.
        keyboard.close();
    }
}