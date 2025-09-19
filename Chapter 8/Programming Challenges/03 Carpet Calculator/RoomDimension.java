/**
    The RoomDimension class holds the dimensions (length and width)
    of a room
 */
public class RoomDimension
{
    private double length;  // The length of the room.
    private double width;   // The width of the room.

    /**
        The default constructor sets length and width at 0.0
     */
    public RoomDimension()
    {
        length = 0.0;
        width = 0.0;
    }

    /**
        The constructor sets the length and width of the room
        to specific values
        @param length The room's length
        @param width The room's width
     */
    public RoomDimension(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    /**
        The constructor sets the length and the width of the room
        @param length The room's length, as a String
        @param width The room's width, as a String
     */
    public RoomDimension(String length, String width)
    {
        this.length = Double.parseDouble(length);
        this.width = Double.parseDouble(width);
    }

    /**
        The copy constructor copies fields of another object to this
        object
        @param anotherObject The another object
     */
    public RoomDimension(RoomDimension anotherObject)
    {
        this.length = anotherObject.length;
        this.width = anotherObject.width;
    }

    /**
        The setLength method sets the length of a room.
        @param length The room's length
     */
    public void setLength(double length)
    {
        this.length = length;
    }

    /**
        The setLength method sets the length of a room
        @param length The room's length, as a String
     */
    public void setLength(String length)
    {
        this.length = Double.parseDouble(length);
    }

    /**
        The setWidth method sets the width of a room
        @param width The room's width
     */
    public void setWidth(double width)
    {
        this.width = width;
    }

    /**
        The setWidth method sets the width of a room
        @param width The room's width, as a String
     */
    public void setWidth(String width)
    {
        this.width = Double.parseDouble(width);
    }

    /**
        The getLength method returns the length of a room
        @return The value in the length field
     */
    public double getLength()
    {
        return length;
    }

    /**
        The getWidth method returns the width of a room
        @return The value in the width field
     */
    public double getWidth()
    {
        return width;
    }

    /**
        The getArea method returns the area of the room
        @return The product of length and width
     */
    public double getArea()
    {
        return length * width;
    }

    /**
        The toString method returns the state of the object
        @return A string containing the room dimension
     */
    public String toString()
    {
        // Create a string representing the object
        String str = "Length: " + this.getLength() + ", " +
                     "Width: " + this.getWidth();

        // Return the string.
        return str;
    }
}