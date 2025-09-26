/**
    The NegativePrice class is an exception class. An object of the class
    is thrown when the price of a retail item is set to a negative value.
 */
public class NegativePrice extends Exception
{
    /**
        The default constructor sets a default error message
     */
    public NegativePrice()
    {
        super("Error: Negative value for price.");
    }

    /**
        The constructor sets an error message with the invalid
        value for the price
        @param price The invalid value for price
     */
    public NegativePrice(double price)
    {
        super("Error: Negative value for price: " + price);
    }
}