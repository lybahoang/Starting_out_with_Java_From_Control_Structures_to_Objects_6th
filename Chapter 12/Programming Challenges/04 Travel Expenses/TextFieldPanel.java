import java.awt.FlowLayout;
import java.awt.TextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;

/**
    The TextFieldPanel class allows user to enter input.
 */

public class TextFieldPanel extends JPanel
{
    private JLabel label;           // To reference a label.
    private JTextField textField;   // To reference a text field.

    /**
        This constructor sets up a default panel.
     */
    public TextFieldPanel()
    {
        // Set a FlowLayout to the panel with 2 rows and one column.
        setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

        // Create the default label.
        label = new JLabel("Blank");

        // Create the text field.
        textField = new JTextField(10);

        // Add the components to the panel.
        add(label);
        add(textField);
    }

    /**
        This constructor sets up the panel with specified label and
        the number of columns for text field.
        @param labelText The text for label.
        @param column The number of columns for the text field.
     */
    public TextFieldPanel(String labelText, int column)
    {
        // Set a FlowLayout to the panel.
        setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

        // Create the default label.
        label = new JLabel(labelText);

        // Create the text field.
        textField = new JTextField(column);

        // Add the components to the panel.
        add(label);
        add(textField);
    }

    /**
        The getInput method return the text typed into the text field
        @return The text typed into the text field, as a String
     */
    public String getInput()
    {
        return textField.getText();
    }
}