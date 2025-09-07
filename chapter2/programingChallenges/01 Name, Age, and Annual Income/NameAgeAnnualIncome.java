/**
 * This program shows my solution to the programming challenge 1 in the book named
 * "Starting out with Java: From Control Structures to Objects (6th)".
 * Date: 06 September 2025.
 */

public class NameAgeAnnualIncome
{
    public static void main(String[] args)
    {
        String name;        // To hold a name.
        int age;            // To hold an age.
        double annualPay;   // To hold annual pay.

        // Store my name as a literal string in the name variable.
        name = "Ly Ba Hoang";   // A String object is created and assigned "Ly Ba Hoang". The address
                                // of the object is stored in 'name'.

        // Store my age as a literal integer in the age variable.
        age = 19;

        // Store my annual pay as a literal double in the annualPay variable.
        annualPay = 25000;

        // Display the information.
        System.out.print("My name is " + name + ", ");
        System.out.println("my age is " + age + " and");
        System.out.print("I hope to earn $" + annualPay + " per year.");
    }
}