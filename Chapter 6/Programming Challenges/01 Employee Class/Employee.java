/**
    The Employee class represents an employee. It stores the name, id number,
    deparment, and job position, and provide methods to access and modify
    the data of the employee.
 */
public class Employee
{
    private String name;        // The name of the employee.
    private int idNumber;       // The id number of the employee.
    private String department;  // The department of the employee.
    private String position;    // The job position of the employee.

    /**
        The default constructor assigns empty string to name, department,
        and position and 0 to position
     */
    public Employee()
    {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    /**
        Constructor.
        @param empName The employee's name.
        @param id The employee's id.
        @param dep The employee's department.
        @param pos The employee's position.
     */
    public Employee(String empName, int id, String dep, String pos)
    {
        name = empName;
        idNumber = id;
        department = dep;
        position = pos;
    }

    /**
        Constructor
        @param empName The employee's name.
        @param id The employee's id.
     */
    public Employee(String empName, int id)
    {
        name = empName;
        idNumber = id;
        department = "";
        position = "";
    }

    /**
        The setName function stores a reference to a string in the name
        field
        @param newName The employee's name
     */
    public void setName(String newName)
    {
        name = newName;
    }

    /**
        The setIdNumber function stores a value in the idNumber field
        @param id The employee's id.
     */
    public void setIdNumber(int id)
    {
        idNumber = id;
    }

    /**
        The setDepartment function stores a reference to a string in the
        department field
        @param dep The employee's department.
     */
    public void setDepartment(String dep)
    {
        department = dep;
    }

    /**
        The setPosition function stores a reference to a string in the
        position field
        @param pos The employee's position.
     */
    public void setPosition(String pos)
    {
        position = pos;
    }

    /**
        The getName function returns the employee's name.
        @return The value in the name field.
     */
    public String getName()
    {
        return name;
    }

    /**
        The getIdNumber function returns an Employee object's id number
        @return The value in the idNumber field.
     */
    public int getIdNumber()
    {
        return idNumber;
    }

    /**
        The getDepartment function returns the department of an employee
        @return The value in the deparment field.
     */
    public String getDepartment()
    {
        return department;
    }

    /**
        The getPositoin function returns the position of an employee
        @return The value in the position field.
     */
    public String getPosition()
    {
        return position;
    }
}