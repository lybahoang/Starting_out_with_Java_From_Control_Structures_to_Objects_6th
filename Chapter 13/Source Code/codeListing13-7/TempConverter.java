import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

/**
    This class displays a window with a slider component.
    The user can convert the Celsius temperatures from 0
    through 100 to Fahrenheit by moving the slider.
 */

public class TempConverter extends JFrame
{
    private JLabel label1, label2;          // Message labels.
    private JTextField fahrenheitTemp;      // Fahrenheit temp.
    private JTextField celsiusTemp;         // Celsius temp.
    private JPanel fpanel;                  // Fahrenheit panel.
    private JPanel cpanel;                  // Celsius panel.
    private JPanel sliderPanel;             // Slider panel.
    private JSlider slider;                 // Temperature slider.

    /**
        Constructor
     */
    public TempConverter()
    {
        // Set the title.
        setTitle("Temperature Converter");

        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the message labels.
        label1 = new JLabel("Fahrenheit: ");
        label1.setFont(new Font("Serif", Font.BOLD, 12));
        label2 = new JLabel("Celsius: ");
        label2.setFont(new Font("Serif", Font.BOLD, 12));
        
        // Create the read-only text fields.
        fahrenheitTemp = new JTextField("32.0", 10);
        fahrenheitTemp.setEditable(false);
        fahrenheitTemp.setFont(new Font("Serif", Font.PLAIN, 12));
        celsiusTemp = new JTextField("0.0", 10);
        celsiusTemp.setEditable(false);
        celsiusTemp.setFont(new Font("Serif", Font.PLAIN, 12));

        // Create the slider.
        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(new SliderListener());
        slider.setFont(new Font("Serif", Font.BOLD, 12));

        // Create panels and place the components in them.
        fpanel = new JPanel();
        fpanel.add(label1);
        fpanel.add(fahrenheitTemp);
        
        cpanel = new JPanel();
        cpanel.add(label2);
        cpanel.add(celsiusTemp);

        sliderPanel = new JPanel();
        sliderPanel.add(slider);

        // Create a GridLayout manager.
        setLayout(new GridLayout(3, 1));

        // Add the panels to the content pane.
        add(fpanel);
        add(cpanel);
        add(sliderPanel);

        // Pack and display the window.
        pack();
        setVisible(true);
    }

    /**
        Private inner class that handles the events that
        are generated when the slider's knob is moved.
     */
    private class SliderListener implements ChangeListener
    {
        public void stateChanged(ChangeEvent event)
        {
            double fahrenheit, celsius;

            // Get the slider value.
            celsius = slider.getValue();

            // Convert the value to Fahrenheit.
            fahrenheit = (9.0 / 5.0) * celsius + 32.0;

            // Store the celsius temp in its display field.
            celsiusTemp.setText(Double.toString(celsius));

            // Store the Fahrenhiet temp it its display field.
            fahrenheitTemp.setText(Double.toString(fahrenheit));
        }
    }

    /**
        The main method creates an instance of the class,
        which displays a window with a slider.
     */
    public static void main(String[] args) {
        new TempConverter();
    }
}