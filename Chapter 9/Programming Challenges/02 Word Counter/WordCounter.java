import java.util.ArrayList;
import java.util.Scanner;
/**
    Programming Challenge 02 Word Counter.
 */
public class WordCounter
{
    public static void main(String[] args)
    {
        String inputStr;    // To hold a string

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get a string from the user.
        System.out.print("Enter a string: ");
        inputStr = keyboard.nextLine();

        // Display the number of words in the string.
        System.out.print("Number of words: ");
        System.out.println(countWord(inputStr));
    }

    /**
        The countWord method returns the number of words in
        a string.
        @param inputStr The input string.
        @return The number of words in str.
     */
    public static int countWord(String inputStr)
    {
        // Get the tokens of str splited by a space.
        String[] rawTokens = inputStr.trim().split(" ");

        // Remove all empty strings in the array and store 
        // other strings in a new array.
        ArrayList<String> tokens = new ArrayList<String>();

        for (String str : rawTokens)
        {
            if (str.length() > 0)
                tokens.add(str);
        }

        // Return the number of words.
        return tokens.size();
    }
}