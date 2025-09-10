import java.util.Scanner;
/**
 * This program shows my solution to the programming challenge 2 chapter 5.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 10 September 2025.
 */

public class RetailPriceCalculator
{
    public static void main(String[] args)
    {
        double wholesaleCost;   // To hold the wholesale cose.
        float markupPercentage; // To hold the markup percentage.

        // Create a Scanner object and connect it to the System.in object
        // to read input from the keyboard.
        Scanner keyboard = new Scanner(System.in);

        // Get the wholesale cost.
        System.out.print("Enter the wholesale cost: $");
        wholesaleCost = keyboard.nextDouble();

        while (wholesaleCost < 0)
        {
            System.out.print("Please enter a nonnegative number: $");
            wholesaleCost = keyboard.nextDouble();
        }

        // Get the markup percentage.
        System.out.print("Enter the markup percentage: ");
        markupPercentage = keyboard.nextFloat();

        while (markupPercentage < 0)
        {
            System.out.print("Please enter a nonnegative number: ");
            markupPercentage = keyboard.nextFloat();
        }

        // Calculate and display the retail price of the item.
        System.out.println("Retail price: $" + calculateRetail(wholesaleCost, markupPercentage));

        // Close the keyboard.
        keyboard.close();
    }

    /**
     * The calculateRetail methods accepts the wholesale cost and the markup
     * percentage, calculates the retail price of an item and returns it
     * @param wholesaleCost The wholesale cost of the item
     * @param markupPercentage The markup percentage
     * @return The retail price of the item
     */
    public static double calculateRetail(double wholesaleCost, float markupPercentage)
    {
        return wholesaleCost + wholesaleCost * markupPercentage / 100;
    }
}