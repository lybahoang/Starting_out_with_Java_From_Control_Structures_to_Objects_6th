/**
    The Payroll class holds data about hours, payrates, id, and gross pay
    of employees
 */
public class Payroll
{
    final int EMPLOYEES = 7;       // The number of employees.
    private int[] employeeId;       // An array of employee's identification number.
    private int[] hours;            // An array of number of hours worked.
    private double[] payRates;      // An array of employee's hourly pay rates.
    private double[] wages;         // An array of employee's gross pay wages.

    /**
        The constructor initializes the employee's identification array
     */
    public Payroll()
    {
        // Create an array of 7 integers.
        employeeId = new int[EMPLOYEES];

        // Assign values to elements in the array.
        employeeId[0] = 5658845;
        employeeId[1] = 4520125;
        employeeId[2] = 7895122;
        employeeId[3] = 8777541;
        employeeId[4] = 8451277;
        employeeId[5] = 1302850;
        employeeId[6] = 7580489;

        // Create arrays for hours, payRates, and wages.
        hours = new int[EMPLOYEES];
        payRates = new double[EMPLOYEES];
        wages = new double[EMPLOYEES];
    }

    /**
        The getGrossPay method returns the gross pay wages of an employee
        @param id The employee's id
        @return One value in the wages array
     */
    public double getGrossPay(int id)
    {
        // Search for the position of employee in the array.
        int position = -1;

        for (int index = 0; index < EMPLOYEES; index++)
        {
            if (employeeId[index] == id)
            {
                position = index;
            }
        }

        // If the employee is not in the array, then display a message and
        // return -1.0,
        if (position == -1)
        {
            System.out.println("No employee with that ID number");
            return -1.0;
        }
        // Otherwise, return the wages.
        else
            return wages[position];
    }

    /**
        The getGrossPay method accepts an index and returns the gross pay
        corresponding to that index
        @param index The index in the array
        @return The value in the wages array located at index
     */
    public double getGrossPay(byte index)
    {
        return wages[index];
    }

    /**
        The getPayRate method accepts the employee's id and returns his/her
        hourly pay rate
        @param id The employee's id
        @return The employee's pay rate
     */
    public double getPayRate(int id)
    {
        // Search for the position of employee in the array.
        int position = -1;

        for (int index = 0; index < EMPLOYEES; index++)
        {
            if (employeeId[index] == id)
            {
                position = index;
            }
        }

        // If the employee is not in the array, then display a message and
        // return -1.0,
        if (position == -1)
        {
            System.out.println("No employee with that ID number");
            return -1.0;
        }
        // Otherwise, return the wages.
        else
            return payRates[position];
    }

    /**
        The getPayRate method accepts an index and returns the pay rate
        corresponding to the that index
        @param index The index in the array
        @return The pay rate located at the index
     */
    public double getPayRate(byte index)
    {
        return payRates[index];
    }

    /**
        The getHours method accepts an employee's id and returns the number
        of hours that employee has worked
        @param id The employee's id
        @return The number of worked hours of the employee
     */
    public int getHours(int id)
    {
        // Search for the position of employee in the array.
        int position = -1;

        for (int index = 0; index < EMPLOYEES; index++)
        {
            if (employeeId[index] == id)
            {
                position = index;
            }
        }

        // If the employee is not in the array, then display a message and
        // return -1.0,
        if (position == -1)
        {
            System.out.println("No employee with that ID number");
            return -1;
        }
        // Otherwise, return the wages.
        else
            return hours[position];
    }

    /**
        The getHours method accepts an index and returns the value corresponding
        to that index in the hours array
        @param index The index of the array
        @return The element located at index in hours array
     */
    public int getHours(byte index)
    {
        return hours[index];
    }

    /**
        The getId method accepts an index and returns the employee's id located at
        that index
        @param index The index of the array
        @return The element located at index in the employeeId array
     */
    public int getId(byte index)
    {
        return employeeId[index];
    }

    /**
        The setHours method stores a value in the hours array
        @param index The index in the array
        @param hr The value to store
     */
    public void setHours(byte index, int hr)
    {
        hours[index] = hr;
        setWages(index);
    }

    /**
        The setPayRate method stores a value in the payRates array
        @param index The index in the array
        @param rate The pay rate to store in the array
     */
    public void setPayRate(byte index, double rate)
    {
        payRates[index] = rate;
        setWages(index);
    }

    /**
        The setWages method calculates and stores the gross monthly
        pay for each employee
        @param index The index of the employee
     */
    private void setWages(byte index)
    {
        wages[index] = hours[index] * payRates[index];
    }
}