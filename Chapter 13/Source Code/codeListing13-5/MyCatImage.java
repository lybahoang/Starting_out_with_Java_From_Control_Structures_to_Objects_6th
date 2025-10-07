import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
    This class demonstrates how to use an ImageIcon and a
    JLabel to display an image.
 */

public class MyCatImage extends JFrame
{
    private JPanel imagePanel;      // A panel to hold an image.
    private JPanel buttonPanel;     // A panel to hold a button.
    private JLabel imageLabel;      // To show an image.
    private JButton button;         // To get an image.

    /**
        Constructor.
     */
    public MyCatImage()
    {
        // Set the title of the window.
        setTitle("My Cat");

        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a BorderLayout manager.
        setLayout(new BorderLayout());

        // Build the panels.
        buildImagePanel();
        buildButtonPanel();

        // Add the panels to the content pane.
        add(imagePanel);
        add(buttonPanel);

        // Pack and display the window.
        pack();
        setVisible(true);
    }
    
    /**
        The buildImagePanel method adds a label to a panel.
     */
    private void buildImagePanel()
    {
        // Create a panel.
        imagePanel = new JPanel();

        // Create a label.
        imageLabel = new JLabel("Click the button to see an image " +
                           "of my cat.");

        // Add the label to the panel.
        imagePanel.add(imageLabel);
    }

    /**
        The buildButtonPanel method adds a button to a panel.
     */
    private void buildButtonPanel()
    {
        // Create a panel.
        buttonPanel = new JPanel();

        // Create a button.
        button = new JButton("Get Image");

        // Get the smiley face image.
        ImageIcon smileyImage = new ImageIcon("Smiley.png");

        // Set the smiley face image to the button.
        button.setIcon(smileyImage);

        // Register an action listener with the button.
        button.addActionListener(new ButtonListener());

        // Add the button to the panel.
        buttonPanel.add(button);
    }

    /**
        Private inner class that handles the event when the user
        clicks the button.
     */
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            // Read the image file into an ImageIcon object.
            ImageIcon catImage = new ImageIcon("myCat.jpg");

            // Display the image in the label.
            imageLabel.setIcon(catImage);

            // Remove the text from the label.
            imageLabel.setText(null);

            // Pack the frame again to accommodate the new
            // size of the label.
            pack();
        }
    }

    /**
        The main method creates an instance of the MyCatImage
        class, which causes it to display its window.
     */
    public static void main(String[] args) {
        new MyCatImage();
    }
}