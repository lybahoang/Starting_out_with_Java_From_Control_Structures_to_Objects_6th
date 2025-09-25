/**
    The TestScores class holds test scores.
 */
public class TestScores
{
    private double[] scoreArray;    // An array of test scores.

    /**
        The constructor initializes the array of test scores
        @param scores The array of test scores
     */
    public TestScores(double[] scores) throws InvalidTestScore
    {
        // Allocate the array for this object.
        this.scoreArray = new double[scores.length];

        // Copies the score into this object.
        for (int count = 0; count < scores.length; count++)
        {
            // Throw an InvalidTestScore exception object if a
            // test score is negative or great than 100.
            if (scores[count] < 0 || scores[count] > 100)
                throw new InvalidTestScore(scores[count], count);

            // Otherwise, copy the test score.
            this.scoreArray[count] = scores[count];
        }
    }

    /**
        The getTotal method returns the total of test scores
        @return The total of the array
     */
    public double getTotal()
    {
        // An accumulator to hold the total.
        double total = 0;

        // An enhanced for loop to calculate the total score.
        for (double score : scoreArray)
        {
            total += score;
        }

        // Return the total of test scores.
        return total;
    }

    /**
        The getAverage method returns the average test score
        @return The average values in the array
     */
    public double getAverage()
    {
        return this.getTotal() / scoreArray.length;
    }
}