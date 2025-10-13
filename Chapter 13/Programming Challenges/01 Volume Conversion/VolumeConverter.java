import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
/**
    The VolumeConverter class creates a GUI for volume conversion
    from liters to gallons.
 */

public class VolumeConverter extends JFrame
{
    private JLabel literMessage;        // To hold a message.
    private JTextField literField;      // To hold litter value.
    private JPanel literPanel;          // A panel to hold liter.
    
    private JLabel gallonMessage;       // To hold a message.
    private JTextField gallonField;     // To hold gallon value.
    private JPanel gallonPanel;         // A panel to hold gallon.

    private JSlider volumeSlider;       // To hold a slider.
    private JPanel sliderPanel;         // The slider's panel.

    /**
        This constructor sets up the main frame of the GUI.
     */
    public VolumeConverter()
    {
        // Call the JFrame's default constructor.
        super();

        // Set the title of the frame.
        setTitle("Volume Converter");

        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set a GridLayout with 3 rows and 1 column.
        setLayout(new GridLayout(3, 1));

        // Build the panels.
        buildLiterPanel();
        buildGallonPanel();
        buildSliderPanel();

        // Add the panels to the content pane.
        add(literPanel);
        add(gallonPanel);
        add(sliderPanel);

        // Pack and display the window.
        pack();
        setVisible(true);
    }

    /**
        The buildLiterPanel method builds a panel to hold
        a label and a read-only text field of liter.
     */
    private void buildLiterPanel()
    {
        // Create a panle.
        literPanel = new JPanel();

        // Create the label and set its font to Serif.
        literMessage = new JLabel("Liters: ");
        literMessage.setFont(new Font("Serif", Font.PLAIN, 12));

        // Create a read-only text field with initial value is 0.
        literField = new JTextField("0.0", 10);
        literField.setEditable(false);
        literField.setFont(new Font("Serif", Font.PLAIN, 12));

        // Add the label and text field to the panel.
        literPanel.add(literMessage);
        literPanel.add(literField);
    }

    /**
        The buildGallonPanel method builds a panel with a
        label and a read-only text field of gallon.
     */
    private void buildGallonPanel()
    {
        // Create a panel.
        gallonPanel = new JPanel();
        gallonPanel.setFont(new Font("Serif", Font.PLAIN, 12));

        // Create the label.
        gallonMessage = new JLabel("Gallons: ");
        gallonMessage.setFont(new Font("Serif", Font.PLAIN, 12));

        // Create the read-only text field.
        gallonField = new JTextField("0.0", 10);
        gallonField.setFont(new Font("Serif", Font.PLAIN, 12));
        gallonField.setEditable(false);

        // Add the label and text field to the panel.
        gallonPanel.add(gallonMessage);
        gallonPanel.add(gallonField);
    }

    /**
        The buildSliderPanel builds a panel with a slider
     */
    private void buildSliderPanel()
    {
        // Create a panel.
        sliderPanel = new JPanel();
        sliderPanel.setFont(new Font("Serif", Font.PLAIN, 12));

        // Create a slider.
        volumeSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        volumeSlider.setFont(new Font("Serif", Font.PLAIN, 12));
        volumeSlider.setMajorTickSpacing(20);
        volumeSlider.setMinorTickSpacing(4);
        volumeSlider.setPaintTicks(true);
        volumeSlider.setPaintLabels(true);

        // Register a change listener to the slider.
        volumeSlider.addChangeListener(new SliderListener());

        // Add the slider to the panel.
        sliderPanel.add(volumeSlider);
    }

    /**
        Private inner class that handles the event when the
        knob of the slider is moved.
     */
    private class SliderListener implements ChangeListener
    {
        public void stateChanged(ChangeEvent event)
        {
            double liter, gallon;

            // Get the slider value.
            liter = volumeSlider.getValue();
    
            // Calculate the gallons.
            gallon = liter * 0.26417;

            // Set the liter and gallon in the fields.
            literField.setText(Double.toString(liter));
            gallonField.setText(String.format("%.5f", gallon));
        }
    }

    /**
        The main method creates an instance of the VolumeConverter
        class, which causes it to display its window.
     */
    public static void main(String[] args) {
        new VolumeConverter();
    }
}