/**
 * The program shows my solution to the programming challenge 2 in the book named
 * "Starting out with Java: From Control structures to Objects" (6th).
 * Date: 07 September 2025
 */

public class NameInitials
{
    public static void main(String[] args)
    {
        String firstName;   // The first name.
        String middleName;  // The middle name.
        String lastName;    // The last name.

        // Assign the three String variables with my information.
        firstName = "Hoang";
        middleName = "Ba";
        lastName = "Ly";

        // Take the initials of the first, middle, and last names.
        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);

        // Display the results.
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
        System.out.println("First initial: " + firstInitial);
        System.out.println("Middle initial: " + middleInitial);
        System.out.println("Last initial: " + lastInitial);
    }
}