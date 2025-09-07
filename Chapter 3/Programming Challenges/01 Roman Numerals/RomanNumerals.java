import javax.swing.JOptionPane;

/**
 * This program shows my solution to the programming challenge 1 chapter 3.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 07 September 2025.
 */

public class RomanNumerals
{
    public static void main(String[] args)
    {
        byte userNumber;    // To hold the user's number.
        String inputString; // To hold the user's input.

        // Get the number from the user.
        inputString = JOptionPane.showInputDialog("Enter an integer from 1 to 10: ");
        userNumber = Byte.parseByte(inputString);

        // Display the Roman numeral version of the number.
        if (userNumber == (byte)1)
            JOptionPane.showMessageDialog(null, "I");
        else if (userNumber == (byte)2)
            JOptionPane.showMessageDialog(null, "II");
        else if (userNumber == (byte)3)
            JOptionPane.showMessageDialog(null, "III");
        else if (userNumber == (byte)4)
            JOptionPane.showMessageDialog(null, "IV");
        else if (userNumber == (byte)5)
            JOptionPane.showMessageDialog(null, "V");
        else if (userNumber == (byte)6)
            JOptionPane.showMessageDialog(null, "VI");
        else if (userNumber == (byte)7)
            JOptionPane.showMessageDialog(null, "VII");
        else if (userNumber == (byte)8)
            JOptionPane.showMessageDialog(null, "VIII");
        else if (userNumber == (byte)9)
            JOptionPane.showMessageDialog(null, "IX");
        else if (userNumber == (byte)10)
            JOptionPane.showMessageDialog(null, "X");
        else
            JOptionPane.showMessageDialog(null, "Invalid value.");
    }
}