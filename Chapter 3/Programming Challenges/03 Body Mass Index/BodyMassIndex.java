
import javax.swing.JOptionPane;

/**
 * This program shows my solution to the programming challenge 3 chapter 3.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 07 September 2025.
 */

public class BodyMassIndex
{
    public static void main(String[] args) 
    {
        String inputString;     // To hold the user's input.
        float weight;          // To hold the user's weight in pounds.
        float height;          // To hold the user's height in inches.

        // Get the user's weight.
        inputString = JOptionPane.showInputDialog("What is your weight in pounds? ");
        weight = Float.parseFloat(inputString);

        // Get the user's height.
        inputString = JOptionPane.showInputDialog("How tall you are in inches? ");
        height = Float.parseFloat(inputString);

        // Calculate the body mass index (BMI) of the user.
        float BMI = (float)(weight * 703 / (Math.pow(height, 2.0)));

        // Display the BMI with a corresponding message.
        JOptionPane.showMessageDialog(null, String.format("Your BMI is %.2f", BMI));
        if (BMI < (float)18.5)
            JOptionPane.showMessageDialog(null, "You are underweight.");
        else if (BMI < (float)25.0)
            JOptionPane.showMessageDialog(null, "Your weight is optimal.");
        else
            JOptionPane.showMessageDialog(null, "You are overweight.");

        System.exit(0);
    }
}