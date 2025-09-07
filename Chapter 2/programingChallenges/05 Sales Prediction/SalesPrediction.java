/**
    This shows my solution to the programming challenge 5 in chapter 2.
    Book: Starting out with Java: From Control structures to Objects (6th).
    Date: 07 September 2025.
 */

public class SalesPrediction 
{
    public static void main(String[] args)
    {
        // A named constant to the percentage of s
        final double SALE_PERCENT = 0.62;
        
        // A named constant for the predicted sales.
        final double PREDICTED_SALES = 4.6;

        // Calculate the predicted revenue.
        double predictedRevenue = SALE_PERCENT * PREDICTED_SALES;

        // Display the results.
        System.out.println("Predicted revenue: $" + predictedRevenue);
    }    
}
