/**
    Programming challenge 04: Month Class Exceptions.
 */
public class MonthDemo
{
    public static void main(String[] args)
    {
        // Create a Month object.
        Month month = new Month();

        // Try to set a valid month number.
        try
        {
            // Set the month number.
            month.setMonthNumber(9);
            // Display the month name.
            System.out.println("Month: " + month);
        }
        catch (InvalidMonthNumber e)
        {
            System.out.println(e.getMessage());
        }

        // Try to set an invalid month name.
        try
        {
            // Set an invalid month name.
            month.setMonthNumber("Hello");

            // Display the month number.
            System.out.println("Month: " + month.getMonthNumber());
        }
        catch (InvalidMonthName e)
        {
            System.out.println(e.getMessage());
        }
    }
}