/**
 * This program shows my solution to the programming challenge 5 chapter 3.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 08 September 2025.
 */
import java.util.Scanner;

public class MassAndWeight
{
    public static void main(String[] args)
    {
        // A named constant.
        final float COEFFICIENT = 9.8f;

        // Declare a variable to hold the mass of the object.
        float mass;

        // Create a Scanner object and connect it to the System.in object
        // to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the object's mass.
        System.out.print("Enter the mass of the object: ");
        mass = keyboard.nextFloat();

        // Calculate the object's weight.
        float weight = mass * COEFFICIENT;

        // Display the object's weight and a message.
        System.out.printf("Object's weight: %.2f\n", weight);
        if (weight > 1000f)
            System.out.println("The object is too heavy.");
        else if (weight < 10f)
            System.out.println("The object is too light.");
    }
}