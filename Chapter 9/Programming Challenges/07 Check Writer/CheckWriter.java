import java.util.Scanner;

public class CheckWriter
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read the input from the keyboard.
        Scanner keyboard = new Scanner(System.in);

        // Get the date of the paycheck.
        System.out.print("Enter the date: ");
        String date = keyboard.nextLine();

        // Get the payee's name of the paycheck.
        System.out.print("Enter the payee's name: ");
        String name = keyboard.nextLine();

        // Get the amount of the check.
        final double MAX_AMOUNT = 10000.0;
        final double MIN_AMOUNT = 1;

        System.out.print("Enter the amount of the check: $");
        double checkAmount = keyboard.nextDouble();

        // Validate the check amount.
        while (checkAmount < MIN_AMOUNT || checkAmount > MAX_AMOUNT)
        {
            System.out.println("Enter an amount from 1 to 10000.");
            System.out.print("Enter the amount of the check: $");
            checkAmount = keyboard.nextDouble();
        }

        // Display the simulated paycheck.
        System.out.printf("%55s%-8s%-10s\n",
                          "", "Date: ", date);
        System.out.printf("%-55s%8s%-10s\n",
                          "Pay to the Order of:   " + name, "", "$" + checkAmount);
        System.out.println(dollarSpellOut(checkAmount));
    }

    /**
        The dollarSpellOut method returns a string that spells out
        a dollar amount
        @param dollar The dollar amount
        @return The string spelling out the dollar amount
     */
    public static String dollarSpellOut(double dollar)
    {
        // Create a StringBuilder object to hold the output string.
        StringBuilder outputString = new StringBuilder();

        // Arrays of string to hold words.
        String[] onesWord = { "one", "two", "three", "four", "five", "six",
                              "seven", "eight", "nine" };
        String[] teensWord = { "ten", "eleven", "twelve", "thirteen", "fourteen",
                               "fifteen", "sixteen", "seventeen", "eighteen",
                               "nineteen" };
        String[] tensWord = { "ten", "twenty", "thirty", "fourty", "fifty", "seventy",
                              "eighty", "ninety" };
        
        // Build the string.
        if (dollar == 10000.0)
        {
            outputString.append("Ten thousand and 0 cents.");
        }
        else
        {
            // Get the thousand part.
            int thousandPart = (int)dollar / 1000;
            if (thousandPart > 0)
            {
                outputString.append(onesWord[thousandPart - 1]);
                outputString.append(" thousand ");
                dollar = dollar - (thousandPart * 1000);
            }

            // Get the hundred part.
            int hundredPart = (int)dollar / 100;
            if (hundredPart > 0)
            {
                outputString.append(onesWord[hundredPart - 1]);
                outputString.append(" hundred ");
                dollar = dollar - (hundredPart * 100);
            }
            
            // Get the tens part.
            int tenPart = (int)(dollar / 10);
            if (tenPart > 1)
            {
                outputString.append(tensWord[tenPart - 1]);
                outputString.append(" ");
                dollar = dollar - (tenPart * 10);
            }
            else if (tenPart == 1)
            {
                int teenPart = (int)(dollar - (tenPart * 10));
                outputString.append(teensWord[teenPart]);
                outputString.append(" ");
                dollar = dollar - (tenPart * 10) - teenPart;
            }
            
            // Get the cent part.
            int centComponent = (int)(dollar * 100) + 1;
            outputString.append("and " + centComponent + " cents.");
        }
        
        // Captialize the first letter of the output string.
        outputString.setCharAt(0, Character.toUpperCase(outputString.charAt(0)));
        // Return the string.
        return outputString.toString();
    }
}