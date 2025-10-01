import javax.swing.JPanel;
import javax.swing.JLabel;

/**
    The GreetingPanel class displays a greeting in the panel.
 */
public class GreetingPanel extends JPanel
{
    private JLabel greeting;    // To display a greeting.

    /**
        This constructor sets up a greeting in the panel.
     */
    public GreetingPanel()
    {
        // Create a label for greeting.
        greeting = new JLabel("Welcome to Retail Price Calculator");

        // Add the label to the panel.
        add(greeting);
    }
}