import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
    The PropertyTaxCalculatorGUI class creates a graphical user interface
    that calculates the assessment value of a property and the property tax.
 */

public class PropertyTaxCalculator extends JFrame
{
    // The following constants are used to represent the percentage
    // of the assessment value of propety and the property tax rate.
    private final double ASSESSMENT_PERCENTAGE = 0.60;
    private final double TAX_RATE = 0.64 / 100.0;

    // Components of the GUI.
    private JLabel label;               // To reference a label.
    private JTextField propertyValue;   // To get the value of property.
    private JButton calculateButton;    // To reference a button.
    private JPanel inputGettingPanel;   // The panel holding the label and text field.
    private JPanel buttonPanel;         // The panel holding the button.

    /**
        The constructor sets a components, put them into panels, and then
        add panels to the content pane.
     */
    public PropertyTaxCalculator()
    {
        // Set the title of the window.
        setTitle("Property Tax Calculator");

        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout of the frame to a GridLayout with 2 rows and 1 coloumn.
        setLayout(new GridLayout(2, 1));

        // Create the label and the text field and add it to a panel.
        label = new JLabel("Enter the actual value of a property ($): ");
        propertyValue = new JTextField(10);
        inputGettingPanel = new JPanel();
        inputGettingPanel.add(label);
        inputGettingPanel.add(propertyValue);

        // Create the button, register an action listener to it, and add
        // it to a panel.
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new CalculateButtonListener());
        buttonPanel = new JPanel();
        buttonPanel.add(calculateButton);

        // Add the two panels to the content pane.
        add(inputGettingPanel);
        add(buttonPanel);

        // Pack the contents of the window and display it.
        pack();
        setVisible(true);
    }

    /**
        Private inner class that handles the event when the user clicks
        the Calculate button.
     */
    private class CalculateButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            try
            {
                // Get the actual value of a property, which is typed in
                // the text field. The text is converted into a double,
                // and a NumberFormatException may be thrown.
                double actualValue = Double.parseDouble(propertyValue.getText());

                // Calculate the assessment value of the property.
                double assessmentValue = actualValue * ASSESSMENT_PERCENTAGE;

                // Calculate the property tax.
                double propertyTax = assessmentValue * TAX_RATE;

                // Display the result.
                JOptionPane.showMessageDialog(null,
                String.format("Actual value: $%,.2f\n" +
                              "Assessment value: $%,.2f\n" +
                              "Property tax: $%,.2f\n",
                              actualValue, assessmentValue, propertyTax)
                );
            }
            catch (NumberFormatException exception)
            {
                JOptionPane.showMessageDialog(null, 
                "Error: Invalid value of a property");
            }
        }
    }

    /**
        main method.
     */
    public static void main(String[] args) {
        new PropertyTaxCalculator();
    }
}