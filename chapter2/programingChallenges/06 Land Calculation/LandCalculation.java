/**
    This shows my solution to the programming challenge 6 in chapter 2.
    Book: Starting out with Java: From Control structures to Objects (6th).
    Date: 07 September 2025.
 */

public class LandCalculation
{
    public static void main(String[] args)
    {
        // A named constant for the conversional factor.
        final double ACRE_TO_FEET = 43560.0;

        // Initialize a variable of the number of square feet of the land.
        double squareFeet = 389767.0;

        // Calculate the number of acres of the land
        double acres = squareFeet / ACRE_TO_FEET;

        // Display the result.
        System.out.print("Acres: " + acres);
    }
}