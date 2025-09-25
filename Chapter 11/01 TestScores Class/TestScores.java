/**
    The TestScores class holds test scores.
 */
public class TestScores
{
    private double[] scoreArray;    // An array of test scores.

    /**
        The default constructor sets an array of test scores
        @param scores An array of test scores
        @exception IllegalArgumentException When a score in
                   the array is negative or greater than 100
     */
    public TestScores(double[] scores)
    {
        // Allocate array for this object.
        this.scoreArray = new double[scores.length];

        // Copy the test scores in the parameter array into
        // this object.
        for (int count = 0; count < scores.length; count++)
        {
            // Throw an IllegalArgumentException if a score
            // is negative or greater than 100.
            if (scores[count] < 0 )
                throw new IllegalArgumentException("Error: " +
                    "Negative test score.");
            else if (scores[count] > 100)
                throw new IllegalArgumentException("Error: " +
                "Out-of-limit score.");

            // Otherwise, copy the score.
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