/**
    This shows my solution to the programming challenge 8 in chapter 2.
    Book: Starting out with Java: From Control structures to Objects (6th).
    Date: 07 September 2025.
 */
import java.util.Scanner;   // Needed for the Scanner class.

public class CookieCalories
{
    public static void main(String[] args) {
        // Constants for number of cookies, servings, and calories in
        // one serving.
        final int NUM_OF_COOKIES = 40;
        final int NUM_OF_SERVINGS = 10;
        final double CALORIES_PER_SERVING = 300.0;

        // Calculate the number of cookies in a serving.
        int numCookiesPerServing = NUM_OF_COOKIES / NUM_OF_SERVINGS;

        // Calculate the number of calories per cookie.
        double caloriesPerCookie = CALORIES_PER_SERVING / numCookiesPerServing;

        // Create a Scanner object and connect it with the System.in object
        // to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the number of cookies eaten by the user.
        System.out.print("How many cookies did you eat? ");
        int numEatenCookies = keyboard.nextInt();

        // Calculate the total calories consumed.
        double totalCaloriesConsumed = numEatenCookies * caloriesPerCookie;

        // Display the total calories consumed.
        System.out.println("You have eaten " + numEatenCookies + " with " +
                         caloriesPerCookie + " calories each. ");
        System.out.println("Thus, you have consumed " + totalCaloriesConsumed +
                           " calories.");
    }
}