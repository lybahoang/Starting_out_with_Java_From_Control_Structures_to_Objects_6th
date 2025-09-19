/**
    The RoomCarpet holds a RoomDimension object and the cost of
    carpet per square foot
 */
public class RoomCarpet
{
    private RoomDimension roomDimension;    // The room dimension.
    private double carpetPrice;             // The carpet price per square feet.
    
    /**
        The constructor sets default values to the fields
     */
    public RoomCarpet()
    {
        roomDimension = new RoomDimension();
        carpetPrice = 0.0;
    }
    
    /**
        The constructor initializes the room dimension and the cost
        of carpet per square feet
        @param roomDimension The room dimension
        @param price The carpet price
     */
    public RoomCarpet(RoomDimension roomDimension, double price)
    {
        this.roomDimension = new RoomDimension(roomDimension);
        this.carpetPrice = price;
    }

    /**
        The setRoomDimension method sets the room dimension
        @param roomDimension An object of RoomDimension
     */
    public void setRoomDimension(RoomDimension roomDimension)
    {
        this.roomDimension = new RoomDimension(roomDimension);
    }

    /**
        The setCarpetPrice method sets a value to the carpet price
        @param carpetPrice The price of carpet per square feet
     */
    public void setCarpetPrice(double carpetPrice)
    {
        this.carpetPrice = carpetPrice;
    }

    /**
        The getRoomDimension method returns the dimension of the room
        @return A RoomDimension object
     */
    public RoomDimension getRoomDimension()
    {
        // Return a copy of the roomDimension object
        return new RoomDimension(roomDimension);
    }

    /**
        The getCarpetPrice method returns the price of carpet per square
        feet
        @return The value in the carpetPrice field
     */
    public double getCarpetPrice()
    {
        return carpetPrice;
    }

    /**
        The getTotalCost method returns the total cost of the carpet
        @return The product of area and carpet price
     */
    public double getTotalCost()
    {
        return (roomDimension.getArea() * carpetPrice);
    }

    /**
        The toString method
        @return A string representing the state of the object
     */
    public String toString()
    {
        // Create a string containing the state of the object.
        String str = "Area: " + roomDimension.getArea() + ", " +
                     "Price: " + carpetPrice + ", " +
                     "Total cost: " + getTotalCost();
        
        // Return the string.
        return str;
    }
}