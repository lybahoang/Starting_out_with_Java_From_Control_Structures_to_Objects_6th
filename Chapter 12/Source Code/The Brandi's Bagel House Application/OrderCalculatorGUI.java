import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
    The OrderCalculatorGUI class creates the GUI for the Brandi's
    Bagel House application.
 */

public class OrderCalculatorGUI extends JFrame
{
    private BagelPanel bagels;          // Bagel panel.
    private ToppingPanel toppings;      // Topping panel.
    private CoffeePanel coffee;         // Coffee panel.
    private GreetingPanel banner;       // To display a greeting.
    private JPanel buttonPanel;         // To hold the buttons.
    private JButton calculateButton;    // To calculate the cost.
    private JButton exitButton;         // To exit the application.
    private final double TAX_RATE = 0.06;   // Sales tax rate.

    /**
        This constructor sets up a frame with components.
     */
    public OrderCalculatorGUI()
    {
        // Display a title.
        setTitle("Order Calculator");

        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set a BorderLayout manager to the panel.
        setLayout(new BorderLayout());
        
        // Create the custom panels.
        bagels = new BagelPanel();
        toppings = new ToppingPanel();
        coffee = new CoffeePanel();
        banner = new GreetingPanel();

        // Create the button panel.
        buildButtonPanel();

        // Add the components to the content pane.
        add(banner, BorderLayout.NORTH);
        add(bagels, BorderLayout.WEST);
        add(toppings, BorderLayout.CENTER);
        add(coffee, BorderLayout.EAST);
        add(buttonPanel, BorderLayout.SOUTH);

        // Pack the contents of the window and display it.
        pack();
        setVisible(true);
    }

    /**
        The buildButtonPanel method builds the button panel.
     */
    private void buildButtonPanel()
    {
        // Create a panel for the buttons.
        buttonPanel = new JPanel();

        // Create the buttons.
        calculateButton = new JButton("Calculate");
        exitButton = new JButton("Exit");

        // Register the action listeners.
        calculateButton.addActionListener(new CalculateButtonListener());
        exitButton.addActionListener(new ExitButtonListener());

        // Add the buttons to the button panel.
        buttonPanel.add(calculateButton);
        buttonPanel.add(exitButton);
    }

    /**
        Private inner class that handles the event when the user
        clicks the Calculate button.
     */
    private class CalculateButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            // Variables to hold subtotal, tax, and total.
            double subtotal, tax, total;

            // Calculate the subtotal.
            subtotal = bagels.getBagelCost() +
                       toppings.getToppingCost() +
                       coffee.getCoffeeCost();

            // Calculate the sales tax.
            tax = subtotal * TAX_RATE;

            // Calculate the total.
            total = subtotal + tax;

            // Display the charges.
            JOptionPane.showMessageDialog(null, 
            String.format("Subtotal: $%,.2f\n" +
                          "Tax: $%,.2f\n" +
                          "Total: $%,.2f\n",
                          subtotal, tax, total));
        }
    }

    /**
        Private inner class that handles the event when the user
        clicks the Exit button.
     */
    private class ExitButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }

    /**
        main method.
     */
    public static void main(String[] args) {
        new OrderCalculatorGUI();
    }
}