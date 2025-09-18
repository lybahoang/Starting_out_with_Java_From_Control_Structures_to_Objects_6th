import java.util.Scanner;

public class RainfallDemo
{
    public static void main(String[] args)
    {
        double rainfall;    // To hold the rainfall.

        // Create a Rainfall object.
        Rainfall thisYear = new Rainfall();

        // Create a Scanner object to read input from the keyboard.
        Scanner keyboard = new Scanner(System.in);

        // Store the rainfaill in this year.
        final int MONTHS = 12;
        for (int month = 1; month <= MONTHS; month++)
        {
            System.out.print("Enter rainfall for month " + month + ": ");
            rainfall = keyboard.nextDouble();
            
            while (rainfall < 0)
            {
                System.out.println("Error: Negative value for rainfaill.\n");
                System.out.print("Enter rainfall for month " + month + ": ");
                rainfall = keyboard.nextDouble();
            }

            thisYear.setRainfall(month, rainfall);
        }

        // Display the total rainfall.
        System.out.println("Total rainfall: " + thisYear.getTotalRailfall());
        
        // Display the average monthly rainfall.
        System.out.printf("Average monthly rainfall: %.3f\n", thisYear.getAverageRainfall());

        // Display the month with the most rainfall.
        System.out.println("Month with the most rainfall: " + thisYear.getMostRain());

        // Display the month with the least rainfall.
        System.out.println("Month with the least rainfall: " + thisYear.getLeastRain());
    }
}