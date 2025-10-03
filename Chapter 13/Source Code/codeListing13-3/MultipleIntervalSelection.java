import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
    This class demonstrates the List Component in multiple interval
    selection mode.
 */

public class MultipleIntervalSelection extends JFrame
{
    private JPanel monthPanel;          // A panel that holds a list of months.
    private JPanel selectedMonthPanel;  // A panel showing selected months.
    private JPanel buttonPanel;         // A panel holding a button.
    private JList monthList;            // A list of months.
    private JList selectedMonthList;    // A list of selected month.

    private JScrollPane scrollPane1;    // Scroll pane - first list.
    private JScrollPane scrollPane2;    // Scroll pane - second list.

    private JButton button;             // A button.

    // The following array holds the values that will be displayed
    // in the monthList list component.
    private String[] months = { "January", "Februrary", "March", "April",
                                "May", "June", "July", "August", "September",
                                "October", "November", "December" };

    /**
        Constructor
     */
    public MultipleIntervalSelection()
    {
        // Set the title of the window.
        setTitle("List Demo");

        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a BorderLayout manager.
        setLayout(new BorderLayout());

        // Builds the panels.
        buildMonthPanel();
        buildSelectedMonthPanel();
        buildButtonPanel();

        // Add panels to the content pane.
        add(monthPanel, BorderLayout.NORTH);
        add(selectedMonthPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Pack and display the window.
        pack();
        setVisible(true);
    }

    /**
        The buildMonthPanel method adds a list containing the names of
        months to a panel.
     */
    private void buildMonthPanel()
    {
        // Create a panel to hold the list.
        monthPanel = new JPanel();

        // Create the list.
        monthList = new JList();
        monthList.setListData(months);

        // Set the selection mode to multiple interval selection.
        monthList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Set the number of visible rows to 6.
        monthList.setVisibleRowCount(6);

        // Add the list to a scroll pane.
        scrollPane1 = new JScrollPane(monthList);

        // Add the scroll pane to the panel.
        monthPanel.add(scrollPane1);
    }

    /**
        The buildSelectedMonthPanel method adds a list to a panel. This
        will hold the selected months.
     */
    private void buildSelectedMonthPanel()
    {
        // Create the panel.
        selectedMonthPanel = new JPanel();

        // Create the list.
        selectedMonthList = new JList();

        // Set the number of visible rows to 6.
        selectedMonthList.setVisibleRowCount(6);

        // Add the list to a scroll pane.
        scrollPane2 = new JScrollPane(selectedMonthList);

        // Add the scroll pane to the panel.
        selectedMonthPanel.add(scrollPane2);
    }

    /**
        The buildButtonPanel method adds a button to a panel.
     */
    private void buildButtonPanel()
    {
        // Create a panel to hold a button.
        buttonPanel = new JPanel();

        // Create a button.
        button = new JButton("Display selections");

        // Register an action listener to the button.
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
            // Get the selected values.
            Object[] selections = monthList.getSelectedValues();

            // Store the selected items in selectedMonthList.
            selectedMonthList.setListData(selections);
        }
    }

    /**
        The main method creates an instance of the MultipleIntervalSelection
        class which causes it to display its window.
     */
    public static void main(String[] args) {
        new MultipleIntervalSelection();
    }
}