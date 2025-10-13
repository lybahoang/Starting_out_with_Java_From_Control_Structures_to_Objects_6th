import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;

/**
    The TaxCalculator class creates a GUI for the tax amount
    of a purchase. The tax rate is adjusted between 0 percent
    and 10 percent using a slider.
 */
public class TaxCalculator extends JFrame
{
    // The components for the amount of purchase.
    private JLabel purchaseLabel;
    private JTextField purchaseField;
    private JPanel purchasePanel;

    // The components for the tax amount.
    private JLabel taxAmountLabel;
    private JTextField taxAmountField;
    private JPanel taxAmountPanel;

    // The components for the tax rate.
    private JLabel taxRateLabel;
    private JTextField taxRateField;
    private JPanel taxRatePanel;

    // The components for the slider.
    private JSlider taxSlider;
    private JPanel taxSliderPanel;

    /**
        This constructor sets up the main frame of the GUI.
     */
    public TaxCalculator()
    {
        // Call the default constructor of JFrame class.
        super();

        // Set the title of the main frame.
        setTitle("Scrollable Tax Calculator");

        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a GridLayout with 4 rows and 1 column.
        setLayout(new GridLayout(4, 1));

        // Build the panels.
        buildPurchasePanel();
        buildTaxAmountPanel();
        buildTaxRatePanel();
        buildTaxSliderPanel();

        // Add the panels to the content pane.
        add(purchasePanel);
        add(taxAmountPanel);
        add(taxRatePanel);
        add(taxSliderPanel);

        // Pack and display the window.
        pack();
        setVisible(true);
    }

    /**
        The buildPurchasePanel method builds the purchasePanel
        with its label and text field.
     */
    private void buildPurchasePanel()
    {
        // Create a panel.
        purchasePanel = new JPanel();

        // Create the label for purchase amount.
        purchaseLabel = new JLabel("Purchase amount: ");


        // Create the text field.
        purchaseField = new JTextField(10);

        // Add the label and text field to the panel.
        purchasePanel.add(purchaseLabel);
        purchasePanel.add(purchaseField);
    }

    /**
        The buildTaxAmountPanel builds a panel with the components
        about tax amount.
     */
    private void buildTaxAmountPanel()
    {
        // Create a panel.
        taxAmountPanel = new JPanel();

        // Create the label.
        taxAmountLabel = new JLabel("Tax amount: ");

        // Create the text field.
        taxAmountField = new JTextField("0.0", 10);
        taxAmountField.setEditable(false);

        // Add the label and text field to the panel.
        taxAmountPanel.add(taxAmountLabel);
        taxAmountPanel.add(taxAmountField);
    }

    /**
        The buildTaxRatePanel builds a panel with the components
        about tax rate.
     */
    private void buildTaxRatePanel()
    {
        // Create a panel.
        taxRatePanel = new JPanel();

        // Create the label.
        taxRateLabel = new JLabel("Tax rate: ");

        // Create the text field.
        taxRateField = new JTextField("0.0 %", 10);
        taxRateField.setEditable(false);

        // Add the label and text field to the panel.
        taxRatePanel.add(taxRateLabel);
        taxRatePanel.add(taxRateField);
    }

    /**
        The buildTaxSliderPanel method builds a panel
        with components of the tax slider.
     */
    private void buildTaxSliderPanel()
    {
        // Create a panel.
        taxSliderPanel = new JPanel();

        // Create a slider.
        taxSlider = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
        
        // Set major ticks spacing and display it.
        taxSlider.setMajorTickSpacing(2);
        taxSlider.setPaintLabels(true);
        taxSlider.setPaintTicks(true);

        // Register a change listener to the slider.
        taxSlider.addChangeListener(new SliderListener());

        // Add the slider to the panel.
        taxSliderPanel.add(taxSlider);
    }

    /**
        Private inner class that handles the event when the
        knob of the slider is moved.
     */
    private class SliderListener implements ChangeListener
    {
        public void stateChanged(ChangeEvent event)
        {
            try
            {
                double taxRate, taxAmount;

                // Get the tax rate in the slider.
                taxRate = taxSlider.getValue();

                // Calculate the tax amount.
                taxAmount = Double.parseDouble(purchaseField.getText()) *
                            taxRate / 100.0;

                // Display the tax rate and tax amount in the fields.
                taxRateField.setText(String.format("%.2f %%", taxRate));
                taxAmountField.setText(Double.toString(taxAmount));
            }
            catch (NumberFormatException exception)
            {
                JOptionPane.showMessageDialog(null,
                    "Error: Invalid value for purchase amount");
            }
        }
    }

    /**
        The main method creates an instance of the TaxCalculator
        class, which causes it to display its window.
     */
    public static void main(String[] args) {
        new TaxCalculator();
    }
}