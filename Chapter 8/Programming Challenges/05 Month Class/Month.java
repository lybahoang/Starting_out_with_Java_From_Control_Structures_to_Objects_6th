/**
    The Month class holds an integer representing a month.
 */
public class Month
{
    private int monthNumber;    // The month number.

    /**
        The default constructor sets the month number to 1.
     */
    public Month()
    {
        this.monthNumber = 1;
    }

    /**
        This constructor sets a specific month number.
        @param monthNum The month number, as an int.
     */
    public Month(int monthNum)
    {
        // If monthNum is less than 1, or greater than 12, then
        // set the monthNumber field to 1.
        if (monthNum < 1 || monthNum > 12)
        {
            this.monthNumber = 1;
        }
        // Otherwise, set the monthNumber field to the argument.
        else
        {
            this.monthNumber = monthNum;
        }
    }

    /**
        This constructor sets a specific month number.
        @param monthStr The month number, as a String
     */
    public Month(String monthStr)
    {
        if (monthStr.equalsIgnoreCase("January"))
            this.monthNumber = 1;
        else if (monthStr.equalsIgnoreCase("February"))
            this.monthNumber = 2;
        else if (monthStr.equalsIgnoreCase("March"))
            this.monthNumber = 3;
        else if (monthStr.equalsIgnoreCase("April"))
            this.monthNumber = 4;
        else if (monthStr.equalsIgnoreCase("May"))
            this.monthNumber = 5;
        else if (monthStr.equalsIgnoreCase("June"))
            this.monthNumber = 6;
        else if (monthStr.equalsIgnoreCase("July"))
            this.monthNumber = 7;
        else if (monthStr.equalsIgnoreCase("August"))
            this.monthNumber = 8;
        else if (monthStr.equalsIgnoreCase("September"))
            this.monthNumber = 9;
        else if (monthStr.equalsIgnoreCase("October"))
            this.monthNumber = 10;
        else if (monthStr.equalsIgnoreCase("November"))
            this.monthNumber = 11;
        else if (monthStr.equalsIgnoreCase("December"))
            this.monthNumber = 12;
    }

    /**
        The setMonthNumber method sets the month number
        @param monthNum The month number, as an int
     */
    public void setMonthNumber(int monthNum)
    {
        // If monthNum is less than 1 or greater than 12, then
        // set monthNumber field to 1.
        if (monthNum < 1 || monthNum > 12)
        {
            this.monthNumber = 1;
        }
        // Otherwise, set the argument to the monthNumber field
        else
        {
            this.monthNumber = monthNum;
        }
    }

    /**
        The setMonthNumber method sets the month number
        @param monthStr The month number, as a String
     */
    public void setMonthNumber(String monthStr)
    {
        if (monthStr.equalsIgnoreCase("January"))
            this.monthNumber = 1;
        else if (monthStr.equalsIgnoreCase("February"))
            this.monthNumber = 2;
        else if (monthStr.equalsIgnoreCase("March"))
            this.monthNumber = 3;
        else if (monthStr.equalsIgnoreCase("April"))
            this.monthNumber = 4;
        else if (monthStr.equalsIgnoreCase("May"))
            this.monthNumber = 5;
        else if (monthStr.equalsIgnoreCase("June"))
            this.monthNumber = 6;
        else if (monthStr.equalsIgnoreCase("July"))
            this.monthNumber = 7;
        else if (monthStr.equalsIgnoreCase("August"))
            this.monthNumber = 8;
        else if (monthStr.equalsIgnoreCase("September"))
            this.monthNumber = 9;
        else if (monthStr.equalsIgnoreCase("October"))
            this.monthNumber = 10;
        else if (monthStr.equalsIgnoreCase("November"))
            this.monthNumber = 11;
        else if (monthStr.equalsIgnoreCase("December"))
            this.monthNumber = 12;
    }

    /**
        The getMonthNumber method returns the month number
        @return The value stored in the monthNumber field
     */
    public int getMonthNumber()
    {
        return this.monthNumber;
    }

    /**
        The getMonthName method returns the month name
        @return The month name
     */
    public String getMonthName()
    {
        // Create an array of month names.
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November",
            "December"
        };

        // Return the month name.
        return monthNames[monthNumber - 1];
    }

    /**
        The toString method returns the month name
        @return The month name
     */
    public String toString()
    {
        return this.getMonthName();
    }

    /**
        The equals method returns true if the month number in the
        parameter is equal to the month number in the object
        @param otherMonth The other month
        @return True if the two month numbers are the same
                False if the two month numbers are not the same
     */
    public boolean equals(Month otherMonth)
    {
        if (this.monthNumber == otherMonth.monthNumber)
        {
            return true;
        }
        return false;
    }

    /**
        The greaterThan method returns true if the month number in the
        object is greater than the month number of the parameter object
        @param otherMonth The other month
        @return True if the calling object's monthNumber field is greater
                than the argument's monthNumber field
                False otherwise
     */
    public boolean greaterThan(Month otherMonth)
    {
        if (this.monthNumber > otherMonth.monthNumber)
        {
            return true;
        }
        return false;
    }
    
    /**
        The lessThan method returns true if the month number in the
        object is less than the month number in the parameter object
        @param otherMonth The other month
        @return True if the calling object's monthNumber fiedl is less
                than the argument's monthNumber field
                False otherwise
     */
    public boolean lessThan(Month otherMonth)
    {
        if (this.monthNumber < otherMonth.monthNumber)
        {
            return true;
        }
        return false;
    }
}