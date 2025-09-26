/**
    This class acts as an exception class. Its object is thrown when
    a month name is invalid.
 */
public class InvalidMonthName extends Exception
{
    /**
        The default constructor creates a general error message
     */
    public InvalidMonthName()
    {
        super("Error: Invalid month name.");
    }

    /**
        This constructor specifies an invalid month name in
        the error message
        @param invalidName The invalid month name
     */
    public InvalidMonthName(String invalidName)
    {
        super("Error: Invalid month name: " + invalidName);
    }
}