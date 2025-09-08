import java.util.Scanner;

/**
 * This program shows my solution to the programming challenge 4 chapter 3.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 08 September 2025.
 */

public class TestScoresGrade
{
    public static void main(String[] args)
    {
        // Variables for the three test scores.
        float testScore1, testScore2, testScore3;

        // Variable for the average score.
        float averageScore;

        // Create a Scanner object and connect it with the System.in object
        // to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the three test scores from the user.
        System.out.print("Enter the test score 1: ");
        testScore1 = keyboard.nextFloat();

        System.out.print("Enter the test score 2: ");
        testScore2 = keyboard.nextFloat();

        System.out.print("Enter the test score 3: ");
        testScore3 = keyboard.nextFloat();

        // Calculate the average test score.
        float totalScore = testScore1 + testScore2 + testScore3;
        averageScore = totalScore / 3;

        // Display the average score and its corresponding grade.
        System.out.printf("Average score: %.2f\n", averageScore);
        System.out.print("Grade: ");
        if (averageScore < 60)
            System.out.println("F");
        else if (averageScore < 70)
            System.out.println("D");
        else if (averageScore < 80)
            System.out.println("C");
        else if (averageScore < 90)
            System.out.println("B");
        else if (averageScore <= 100)
            System.out.println("A");
        else
            System.out.println("Invalid average score.");
    }
}
