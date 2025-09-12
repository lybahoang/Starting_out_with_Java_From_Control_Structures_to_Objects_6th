/**
 * This program shows my solution to the programming challenge 4 chapter 6.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 12 September 2025.
 */
public class RetailItemDemo
{
    public static void main(String[] args)
    {
        // Create the item 1 and item 2 using the RetailItem class's constructor.
        RetailItem item1 = new RetailItem(
            "Jacket", 12, 59.95
        );

        RetailItem item2 = new RetailItem(
            "Designer Jeans", 40, 34.95
        );

        // Create the item 3 using mutator methods.
        RetailItem item3 = new RetailItem();
        item3.setDescription("Shirt");
        item3.setUnitsOnHand(20);
        item3.setPrice(24.95);

        // Display the items.
        System.out.printf("%12s%-18s%-20s%-5s\n", 
                        "", "Description", "Units On Hand", "Price");
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-12s", "Item #1");
        displayRetailItem(item1);
        System.out.printf("%-12s", "Item #2");
        displayRetailItem(item2);
        System.out.printf("%-12s", "Item #3");
        displayRetailItem(item3);
    }

    /**
        The displayRetailItem method accepts a RetailItem object and
        displays information of the item on the screen
        @param item A RetailItem object
     */
    public static void displayRetailItem(RetailItem item)
    {
        System.out.printf("%-18s%-20d%-5.2f\n",
            item.getDescription(),
            item.getUnitsOnHand(),
            item.getPrice());
    }
}