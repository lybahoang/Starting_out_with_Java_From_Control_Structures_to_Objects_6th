/**
    The Payroll class holds employee's name, id, hourly pay rate,
    and the number of hours worked.
 */
public class Payroll
{
    private String name;            // The employee's name.
    private String idNumber;        // The employee's id.
    private double hourlyPayRate;   // The employee's hourly pay rate.
    private double hoursWorked;     // The employee's number of hours worked.

    /**
        The default constructor sets default values to the employee
     */
    public Payroll()
    {
        name = "";
        idNumber = "";
        hourlyPayRate = 0.0;
        hoursWorked = 0.0;
    }

    /**
        The constructor sets values to the name and idNumber field
        @param name The employee's name
        @param id The employee's id number
     */
    public Payroll(String name, String id)
    {
        this.name = name;
        this.idNumber = id;
        hourlyPayRate = 0.0;
        hoursWorked = 0.0;
    }
    
    /**
        The constructor sets values to all the fields
        @param name The employee's name
        @param id The employee's id number
        @param payRate The employee's hourly pay rate
        @param hours The employee's worked hours
     */
    public Payroll(String name, String id, double payRate, double hours)
    {
        this.name = name;
        this.idNumber = id;
        this.hourlyPayRate = payRate;
        this.hoursWorked = hours;
    }

    /**
        The getName method returns the employee's name
        @return The value stored in the name field
     */
    public String getName()
    {
        return this.name;
    }

    /**
        The getIdNumber method returns the employee's id number
        @return The value stored in the idNumber field
     */
    public String getIdNumber()
    {
        return this.idNumber;
    }

    /**
        The getHourlyPayRate method return the employee's hourly
        pay rate
        @return The value stored in the hourlyPayRate field
     */
    public double getHourlyPayRate()
    {
        return this.hourlyPayRate;
    }

    /**
        The getHoursWorked method returns the number of hours that
        the employee has worked
        @return The value stored in the hoursWorked field
     */
    public double getHoursWorked()
    {
        return this.hoursWorked;
    }

    /**
        The setName method sets the employee's name
        @param name The employee's name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
        The setIdNumber method sets the employee's id number
        @param id The employee's id number
     */
    public void setIdNumber(String id)
    {
        this.idNumber = id;
    }

    /**
        The setHourlyPayRate method sets the employee's hourly
        pay rate
        @param payRate The employee's hourly pay rate
     */
    public void setHourlyPayRate(double payRate)
    {
        this.hourlyPayRate = payRate;
    }

    /**
        The setHourlyPayRate method sets the employee's hourly
        pay rate
        @param payRate The employee's hourly pay rate, as a String
     */
    public void setHourlyPayRate(String payRate)
    {
        this.hourlyPayRate = Double.parseDouble(payRate);
    }

    /**
        The setHoursWorked method sets the number of hours that
        the employee has worked
        @param hours The number of hours worked
     */
    public void setHoursWorked(double hours)
    {
        this.hoursWorked = hours;
    }

    /**
        The setHoursWorked method sets the number of hours that
        the employee has worked
        @param hours The number of hours worked, as a String
     */
    public void setHoursWorked(String hours)
    {
        this.hoursWorked = Double.parseDouble(hours);
    }

    /**
        The getGrossPay method returns return the gross pay
        of the employee
        @return The product of hourlyPayRate and hoursWorked
     */
    public double getGrossPay()
    {
        return hourlyPayRate * hoursWorked;
    }
}