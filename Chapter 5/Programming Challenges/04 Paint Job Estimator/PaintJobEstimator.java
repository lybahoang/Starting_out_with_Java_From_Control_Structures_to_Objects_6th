import java.util.Scanner;

/**
 * This program shows my solution to the programming challenge 4 chapter 5.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 10 September 2025.
 */

public class PaintJobEstimator
{
    public static void main(String[] args)
    {
        // Get the number of rooms to be painted.
        byte numOfRooms = getNumOfRooms();

        // Get the price of the paint per gallon.
        double paintPrice = getPaintCost();

        // Get the square feet of wall space.
        float totalSquareFeet = getSquareFeet(numOfRooms);

        // Calculate the number of gallons required.
        float numGallonsRequired = calculateGallons(totalSquareFeet);

        // Calculate the hours of labor required.
        float hoursLaborRequired = calculateHours(totalSquareFeet);

        // Calculate the cost of the paint.
        double totalPaintCost = calculatePaintCost(numGallonsRequired, paintPrice);

        // Calculate the labor charges.
        double laborCharges = calculateLaborCharges(hoursLaborRequired);

        // Calculate the total paint cost.
        double totalCost = calculateTotalCost(totalPaintCost, laborCharges);

        // Display the data.
        System.out.println("\n--- Paint Job Report ---");
        System.out.println("Number of rooms: " + numOfRooms);
        System.out.println("Price per gallon: $" + paintPrice);
        System.out.println("Total square feet: " + totalSquareFeet);
        System.out.printf("Required gallons: %.2f\n", numGallonsRequired);
        System.out.printf("Hours of labor: %.2f\n", hoursLaborRequired);
        System.out.printf("Paint cost: $%.2f\n", totalPaintCost);
        System.out.printf("Labor charges: $%.2f\n", laborCharges);
        System.out.printf("Total cost: $%.2f\n", totalCost);
    }

    /**
     * The getNumOfRooms method asks the user to enter the number of rooms to
     * be painted and return that value as a byte
     * @return The number of rooms
     */
    public static byte getNumOfRooms()
    {
        // Create a Scanner object to read input from the keyboard.
        Scanner keyboard = new Scanner(System.in);

        // Get the number of rooms.
        System.out.print("Enter the number of rooms: ");
        byte numRooms = keyboard.nextByte();

        // Return the number of rooms.
        return numRooms;
    }

    /**
     * The getSquareFeet method asks the user to enter the square feet of wall
     * space to be painted in each room and return that value as a float
     * @param numRooms The number of rooms
     * @return The number of square feet of wall space
     */
    public static float getSquareFeet(byte numRooms)
    {
        // An accumulator to hold the total square feet.
        float totalSquareFeet = 0.0f;
        
        // A variable to hold the square feet in each room.
        float squareFeet;

        // Create a Scanner object to read input from the keyboard.
        Scanner keyboard = new Scanner(System.in);

        for (int roomCount = 0; roomCount < numRooms; roomCount++)
        {
            // Get the square feet of wall space.
            System.out.print("Enter the square feet of wall space in room #"
                             + (roomCount + 1) + ": ");
            squareFeet = keyboard.nextFloat();
            totalSquareFeet += squareFeet;
        }

        // Return the value.
        return totalSquareFeet;
    }

    /**
     * The getPaintCost method asks the user to enter the price of the paint
     * per gallon and return that value as a double
     * @return The price of paint per gallon
     */
    public static double getPaintCost()
    {
        // Create a Scanner object to read input from the keyboard.
        Scanner keyboard = new Scanner(System.in);

        // Get the price of paint per gallon.
        System.out.print("Enter the price of paint per gallon: $");
        double price = keyboard.nextDouble();

        // Return the value.
        return price;
    }

    /**
     * The calculateGallons method calculates the number of gallons needed to 
     * paint wall space and return the value as a float
     * @param squareFeet The square feet of wall space to be painted
     * @return The number of gallons
     */
    public static float calculateGallons(float squareFeet)
    {
        final float SQUARE_FEET_PER_GALLON = 115f;
        return squareFeet / SQUARE_FEET_PER_GALLON;
    }

    /**
     * The calculateHours method calculates the number of hours required to
     * paint wall space and return the values as float
     * @param squareFeet The square feet of wall space to be painted
     * @return The number of hours
     */
    public static float calculateHours(float squareFeet)
    {
        final float HOURS_PER_SQUARE_FEET = (float)(8.0 / 115);
        return squareFeet * HOURS_PER_SQUARE_FEET;
    }

    /**
     * The calculatePaintCost method calculates the total cost of the paint
     * and return that value as a double
     * @param numGallons The number of gallons
     * @param gallonCost The cost per gallon
     * @return The total cost of the paint
     */
    public static double calculatePaintCost(float numGallons, double gallonCost)
    {
        return numGallons * gallonCost;
    }

    /**
     * The calculateLaborCharges method calculates the total labor charges and
     * return that value as double
     * @param requiredHours The number of hours required
     * @return The total cost of labor
     */
    public static double calculateLaborCharges(float requiredHours)
    {
        final float CHARGE_PER_HOUR = 18.00f;
        return requiredHours * CHARGE_PER_HOUR;
    }

    /**
     * The calculateTotalCost method calculates the total cost of the paint job
     * and returns it as a double
     * @param paintCost The total cost of paint
     * @param laborCharges The total charges of labor
     * @return The total cost of paint job
     */
    public static double calculateTotalCost(double paintCost, double laborCharges)
    {
        return (paintCost + laborCharges);
    }
}