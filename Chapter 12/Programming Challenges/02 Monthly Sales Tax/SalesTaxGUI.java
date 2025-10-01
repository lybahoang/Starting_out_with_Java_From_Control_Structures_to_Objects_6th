import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
    The SalesTaxGUI class creates a graphical user interface for
    the application that displays a sale tax report.
 */

public class SalesTaxGUI extends JFrame
{
    // The following constants are used to hold the tax rates.
    private final double STATE_TAX_RATE = 0.04;
    private final double COUNTY_TAX_RATE = 0.02;

    // The components of the GUI.
    private JLabel label;               // To reference a label for total sales.
    private JTextField saleTextField;   // To get the total sales.
    private JButton displayButton;      // To display the tax report.

    /**
        This constructor sets up a frame with its components.
     */
    public SalesTaxGUI()
    {
        // Set the layout of the frame to a Gridlayout with 2 rows
        // and 1 column.
        setLayout(new GridLayout(2, 1));

        // Set the title of the window.
        setTitle("Monthly Sales Tax Report Program");

        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the label.
        label = new JLabel("Enter the total sales for the month ($): ");

        // Create the text field.
        saleTextField = new JTextField(10);

        // Create a panel that holds label and saleTextField.
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(saleTextField);
        
        // Create the button to display the report.
        displayButton = new JButton("Display report");

        // Create a panel for the button.
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(displayButton);

        // Register the event listener to the button.
        displayButton.addActionListener(new DisplayButtonListener());

        // Add the components to the content pane.
        add(panel);
        add(buttonPanel);

        // Pack the contents of the window and display it.
        pack();
        setVisible(true);
    }

    /**
        Private inner class that handles the event when the user
        clicks the Display report button.
     */
    private class DisplayButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                // Get the total sales of the month.
                double monthTotalSales = Double.parseDouble(saleTextField.getText());

                // Calculate the county tax.
                double countyTax = monthTotalSales * COUNTY_TAX_RATE;

                // Calculate the state tax.
                double stateTax = monthTotalSales * STATE_TAX_RATE;

                // Display a report.
                JOptionPane.showMessageDialog(null,
                String.format("Month total sales: $%,.2f\n" +
                            "County tax: $%,.2f\n" +
                            "State tax: $%,.2f\n",
                            monthTotalSales, countyTax, stateTax)
                );
            }
            catch (NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null,
                "Error: Invalid value for total sales");
            }
        }
    }

    /**
        main method.
     */
    public static void main(String[] args) {
        new SalesTaxGUI();
    }
}