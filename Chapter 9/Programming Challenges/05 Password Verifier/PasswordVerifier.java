public class PasswordVerifier
{
    /**
        The verifyLength method returns true if the password is at least
        six characters long.
        @param password The password to be verified.
        @reutrn true if the length of the password is at least size
                false otherwise.
     */
    public static boolean verifyLength(String password)
    {
        return (password.length() >= 6);
    }

    /**
        The verifyLetter method returns true if the password contains at
        least one uppercase letter and at least one lowercase letter.
        @param password The password to be verified
        @return true if the password contains at least one uppercase and
                     at least one lowercase
                false otherwise
     */
    public static boolean verifyLetter(String password)
    {
        // Two flags to represent conditions.
        boolean hasUppercase = false;
        boolean hasLowercase = false;

        // A loop to scan the string.
        for (int index = 0; index < password.length(); index++)
        {
            // Check if the character is an uppercase letter.
            if (Character.isUpperCase(password.charAt(index)))
            {
                hasUppercase = true;
            }
            // Check if the character is a lowercase letter.
            else if (Character.isLowerCase(password.charAt(index)))
            {
                hasLowercase = true;
            }
        }

        // Return the verifying result.
        return hasLowercase && hasUppercase;
    }

    /**
        The verifyDigit method returns true if the pass word contains at
        least one digit
        @param password The password to be verified
        @return true if the password has at least one digit
                false otherwise
     */
    public static boolean verifyDigit(String password)
    {
        // A loop to scan the string to search for a digit.
        for (int index = 0; index < password.length(); index++)
        {
            if (Character.isDigit(password.charAt(index)))
            {
                return true;
            }
        }

        // Otherwise, return false.
        return false;
    }

    /**
        The verifyPassword method returns true if the password meets the three
        verification methods
        @param password The password to be verified
        @return true if the three verifications are passed
                false otherwise
     */
    public static boolean verifyPassword(String password)
    {
        return verifyLength(password) && verifyLetter(password) &&
               verifyDigit(password);
    }
}