import java.util.Scanner;

public class SumOfNumbers
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read input from the keyboard.
        Scanner keyboard = new Scanner(System.in);

        // Get the series of numbers separated by commas.
        System.out.print("Enter a series of numbers separated " +
                         "by commas: ");
        String numberSeries = keyboard.nextLine();

        // Tokenize the series of numbers by commas.
        String[] numbersArray = numberSeries.split(",");

        // Calculate the sum of the series.
        double total = 0;
        for (String number : numbersArray)
        {
            total += Double.parseDouble(number);
        }

        // Display the total.
        System.out.println("Total: " + total);
    }
}