/**
 * This program shows my solution to the programming challenge 10 chapter 3.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 08 September 2025.
 */
import java.util.Scanner;

public class TestAverage
{
    public static void main(String[] args) {
        // Variables to hold the three test scores.
        float testScore1, testScore2, testScore3;

        // Create a Scanner object and connect it to the System.in object
        // to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the three test scores from the user.
        System.out.print("Enter test score 1: ");
        testScore1 = keyboard.nextFloat();

        System.out.print("Enter test score 2: ");
        testScore2 = keyboard.nextFloat();

        System.out.print("Enter test score 3: ");
        testScore3 = keyboard.nextFloat();

        // Calculate the average score.
        float totalScore = testScore1 + testScore2 + testScore3;
        float averageScore = totalScore / 3;

        // Display the three test scores and the average score.
        System.out.println("\nTest score 1: " + testScore1);
        System.out.println("Test score 2: " + testScore2);
        System.out.println("Test score 3: " + testScore3);
        System.out.println("Average score: " + averageScore);
    }
}