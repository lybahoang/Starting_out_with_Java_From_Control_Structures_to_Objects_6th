import java.util.Scanner;

/**
 * This program shows my solution to the programming challenge 3 chapter 5.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 10 September 2025.
 */

public class RectangleArea
{
    public static void main(String[] args)
    {
        // Get the rectangle's length.
        double length = getLength();

        // Get the rectangle's width.
        double width = getWidth();

        // Calculate the rectangle's area.
        double area = getArea(length, width);

        // Display the data of the rectangle.
        displayData(length, width, area);
    }

    /**
     * The getLength method asks the user to enter the rectangle's length,
     * and then returns that value as a double
     * @return The length of the rectangle
     */
    public static double getLength()
    {
        // Create a Scanner object to read input from the keyboard.
        Scanner keyboard = new Scanner(System.in);

        // Get the rectangle's length from the user.
        System.out.print("Enter the rectangle's length: ");
        double length = keyboard.nextDouble();

        // Return the rectangle;s length.
        return length;
    }

    /**
     * The getWidth function asks the user to enter the rectangle's width
     * and then returns that value as a double
     * @return The rectangle's width
     */
    public static double getWidth()
    {
        // Create a Scanner object ot read input from the keyboard.
        Scanner keyboard = new Scanner(System.in);

        // Get the width of the rectangle.
        System.out.print("Enter the rectangle's width: ");
        double width = keyboard.nextDouble();

        // Return the rectangle's width.
        return width;
    }

    /**
     * The getArea method accepts the rectangle's length and width,
     * and then return the rectangle's area
     * @param length The length of the rectangle
     * @param width The width of the rectangle
     * @return The area of the rectangle
     */
    public static double getArea(double length, double width)
    {
        return length * width;
    }

    /**
     * The displayData method accepts the rectangle's length, width, and
     * area. It displays an appropriate message on the screen
     * @param length The length of the rectangle
     * @param width The width of the rectangle
     * @param area The area of the rectangle
     */
    public static void displayData(double length, double width, double area)
    {
        System.out.println("Rectangle information:");
        System.out.printf("  Length: %f\n", length);
        System.out.printf("  Width: %f\n", width);
        System.out.printf("  Area: %f\n", area);
    }
}