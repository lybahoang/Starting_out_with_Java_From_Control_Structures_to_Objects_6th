/**
    This shows my solution to the programming challenge 7 in chapter 2.
    Book: Starting out with Java: From Control structures to Objects (6th).
    Date: 07 September 2025.
 */
import java.util.Scanner;   // Needed for the Scanner class.

public class SalesTax
{
    public static void main(String[] args) {
        // Declare constants for state sales tax and county sales tax.
        final double STATE_SALES_TAX_PERCENT = 0.04;
        final double COUNTY_SALES_TAX_PERCENT = 0.02;

        // Create a Scanner object and connect it to the System.in
        // object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the user's amount of a purchase.
        System.out.print("Enter the amount of your purchase: $");
        double purchaseAmount = keyboard.nextDouble();

        // Calculate the state sales tax amount.
        double stateSalesTaxAmount = purchaseAmount * STATE_SALES_TAX_PERCENT;

        // Calculate the county sales tax amount.
        double countySalesTaxAmount = purchaseAmount * COUNTY_SALES_TAX_PERCENT;

        // Calculate the total sales tax.
        double totalSalesTax = stateSalesTaxAmount + countySalesTaxAmount;

        // Calculate the total amount of the purchase.
        double totalPurchaseAmount = purchaseAmount + totalSalesTax;

        // Dislay the information of the purchase.
        System.out.println("\n--- Bill ---");
        System.out.println("Purchase amount: $" + purchaseAmount);
        System.out.println("State tax amount: $" + stateSalesTaxAmount);
        System.out.println("County tax amount: $" + countySalesTaxAmount);
        System.out.println("Total tax: $" + totalSalesTax);
        System.out.println("Total amount: $" + totalPurchaseAmount);
    }    
}
