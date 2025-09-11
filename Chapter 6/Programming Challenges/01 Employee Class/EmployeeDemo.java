public class EmployeeDemo
{
    public static void main(String[] args)
    {
        // Create three Employee objects with sample data.
        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");

        Employee employee2 = new Employee("Mark Jones", 39119);
        employee2.setDepartment("IT");
        employee2.setPosition("Programmer");

        Employee employee3 = new Employee();
        employee3.setName("Joy Rogers");
        employee3.setIdNumber(81774);
        employee3.setDepartment("Manufacturing");
        employee3.setPosition("Engineer");

        // Display the information of employee1.
        System.out.println("Employee #1: ");
        System.out.println("  Name: " + employee1.getName());
        System.out.println("  ID Number: " + employee1.getIdNumber());
        System.out.println("  Department: " + employee1.getDepartment());
        System.out.println("  Position: " + employee1.getPosition());

        // Display the information of employee2.
        System.out.println("\nEmployee #2: ");
        System.out.println("  Name: " + employee2.getName());
        System.out.println("  ID Number: " + employee2.getIdNumber());
        System.out.println("  Department: " + employee2.getDepartment());
        System.out.println("  Position: " + employee2.getPosition());

        // Dislay the information of employee3.
        System.out.println("\nEmployee #3: ");
        System.out.println("  Name: " + employee3.getName());
        System.out.println("  ID Number: " + employee3.getIdNumber());
        System.out.println("  Department: " + employee3.getDepartment());
        System.out.println("  Position: " + employee3.getPosition());
    }
}