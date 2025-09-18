/**
    The Area class provides static methods to calculate area
    of several common shapes: circle, rectangles, and cylinders.
 */
public class Area
{
    /**
        The getArea method accepts a raidus and returns the area
        of the circle
        @param radius The radius of the circle
        @return The area of the circle
     */
    public static double getArea(double radius)
    {
        return (Math.PI * Math.pow(radius, 2.0));
    }

    /**
        This version of getArea method accepts a length and a width
        of a rectangle and returns its area
        @param length The rectangle's length
        @param width The rectangle's width
        @return The product of length times width
     */
    public static double getArea(double length, double width)
    {
        return (length * width);
    }

    /**
        This version of getArea method accepts the raidus and height of
        a cylinder and returns its area
        @param radius The cylinder's radius
        @param height The cylinder's height
        @return The area of the cylinder
     */
    public static double getArea(double radius, double height, boolean isCylinder)
    {
        if (isCylinder)
            return (Math.PI * Math.pow(radius, 2.0) * height);
        return -1;
    }
}