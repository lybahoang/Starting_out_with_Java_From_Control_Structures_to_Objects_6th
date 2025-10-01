import java.awt.*;
import javax.swing.*;

/**
    The BagelPanel class allows the user to select either
    a white or whole wheat bagel.
 */

public class BagelPanel extends JPanel
{
    // The following constants are used to indicate the cost
    // of each type of bagel.
    public final double WHITE_BAGEL = 1.25;
    public final double WHEAT_BAGEL = 1.50;

    // Private fields of the class.
    private JRadioButton whiteBagel;    // To select white bagel.
    private JRadioButton wheatBagel;    // To select wheat bagel.
    private ButtonGroup buttonGroup;    // Radio button group.

    /**
        Constructor
     */
    public BagelPanel()
    {
        // Create a GridLayout manager with two rows and one
        // column.
        setLayout(new GridLayout(2, 1));

        // Create the radio buttons.
        whiteBagel = new JRadioButton("White", true);
        wheatBagel = new JRadioButton("Wheat");

        // Group the radio buttons.
        buttonGroup = new ButtonGroup();
        buttonGroup.add(whiteBagel);
        buttonGroup.add(wheatBagel);

        // Add a border around the panel.
        setBorder(BorderFactory.createTitledBorder("Bagel"));

        // Add radio buttons to the panel.
        add(whiteBagel);
        add(wheatBagel);
    }

    /**
        The getBagelCost method returns the cost of the selected
        panel.
        @return The cost of the selected panel.
     */
    public double getBagelCost()
    {
        double bagelCost;

        // If the whiteBagel radio button is selected, then the
        // cost of white bagel is taken.
        if (whiteBagel.isSelected())
        {
            bagelCost = WHITE_BAGEL;
        }
        // Otherwise, the cost of whole wheat bagel is taken.
        else
        {
            bagelCost = WHEAT_BAGEL;
        }

        // Return the cost.
        return bagelCost;
    }
}