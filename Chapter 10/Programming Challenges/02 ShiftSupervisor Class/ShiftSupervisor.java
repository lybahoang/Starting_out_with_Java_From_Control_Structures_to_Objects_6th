/**
    The ShiftSupervisor class extends the Employee class and has its
    ow specialized data including annual salary and annual bonus.
 */
public class ShiftSupervisor extends Employee
{
    private double annualSalary;    // The supervisor's annual salary.
    private double annualBonus;     // The supervisor's annual bonus.

    /**
        The default constructor calls the Employee class's default 
        constructor and sets default values for annualSalay and
        annualBonus fields
     */
    public ShiftSupervisor()
    {
        // Call the default constructor of the employee class.
        super();

        // Set annualSalary and annualBonus to default values.
        annualSalary = 0.0;
        annualBonus = 0.0;
    }

    /**
        The constructor sets values in fields on the supervisor
        @param name The supervisor's name
        @param number The supervisor's number
        @param date The supervisor's hire date
        @param salary The supervisor's annual salary
        @param bonus The supervisor's annual bonus
     */
    public ShiftSupervisor(String name, String number, String date, double salary,
    double bonus)
    {
        // Call the superclss's constructor.
        super(name, number, date);

        // Set values to annualSalary and annualBonus fields.
        annualSalary = salary;
        annualBonus = bonus;
    }

    /**
        The getAnnualSalary method returns the annual salary of
        the supervissor
        @return The value stored in the annualSalary field
     */
    public double getAnnualSalary()
    {
        return annualSalary;
    }

    /**
        The getAnnualBonus method returns the annual bonus of
        the supervisor
        @return The value stored in the annualBonus field
     */
    public double getAnnualBonus()
    {
        return annualBonus;
    }

    /**
        The setAnnualSalary method sets the supervisor's annual salary
        @param salary The supervisor's annual salary, as a double
     */
    public void setAnnualSalary(double salary)
    {
        this.annualSalary = salary;
    }

    /**
        The setAnnualSalary method sets the supervisor's annual salary
        @param salary The supervisor's annual salary, as a String
     */
    public void setAnnualSalary(String salary)
    {
        this.annualSalary = Double.parseDouble(salary);
    }

    /**
        The setAnnualBonus method sets the supervisor's annual bonus
        @param bonus The supervisor's annual bonus, as a double
     */
    public void setAnnualBonus(double bonus)
    {
        this.annualBonus = bonus;
    }

    /**
        The setAnnualBonus method sets the supervisor's annual bonus
        @param bonus The supervisor's annual bonus, as a String
     */
    public void setAnnualBonus(String bonus)
    {
        this.annualBonus = Double.parseDouble(bonus);
    }

    /**
        The toString method returns a String object that holds the
        information of the supervisor
        @return A string containting all of the supervisor's information
     */
    @Override
    public String toString()
    {
        // Create a String object to hold the output.
        String outputString = "";

        // Create a String containing the information of the supervisor.
        outputString += super.toString();
        outputString += "\nAnnual salary: $" + annualSalary+
                        "\nAnnual bonus: $" + annualBonus;

        // Return the output string.
        return outputString;
    }
}