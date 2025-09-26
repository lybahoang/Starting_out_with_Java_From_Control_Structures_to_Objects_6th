/**
    This class acts as an exception class. Its object is thrown when
    a month number is less than 1 or greater than 12.
 */
public class InvalidMonthNumber extends Exception
{
    /**
        The default constructor creates a general error message
     */
    public InvalidMonthNumber()
    {
        super("Error: Invalid month number.");
    }

    /**
        This constructor specifies an invalid month number in
        the error message
        @param invalidMonth The invalid month number
     */
    public InvalidMonthNumber(int invalidMonth)
    {
        super("Error: Invalid month number: " + invalidMonth);
    }
}