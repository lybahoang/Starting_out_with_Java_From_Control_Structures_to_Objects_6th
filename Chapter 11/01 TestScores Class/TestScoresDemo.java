/**
    Programming challenge 1: TestScores Class.
 */
public class TestScoresDemo
{
    public static void main(String[] args) {
        // Create an array to hold some test scores.
        double[] scoreArray = { 100, 95, 93, 983, 99 };

        // Create a TestScores object and pass the array to
        // its constructor.
        try
        {
            TestScores testScores1 = new TestScores(scoreArray);

            // Display the average of test scores.
            System.out.println("Average score: " + testScores1.getAverage());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}