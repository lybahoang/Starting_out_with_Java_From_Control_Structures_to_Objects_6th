import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JPanel;

/**
    The CoffeePanel class allows the user to select coffee.
 */

public class CoffeePanel extends JPanel
{
    // The following constants are used to indicate the cost 
    // of coffee.
    public static final double NO_COFFEE = 0.0;
    public static final double REGULAR_COFFEE = 1.25;
    public static final double DECAF_COFFEE = 1.25;
    public static final double CAPPUCCINO = 2.0;

    // Private fields (components) of the class (panel).
    private JRadioButton noCoffee;      // To select no coffee.
    private JRadioButton regularCoffee; // To select regular coffee.
    private JRadioButton decafCoffee;   // To select decaf coffee.
    private JRadioButton cappuccino;    // To select cappuccino.
    private ButtonGroup buttonGroup;    // Radio button group.

    /**
        This constructor sets up the panel with its components.
     */
    public CoffeePanel()
    {
        // Create a GridLayout manager object with four rows and
        // one column.
        setLayout(new GridLayout(4, 1));

        // Create the radio buttons for coffee.
        noCoffee = new JRadioButton("No coffee");
        regularCoffee = new JRadioButton("Regular coffee", true);
        decafCoffee = new JRadioButton("Decaf coffee");
        cappuccino = new JRadioButton("Cappuccino");

        // Group the radio buttons to create a mutally exclusive
        // relationship.
        buttonGroup = new ButtonGroup();
        buttonGroup.add(noCoffee);
        buttonGroup.add(regularCoffee);
        buttonGroup.add(decafCoffee);
        buttonGroup.add(cappuccino);

        // Add the radio buttons to the panel.
        add(noCoffee);
        add(regularCoffee);
        add(decafCoffee);
        add(cappuccino);
    }

    /**
        The getCoffeeCost method returns the cost of the selected type
        of coffee
        @return The cost of the selected type of coffee
     */
    public double getCoffeeCost()
    {
        // A variable to hold the cost of coffee.
        double coffeeCost = 0.0;

        // Determine the cost of coffee.
        if (noCoffee.isSelected())
        {
            // If noCoffee radio button is selected, then set the coffee
            // cost to NO_COFFEE.
            coffeeCost = NO_COFFEE;
        }
        else if (regularCoffee.isSelected())
        {
            // If regularCoffee radio button is selected, then set the
            // coffee cost to REGULAR_COFFEE.
            coffeeCost = REGULAR_COFFEE;
        }
        else if (decafCoffee.isSelected())
        {
            // If decafCoffee radio button is selected, the set the coffee
            // cost to DECAF_COFFEE.
            coffeeCost = DECAF_COFFEE;
        }
        else if (cappuccino.isSelected())
        {
            // If cappuccino radio button is selected, then set the coffee
            // cost to CAPPUCCINO.
            coffeeCost = CAPPUCCINO;
        }
        
        // Return the cost of coffee.
        return coffeeCost;
    }
}