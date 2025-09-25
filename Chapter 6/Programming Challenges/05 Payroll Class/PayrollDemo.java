import javax.swing.JOptionPane;
/**
    Programming challenge 05: Payroll Class.
 */
public class PayrollDemo
{
    public static void main(String[] args)
    {
        // Get the employee's name.
        String name = JOptionPane.showInputDialog(
            "Enter the employee's name: ");
        
        // Get the employee's id number.
        String idNumber = JOptionPane.showInputDialog(
            "Enter the employee's ID number: "
        );

        // Get the employee's hourly pay rate.
        String input = JOptionPane.showInputDialog(
            "Enter the hourly pay rate: $"
        );  
        double hourlyPayRate = Double.parseDouble(input);

        // Get the employee's worked hours.
        input = JOptionPane.showInputDialog(
            "Enter the hours worked: "
        );
        double hoursWorked = Double.parseDouble(input);

        // Create a Payroll object.
        Payroll payroll = new Payroll(name, idNumber);
        payroll.setHourlyPayRate(hourlyPayRate);
        payroll.setHoursWorked(hoursWorked);

        // Display information and the gross pay.
        JOptionPane.showMessageDialog(null, 
            "Name: " + payroll.getName() +
            "\nID number: " + payroll.getIdNumber() +
            "\nHourly pay rate: $" + payroll.getHourlyPayRate() +
            "\nWorked hours: " + payroll.getHoursWorked() + 
            "\nGross pay: $" + payroll.getGrossPay());

        System.exit(0);
    }
}