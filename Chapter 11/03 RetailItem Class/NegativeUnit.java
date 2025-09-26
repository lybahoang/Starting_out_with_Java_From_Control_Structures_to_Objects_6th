/**
    The NegativeUnit class is an exception class. An object of the class
    is thrown when a negative value is set to the number of units on hand
 */
public class NegativeUnit extends Exception
{
    /**
        The default constructor sets a general error message
     */
    public NegativeUnit()
    {
        super("Error: Negative value for units.");
    }

    /**
        This constructor specifies the bad units on hands in
        the error message
        @param units The bad units on hand
     */
    public NegativeUnit(int units)
    {
        super("Error: Negative value for units: " + units);
    }
}