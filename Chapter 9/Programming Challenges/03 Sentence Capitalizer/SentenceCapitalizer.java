import java.util.Scanner;

/**
    Programming Challenge 03 Sentence Capitalizer.
 */
public class SentenceCapitalizer
{
    public static void main(String[] args) 
    {
        String inputStr;    // To hold input string.

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get a string from the user.
        System.out.print("Enter a string: ");
        inputStr = keyboard.nextLine();

        // Display the string after capitalizing its first
        // character.
        System.out.println(sentenceCapitalizer(inputStr));
    }

    /**
        The sentenceCapitalizer method returns a copy of the
        string with the first character of each sentence capitalized.
        @param inputStr The input string.
        @return A string with the first character of each sentence
                capitalized.
     */
    public static String sentenceCapitalizer(String inputStr)
    {
        // If the inputStr is empty, then return an empty string.
        if (inputStr == null || inputStr.trim().isEmpty())
            return "";

        // Create a StringBuilder object to hold the output string.
        StringBuilder outputString = new StringBuilder(inputStr);

        // Capitalize the first character.
        outputString.setCharAt(0, Character.toUpperCase(outputString.charAt(0)));
        
        // The variable index will be used to get an index in the
        // string.
        int index;

        // Get the index of the first period followed by a space.
        index = inputStr.indexOf(". ");

        while (index != -1)
        {
            // Increment index so it refers to the position of the space.
            index++;

            // Find the first character of the next sentence.
            while (index < outputString.length() && outputString.charAt(index) == ' ')
            {
                index++;
            }

            // Capitalize the character.
            outputString.setCharAt(index, Character.toUpperCase(outputString.charAt(index)));

            // The the index of the next period followed by a space.
            index = outputString.indexOf(". ", index);
        }
        
        // Return a copy of the output string.
        return outputString.toString().trim();
    }
}