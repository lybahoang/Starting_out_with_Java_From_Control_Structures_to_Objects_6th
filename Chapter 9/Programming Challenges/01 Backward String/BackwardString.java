import java.util.Scanner;
/**
    Programming Challenges 01 Backward String
 */
public class BackwardString
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read input from the user.
        Scanner keyboard = new Scanner(System.in);

        // Get a string from the user.
        System.out.print("Enter a string: ");
        String inputStr = keyboard.nextLine();

        // Display the contents of the string backward.
        displayBackward(inputStr);

        // Close the keyboard.
        keyboard.close();
    }

    /**
        The displayBackward method displays the contents of
        a string in backward order
        @param str The input string
     */
    public static void displayBackward(String str)
    {
        for (int index = str.length() - 1; index >= 0; index--)
        {
            System.out.print(str.charAt(index));
        }
    }
}