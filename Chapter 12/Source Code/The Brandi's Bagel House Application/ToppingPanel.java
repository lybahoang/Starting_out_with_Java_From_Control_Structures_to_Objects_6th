import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

/**
    The ToppingPanel class allows the user to select the toppings
    for the bagel.
 */

public class ToppingPanel extends JPanel
{
    // The following constants are used to indicate the cost of
    // the toppings.
    public final double CREAM_CHEESE = 0.50;
    public final double BUTTER = 0.25;
    public final double PEACH_JELLY = 0.75;
    public final double BLUEBERRY_JAM = 0.75;

    // Private fields of the class.
    private JCheckBox creamCheese;      // To select cream chese.
    private JCheckBox butter;           // To select butter.
    private JCheckBox peachJelly;       // To select peach jelly.
    private JCheckBox blueberryJam;     // To select blueberry jam.

    /**
        Constructor
     */
    public ToppingPanel()
    {
        // Create a GridLayout manager object with four rows and
        // one column.
        setLayout(new GridLayout(4, 1));

        // Create check boxes for toppings.
        creamCheese = new JCheckBox("Cream cheese");
        butter = new JCheckBox("Butter");
        peachJelly = new JCheckBox("Peach jelly");
        blueberryJam = new JCheckBox("Blueberry jam");

        // Add a border around the panel.
        setBorder(BorderFactory.createTitledBorder("Toppings"));

        // Add the check boxes to the panel.
        add(creamCheese);
        add(butter);
        add(peachJelly);
        add(blueberryJam);
    }

    /**
        The getToppingCost method return the cost of the selected toppings.
        @return The cost of the selected toppings.
     */
    public double getToppingCost()
    {
        // A variable to hold the cost of the selected toppings.
        double toppingCost = 0.0;

        // If creamCheese check box is selected, then add its cost to
        // toppingCost.
        if (creamCheese.isSelected())
        {
            toppingCost += CREAM_CHEESE;
        }
        // If butter check box is selected, then add its cost to toppingCost.
        if (butter.isSelected())
        {
            toppingCost += BUTTER;
        }
        // If peachJelly check box is selected, then add its cost to toppingCost.
        if (peachJelly.isSelected())
        {
            toppingCost += PEACH_JELLY;
        }
        // If blueberryJam check box is selected, then add its cost to
        // toppingCost.
        if (blueberryJam.isSelected())
        {
            toppingCost += BLUEBERRY_JAM;
        }

        // Return the cost of the selected toppings.
        return toppingCost;
    }
}