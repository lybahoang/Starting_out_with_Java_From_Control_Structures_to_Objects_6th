/**
    The Rainfall class hold the total railfall for each of 12 months
    into an array.
 */

// A named constant for the number of months in a year

public class Rainfall
{
    final int MONTHS = 12;
    private double[] rainfallArray;
    
    /**
        The defaul contructor creates an array of 12 elemenets initialized
        with default values
     */
    public Rainfall()
    {
        rainfallArray = new double [MONTHS];
    }

    /**
        The setRainfall method store an element into a specific location
        in the array
        @param month The month in the array
        @param rainfall The amount of rainfall in that month
     */
    public void setRainfall(int month, double rainfall)
    {
        rainfallArray[month - 1] = rainfall;
    }
    
    /**
        The getTotalRailfall method returns the total rainfall for the year
        @return The total of the array
     */
    public double getTotalRailfall()
    {
        // An accumulator.
        double total = 0.0;

        // A loop to accumulate the rainfall.
        for (double rain : rainfallArray)
            total += rain;

        // Return the total rainfall.
        return total;
    }

    /**
        The getAverageRainfall method returns the average monthly rainfall
        @return The average of the array
     */
    public double getAverageRainfall()
    {
        // Get the total rainfall.
        double total = getTotalRailfall();

        // Return the average rainfall.
        return (total / MONTHS);
    }

    /**
        The getMostRain method returns the month with the largest amount of
        rainfall in a year
        @return The month with the most rainfall    
    */    
    public int getMostRain()
    {
        // Assume the rainfall of the first month as the most rainfall.
        double largest = rainfallArray[0];
        int largestIndex = 0;

        // Search for the month with the larges amount of rainfall.
        for (int index = 1; index < MONTHS; index++)
        {
            if (rainfallArray[index] > largest)
            {
                largest = rainfallArray[index];
                largestIndex = index;
            }
        }

        // Return the month with the most rainfall.
        return (largestIndex + 1);
    }

    /**
        The getLeastRain returns the month with the least amount of rainfall
        in a year
        @return The month with the least rainfall
     */
    public int getLeastRain()
    {
        // Assum the rainfall of the first month as the least rainfall.
        double least = rainfallArray[0];
        int leastIndex = 0;

        // Search for the month with the smallest amount of rainfall.
        for (int index = 1; index < MONTHS; index++)
        {
            if (rainfallArray[index] < least)
            {
                least = rainfallArray[index];
                leastIndex = index;
            }
        }

        // Return the month with the least rainfall.
        return (leastIndex + 1);
    }
}