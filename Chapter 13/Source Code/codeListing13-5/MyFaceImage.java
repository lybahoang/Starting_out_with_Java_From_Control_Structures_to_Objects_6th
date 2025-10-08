
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
    This class demonstrates how to use an ImageIcon and
    a JLabel to display an image.
 */

public class MyFaceImage extends JFrame
{
    private JLabel imageLabel;      // To show an image.
    private JPanel imagePanel;      // To hold the label.
    private JPanel buttonPanel;     // To hold a button.
    private JButton button;         // To show an image.

    /**
        This constructor sets up the main frame of the GUI.
     */
    public MyFaceImage()
    {
        // Set the title of the frame.
        this.setTitle("My face");

        // Specify an action for the close button.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a BorderLayout manager.
        setLayout(new BorderLayout());

        // Build the panels.
        buildImagePanel();
        buildButtonPanel();

        // Add the panels to the content pane.
        add(imagePanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Pack and display the window.
        pack();
        setVisible(true);
    }

    /**
        The buildImagePanel method adds a label to the panel.
     */
    private void buildImagePanel()
    {
        // Create a panel to hold a label.
        imagePanel = new JPanel();

        // Create a label.
        imageLabel = new JLabel("Click the button to " +
        "see an image of my face.");

        // Add the label to the panel.
        imagePanel.add(imageLabel);
    }

    /**
        The buildButtonPanel method adds a button to a panel.
     */
    private void buildButtonPanel()
    {
        // Create a panel to hold a button.
        buttonPanel = new JPanel();
        
        // Create a button.
        button = new JButton("Get Image");

        // Create an ImageIcon to open the icon.
        ImageIcon icon = new ImageIcon("point.png");
        button.setIcon(icon);
        
        // Register an action listener to the button.
        button.addActionListener(new ButtonListener());

        // Add the button to the panel.
        buttonPanel.add(button);
    }

    /**
        Private inner class that handles the event when the user
        clicks the Get Image button.
     */
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            // Read the image file into an ImageIcon object.
            ImageIcon myFace = new ImageIcon("myFace.png");

            // Display the image in the label.
            imageLabel.setIcon(myFace);

            // Remove the text from the label.
            imageLabel.setText(null);

            // Pack the frame again to accommodate the new
            // size of the label.
            pack();
        }
    }

    /**
        The main method creates an instance of the MyFaceImage
        class, which causes it to display its window.
     */
    public static void main(String[] args) {
        new MyFaceImage();
    }
}