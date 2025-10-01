import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
    The PriceCalculatorGUI class creates a GUI for a retail price
    calculator application.
 */

public class PriceCalculatorGUI extends JFrame
{
    private GreetingPanel greeting;     // To reference a panel for greeting.
    private TextFieldPanel pricePanel;  // To reference a panel for price.
    private TextFieldPanel markupPanel; // To reference a panel for markup.
    private JButton calculateButton;    // To calculate the price.
    private JPanel buttonPanel;         // To reference a panel for button.

    /**
        This constructor sets up a frame of the GUI.
     */
    public PriceCalculatorGUI()
    {
        // Set the title of the frame.
        setTitle("Retail Price Calculator");

        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set a GridLayout to the window with 4 rows and 1 column.
        setLayout(new GridLayout(4, 1));

        // Create a panel for greeting.
        greeting = new GreetingPanel();
        
        // Create panel for text fields.
        pricePanel = new TextFieldPanel("Enter the whole price ($): ", 10);
        markupPanel = new TextFieldPanel("Enter the markup rate (%): ", 10);

        // Create the panel for button.
        calculateButton = new JButton("Calculate");

        // Register the event listener to the buttong.
        calculateButton.addActionListener(new CalculateButtonListener());

        // Create a panel for button.
        buttonPanel = new JPanel();
        buttonPanel.add(calculateButton);

        // Add the components to the content pane.
        add(greeting);
        add(pricePanel);
        add(markupPanel);
        add(buttonPanel);

        // Pack the contents of the window and display it.
        pack();
        setVisible(true);
    }

    /**
        Private inner class that handles the event when the user
        clicks the Calculate button
     */
    private class CalculateButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            // A variable to hold the whole price, markup rate, and 
            // retail price.
            double wholePrice, markupRate, retailPrice;

            // Calculate the retail price.
            wholePrice = Double.parseDouble(pricePanel.getInput());
            markupRate = Double.parseDouble(markupPanel.getInput()) / 100;
            retailPrice = wholePrice * markupRate + wholePrice;

            // Display the retail price.
            JOptionPane.showMessageDialog(null, 
            String.format("Whole price: $%,.2f\n" +
                          "Markup percentage: %,.1f%%\n" +
                          "Retail price: $%,.2f\n",
                          wholePrice, markupRate * 100, retailPrice));
        }
    }

    /**
        main method.
     */
    public static void main(String[] args)
    {
        new PriceCalculatorGUI();
    }
}