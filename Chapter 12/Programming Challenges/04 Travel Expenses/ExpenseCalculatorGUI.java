import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
    The ExpenseCalculatorGUI creates a graphical user interface for
    an application that calculates the total travel expenses of
    a business person on a trip.
 */

public class ExpenseCalculatorGUI extends JFrame
{
    private TextFieldPanel dayPanel;            // Panel for number of days.
    private TextFieldPanel airfarePanel;        // Panel for airfare.
    private TextFieldPanel carRentalPanel;      // Panel for car rental fee.
    private TextFieldPanel milePanel;           // Panel for miles driven.
    private TextFieldPanel parkingPanel;        // Panel for parking fee.
    private TextFieldPanel taxiPanel;           // Panel for taxi fee.
    private TextFieldPanel registrationPanel;   // Panel for registration fee.
    private TextFieldPanel lodgingPanel;        // Label for lodging fee.
    private JButton calcButton;                 // Calculate button.
    private JPanel buttonPanel;                 // Panel for Calculate button.

    /**
        This constructor sets up the frame of the GUI.
     */
    public ExpenseCalculatorGUI()
    {
        // Set the title of the frame.
        setTitle("Travel Expense Calculator Program");

        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set a GridLayout with 9 rows and 1 column to the frame.
        setLayout(new GridLayout(9, 1));

        // Build the panels.
        buildTextFieldPanels();
        buildButtonPanel();

        // Add the two panels to the content pane.
        add(dayPanel);
        add(airfarePanel);
        add(carRentalPanel);
        add(milePanel);
        add(parkingPanel);
        add(taxiPanel);
        add(registrationPanel);
        add(lodgingPanel);
        add(buttonPanel);

        // Pack the contents of the window and display it.
        pack();
        setVisible(true);
    }
    
    /**
        The buildTextFieldPanels method builds panels of text fields.
     */
    private void buildTextFieldPanels()
    {
        // Create panels of text fields.
        dayPanel = new TextFieldPanel(
            "Number of days: ", 10);
        airfarePanel = new TextFieldPanel(
            "Amount of airfare ($): ", 10);
        carRentalPanel = new TextFieldPanel(
            "Amount of car rental fee ($): ", 10);
        milePanel = new TextFieldPanel(
            "Number of miles driven: ", 10);
        parkingPanel = new TextFieldPanel(
            "Amount of parking fees ($): ", 10);
        taxiPanel = new TextFieldPanel(
            "Amount of taxi charges ($): ", 10
        );
        registrationPanel = new TextFieldPanel(
            "Conference or seminar registration fees ($): ", 10
        );
        lodgingPanel = new TextFieldPanel(
            "Lodging charges ($): ", 10
        );
    }

    /**
        The buildButtonPanel method builds a panel that holds a button.
     */
    private void buildButtonPanel()
    {
        // Create a panel to hold a button.
        buttonPanel = new JPanel();

        // Create the button.
        calcButton = new JButton("Calculate");

        // Register the event listerner to the button.
        calcButton.addActionListener(new CalcButtonListener());

        // Add the button to the button panel.
        buttonPanel.add(calcButton);
    }

    /**
        Private inner class that handles the event when the user clicks
        the Calculate button.
     */
    private class CalcButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            try
            {
                // Create an ExpenseCalculator object and pass into it
                // the inputs in the text fields.
                ExpenseCalculator calculator = new ExpenseCalculator(
                    Integer.parseInt(dayPanel.getInput()),
                    Double.parseDouble(airfarePanel.getInput()),
                    Double.parseDouble(carRentalPanel.getInput()),
                    Double.parseDouble(milePanel.getInput()),
                    Double.parseDouble(parkingPanel.getInput()),
                    Double.parseDouble(taxiPanel.getInput()),
                    Double.parseDouble(registrationPanel.getInput()),
                    Double.parseDouble(lodgingPanel.getInput())
                );

                // Calculate the total expenses incurred by the business person.
                double incurredExpense = calculator.calculateTotalExpense();

                // Calculate the total allowance expenses for the trip.
                double totalAllowance = calculator.calculateTotalAllowance();

                // Calculate the excess that must be paid by the business persion.
                double excessPaid = calculator.calculateExcessPaid();

                // Calculate the amount saved by the business person.
                double savedAmount = calculator.calculateSavedAmount();

                // Display the results.
                JOptionPane.showMessageDialog(null,
                    String.format("Total expenses incurred: $%,.2f\n" +
                                  "Total allowance expenses: $%,.2f\n" +
                                  "Excess paid: $%,.2f\n" +
                                  "Amount saved: $%,.2f\n",
                                  incurredExpense, totalAllowance,
                                  excessPaid, savedAmount)
                );
            }
            catch (NumberFormatException exception)
            {
                JOptionPane.showMessageDialog(null,
                "Error: Invalid values in input");
            }
        }
    }

    /**
        main method.
     */
    public static void main(String[] args) {
        new ExpenseCalculatorGUI();
    }
}