import javax.swing.JOptionPane;
/**
    Programming challenge 11: Circuit Board Profit.
 */
public class CircuitBoardProfit
{
    public static void main(String[] args)
    {
        // A constant for the percentage of profit.
        final double PROFIT_PERCENT = 0.4;

        // Get the retail price of a circuit board.
        String input = JOptionPane.showInputDialog("Enter " +
        "the price of a circuit board: $");
        double price = Double.parseDouble(input);

        // Calculate the profit.
        double profit = price * PROFIT_PERCENT;

        // Display the result.
        JOptionPane.showMessageDialog(null, "Profit: $" + profit);

        System.exit(0);
    }
}