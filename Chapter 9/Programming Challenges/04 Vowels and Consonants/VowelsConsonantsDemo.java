import java.util.Scanner;

public class VowelsConsonantsDemo
{
    public static void main(String[] args)
    {
        char option;     // To hold the user's option.

        // Declare some constants for option.
        final char OPTION_A = 'a';
        final char OPTION_B = 'b';
        final char OPTION_C = 'c';
        final char OPTION_D = 'd';
        final char OPTION_E = 'e';
        
        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get a string from the user.
        System.out.print("Enter a string: ");
        String inputString = keyboard.nextLine();
        
        // Create a VowelsConsonants object to hold the string.
        VowelsConsonants object = new VowelsConsonants(inputString);

        // Display the menu and get the user's option.
        displayMenu();
        option = getOption();

        // Handle the user's option.
        while (option != OPTION_E)
        {
            if (option == OPTION_A)
            {
                System.out.print("Number of vowels: ");
                System.out.println(object.getVowel());
            }
            else if (option == OPTION_B)
            {
                System.out.print("Number of consonants: ");
                System.out.println(object.getConsonanats());
            }
            else if (option == OPTION_C)
            {
                System.out.print("Number of vowels: ");
                System.out.println(object.getVowel());
                System.out.print("Number of consonants: ");
                System.out.println(object.getConsonanats());
            }
            else if (option == OPTION_D)
            {
                // Get a string from the user.
                System.out.print("Enter a string: ");
                inputString = keyboard.nextLine();

                // Store the input string in the object.
                object.setString(inputString);
            }

            // Display the menu and get the user's option.
            displayMenu();
            option = getOption();
        }
    }

    /**
        The displayMenu method displays the menu of the program
     */
    public static void displayMenu()
    {
        System.out.println("--- MENU ---");
        System.out.println("a. Count the number of vowels in the string.");
        System.out.println("b. Count the number of consonants in the string.");
        System.out.println("c. Count both the vowels and consonants in the string.");
        System.out.println("d. Enter another string.");
        System.out.println("e. Exit the program.");
    }

    /**
        The getOption method gets an option from the user
        @return The user's option
     */
    public static char getOption()
    {
        System.out.print("Enter an option (a - e): ");
        Scanner keyboard = new Scanner(System.in);
        String inputString = keyboard.nextLine();
        char userOption = Character.toLowerCase(inputString.charAt(0));

        // Validate the user's option.
        while ("abcde".indexOf(userOption) == -1)
        {
            System.out.println("Error: Option is not valid.");
            System.out.print("Enter an option (a - e): ");
            inputString = keyboard.nextLine();
            userOption = Character.toLowerCase(inputString.charAt(0));
        }

        // Return the user's option.
        return userOption;
    }
}