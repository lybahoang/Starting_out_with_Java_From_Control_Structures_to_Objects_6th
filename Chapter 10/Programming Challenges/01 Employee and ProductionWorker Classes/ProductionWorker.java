/**
    The ProductionWorker extends the Employee class and has its
    own specialized data about the shift and hourly pay rate of
    the employees.
 */
public class ProductionWorker extends Employee
{
    private int shift;              // The employee's shift.
    private double hourlyPayRate;   // The employee's hourly pay rate.

    /**
        The default constructor sets default values for shift and
        hourlyPayRate and calls the defaul constructor of the
        Employee class
     */
    public ProductionWorker()
    {
        // Call the default constructor of the superclass.
        super();

        // Initialize fields of the object to default values.
        shift = -1;
        hourlyPayRate = 0.0;
    }

    /**
        The constructor sets values for each field and calls the constructor
        of the Employee class
        @param name The employee's name
        @param number The employee's number
        @param date The employee's hire date
        @param shift The employee's shift
        @param payRate The employee's hourly pay rate
     */
    public ProductionWorker(String name, String number, String date, int shift, double payRate)
    {
        // Call the constructor of the Employee class.
        super(name, number, date);

        // Set values in the shift and hourlyPayRate fields.
        this.shift = shift;
        this.hourlyPayRate = payRate;
    }

    /**
        The getShift method returns the employee's shift
        @return The value stored in the shift field
     */
    public int getShift()
    {
        return shift;
    }

    /**
        The getHourlyPayRate method returns the employee's hourly
        pay rate
        @return The value stored in the hourlyPayRate field
     */
    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }

    /**
        The setShift method sets a value to the employee's shfit
        @param newShift The employee's shift, as an int
     */
    public void setShift(int newShift)
    {
        this.shift = newShift;
    }

    /**
        The setShift method sets a value to the employee's shift
        @param newShift The employee's shift, as a String
     */
    public void setShift(String newShift)
    {
        this.shift = Integer.parseInt(newShift);
    }

    /**
        The setHourlyPayRate method sets a value to the employee's
        hourly pay rate
        @param newRate The employee's hourly pay rate, as a double
     */
    public void setHourlyPayRate(double newRate)
    {
        this.hourlyPayRate = newRate;
    }

    /**
        The setHourlyPayRate method sets a value to the employee's
        hourly pay rate
        @param newRate The employee's hourly pay rate, as a String
     */
    public void setHourlyPayRate(String newRate)
    {
        this.hourlyPayRate = Double.parseDouble(newRate);
    }

    /**
        The toString method returns a string containing information
        of an employee
        @return A string that holds all information of the employee
     */
    @Override
    public String toString()
    {
        // Create a String object to hold the output string.
        String outputString = "";

        // Create a String containing information of the employee.
        outputString += super.toString();
        outputString += "\nShift: " + (this.shift == 1 ? "Day" : "Night") +
                        "\nHourly pay rate: " + hourlyPayRate;

        // Return the string.
        return outputString;
    }
}

