import java.util.Scanner;

public class PhoneNumber
{
    public static void main(String[] args)
    {
        // Create two parallel String arrays to hold people's name and their
        // phone numbers.
        String[] nameArray = { "Harrison, Rose", "James, Jean", "Smith, William",
                               "Smith, Brad" };
        String[] phoneNumberArray = { "555-2234", "555-9098", "555-1785", "555-9224" };

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get a name or the first few characters of a name from the user.
        System.out.print("Enter a name or the first few characters of a name: ");
        String inputString = keyboard.nextLine();

        // A loop to scan the people's name array.
        for (int index = 0; index < nameArray.length; index++)
        {
            // Search for inputString in each name.
            if (nameArray[index].indexOf(inputString) != -1)
            {
                System.out.println(nameArray[index] + ": " + phoneNumberArray[index]);
            }
        }
    }
}