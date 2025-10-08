import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
    The RevenueCalculatorGUI class creates a graphical user interface
    of an application to calculate the revenue of a movie theater.
 */

public class RevenueCalculatorGUI extends JFrame
{
    // A named constant for the percentage of revenue.
    private final double REVENUE_RATE = 0.20;

    // A label for greeting.
    private JLabel greeting;    
    // A label for the number of adult tickets sold.
    private JLabel adultTicketLabel;    
    // A label for the price of an adult ticket.
    private JLabel adultPriceLabel;
    // A label for the number of child tickets sold.
    private JLabel childTicketLabel;    
    // A label for the price of a child ticket.
    private JLabel childPriceLabel;
    // A text field for the number of adult tickets sold.
    private JTextField adultTicketField;
    // A text field for the number of child tickets sold.
    private JTextField childTicketField;
    // A text field for the price of an adult ticket.
    private JTextField adultPriceField;
    // A text field for the price of a child ticket.
    private JTextField childPriceField;
    // A button to show the revenue.
    private JButton calcButton;
    // A panel for greeting.
    private JPanel greetingPanel;
    // A panel for inputs.
    private JPanel inputPanel;
    // A panel for the button.
    private JPanel buttonPanel;

    /**
        The constructor sets up the frame.
     */
    public RevenueCalculatorGUI()
    {
        // Call the super class's constructor to create a frame.
        super();

        // Set the title of the frame.
        setTitle("Theater Revenue Calculator");

        // Specify an action when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout of the frame to a BorderLayout manager.
        setLayout(new BorderLayout());

        // Create the panels.
        buildGreetingPanel();
        buildInputPanel();
        buildButtonPanel();

        // Add the panels to the content pane.
        add(greetingPanel, BorderLayout.NORTH);
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Pack and display the window.
        pack();
        setVisible(true);
    }

    /**
        The buildGreetingPanel method adds a label to a panel.
     */
    private void buildGreetingPanel()
    {
        // Create a panel to hold the greeting.
        greetingPanel = new JPanel();

        // Create a label.
        greeting = new JLabel("Welcome to Movie Revenue Calculator");

        // Add the label to the panel.
        greetingPanel.add(greeting);
    }

    /**
        The buildInputPanel method adds labels and text fields to a panel.
     */
    private void buildInputPanel()
    {
        // Create a panel to hold labels and text fields.
        inputPanel = new JPanel();

        // Set a GridLayout manager with 4 rows and 2 columns to the panel.
        inputPanel.setLayout(new GridLayout(4, 2, 10, 5));

        // Create the labels.
        adultPriceLabel = new JLabel("Price per adult ticket:");
        adultTicketLabel = new JLabel("Number of adult tickets sold:");
        childPriceLabel = new JLabel("Price per child ticket:");
        childTicketLabel = new JLabel("Number of child tickets sold:");

        // Create the text fields.
        adultPriceField = new JTextField(10);
        adultTicketField = new JTextField(10);
        childPriceField = new JTextField(10);
        childTicketField = new JTextField(10);

        // Add labels and text fields to the panel.
        inputPanel.add(adultPriceLabel);
        inputPanel.add(adultPriceField);

        inputPanel.add(adultTicketLabel);
        inputPanel.add(adultTicketField);

        inputPanel.add(childPriceLabel);
        inputPanel.add(childPriceField);

        inputPanel.add(childTicketLabel);
        inputPanel.add(childTicketField);
    }

    /**
        The buildButtonPanel method adds a button to a panel.
     */
    private void buildButtonPanel()
    {
        // Create a panel to hold a button.
        buttonPanel = new JPanel();
        
        // Create a button.
        calcButton = new JButton("Calculate Revenue");

        // Register an action listener to the button.
        calcButton.addActionListener(new ButtonListener());

        // Add the button to the panle.
        buttonPanel.add(calcButton);
    }

    /**
        Private inner class that handles the event when the user
        clicks the Calculate Revenue button.
     */
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            try
            {
                // Calculate the gross revenue for adult tickets sold.
                double adultGrossRevenue = 
                    Double.parseDouble(adultTicketField.getText().trim()) *
                    Double.parseDouble(adultPriceField.getText().trim());

                // Calculate the gross revenue for child tickets sold.
                double childGrossRevenue = 
                    Double.parseDouble(childTicketField.getText().trim()) *
                    Double.parseDouble(childPriceField.getText().trim());

                // Calculate the net revenue for adult tickets sold.
                double adultNetRevenue = adultGrossRevenue * REVENUE_RATE;

                // Calculate the net revenue for child tickets sold.
                double childNetRevenue = childGrossRevenue * REVENUE_RATE;

                // Calculate the total gross revenue.
                double totalGrossRevenue = adultGrossRevenue + childGrossRevenue;

                // Calculate the total net revenue.
                double totalNetRevenue = adultNetRevenue + childNetRevenue;

                // Display the results.
                JOptionPane.showMessageDialog(null,
                String.format("Gross revenue for adult tickets sold: $%,.1f\n" +
                            "Net revenue for adult tickets sold: $%,.1f\n" +
                            "Gross revenue for child tickets sold: $%,.1f\n" +
                            "Net revenue for child tickets sold: $%,.1f\n" +
                            "Total gross revenue: $%,.1f\n" + 
                            "Total net revenue: $%,.1f\n",
                            adultGrossRevenue,
                            adultNetRevenue,
                            childGrossRevenue,
                            childNetRevenue,
                            totalGrossRevenue,
                            totalNetRevenue));
            }
            catch (NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null,
                "Error: Invalid input");
            }
        }
    }

    /**
        The main method creates an instance of the RevenueCalculatorGUI,
        which causes a window to display.
     */
    public static void main(String[] args) {
        new RevenueCalculatorGUI();
    }
    
}