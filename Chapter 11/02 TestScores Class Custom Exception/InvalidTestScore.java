/**
    The InvalidTestScore class is a custom exception. Its object
    is thrown when a test score is negative or greater than 100.
 */
public class InvalidTestScore extends Exception
{
    /**
        The default constructor passes a general error message
        to the superclass's exception.
     */
    public InvalidTestScore()
    {
        super("Error: Invalid test score in the array.");
    }

    /**
        This constructor specifies the invalid test score in 
        the array
        @param score The invalid test score
        @param position The position of the invalid score in
               the array
     */
    public InvalidTestScore(double score, int position)
    {
        super("Error: Invalid test score (" + score + ")" +
              " at " + (position + 1));
    }
}