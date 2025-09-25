/**
    The Employee class holds information about an employee including
    name, number, and hire date.
 */

public class Employee
{
    private String name;        // The employee's name.
    private String number;      // The employee's number.
    private String hireDate;    // The employee's hire date.

    /**
        The default constructor assigns empty strings for each field
     */
    public Employee()
    {
        name = "";
        number = "";
        hireDate = "";
    }

    /**
        The constructor sets values in each field
        @param name The employee's name
        @param number The employee's number
        @param data The employee's hire date
     */
    public Employee(String name, String number, String date)
    {
        this.name = name;
        this.number = number;
        this.hireDate = date;
    }

    /**
        The getName method returns the employee's name
        @return The value stored in the name field
     */
    public String getName()
    {
        return name;
    }

    /**
        The getNumber method returns the employee's number
        @return The value stored in the number field
     */
    public String getNumber()
    {
        return number;
    }

    /**
        The getHireDate method returns the employee's hire date
        @return The value stored in the hireDate field
     */
    public String getHireDate()
    {
        return hireDate;
    }

    /**
        The setName method sets a value for the employee's name
        @param employeeName The employee's name
     */
    public void setName(String employeeName)
    {
        this.name = employeeName;
    }

    /**
        The setNumber method sets a value for the employee's number
        @param employeeNumber The employee's number
     */
    public void setNumber(String employeeNumber)
    {
        this.number = employeeNumber;
    }

    /**
        The setHireDate method sets a value for the employee's hire
        date
        @param date The employee's hire date
     */
    public void setHireDate(String date)
    {
        this.hireDate = date;
    }

    /**
        The toString method returns a string includes all information
        of the employee
        @return A string containing the employee's information
     */
    @Override
    public String toString()
    {
        // Create a String object to hold the output string.
        String outputString = "";

        // Create a String to return the state of the object.
        outputString += "Name: " + name +
                        "\nNumber: " + number +
                        "\nHire date: " + hireDate;
        
        // Return the String object.
        return outputString;
    }
}