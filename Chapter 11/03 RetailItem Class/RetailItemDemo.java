import java.util.Scanner;
/**
    Programming Challenge 3: RetailItem Class.
 */
public class RetailItemDemo
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read input from the keyboard.
        Scanner keyboard = new Scanner(System.in);

        // Create a RetailItem object.
        RetailItem item1 = new RetailItem();

        // Get the description of the retail item.
        System.out.print("Enter the description: ");
        String description = keyboard.nextLine();

        // Set the description to item1.
        item1.setDescription(description);

        try
        {
            // Get the number of units on hand.
            System.out.print("Enter the number of units on hand: ");
            int unitsOnHand = keyboard.nextInt();
            
            // Set the number of units on hand to item1.
            item1.setUnitsOnHand(unitsOnHand);

            // Get the price of the retail item.
            System.out.print("Enter the price: $");
            double price = keyboard.nextDouble();

            // Set the price to item1.
            item1.setPrice(price);
    
            // Display the data of item1.
            item1.displayInfo();
        }
        catch (NegativeUnit e)
        {
            System.out.println(e.getMessage());
        }
        catch (NegativePrice e)
        {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e)
        {
            System.out.println("Error: Not a numeric value.");
        }
    }
}