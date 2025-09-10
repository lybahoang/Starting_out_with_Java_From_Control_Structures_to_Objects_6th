/**
 * This program shows my solution to the programming challenge 4 chapter 5.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 10 September 2025.
 */

public class FallingDistance
{
    public static void main(String[] args)
    {
        System.out.println("Time (s)\tDistance (m)");
        System.out.println("------------------------");
        for (int time = 1; time <= 10; time++)
        {   
            System.out.printf("%d\t\t   %.3f\n", time, fallingDistance(time));
        }
    }

    /**
     * The fallingDistance method accepts an object's falling time (in seconds)
     * and return the distance in meters that the object has fallen
     * @param fallingTime The object's falling time
     * @return The distance that the object has fallen during that time period
     */
    public static double fallingDistance(double fallingTime)
    {
        final float GRAVITATIONAL_ACCELERATION = 9.8f; 
        return (0.5 * GRAVITATIONAL_ACCELERATION * Math.pow(fallingTime, 2.0));
    }
}