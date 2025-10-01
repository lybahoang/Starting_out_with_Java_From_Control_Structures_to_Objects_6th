import javax.swing.*;

/**
    The GreetingPanel class displays a greeting in a panel.
 */
public class GreetingPanel extends JPanel
{
    private JLabel greeting;        // To display a greeting.

    /**
        The constructor creats a greeting and adds it to the
        label.
     */
    public GreetingPanel()
    {
        // Create the lable.
        greeting = new JLabel("Welcome to Brandi's Bagel House");

        // Add the label to this panel.
        this.add(greeting);
    }
}