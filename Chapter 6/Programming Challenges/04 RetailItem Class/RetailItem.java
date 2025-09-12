/**
    The RetailItem class represents an item to be sold with its description,
    units on hand, and price.
 */
public class RetailItem
{
    private String description;     // The description of the item.
    private int unitsOnHand;        // The number of units of item available.
    private double price;           // The price of the item.

    /**
        Default constructor
     */
    public RetailItem()
    {
        description = "";
        unitsOnHand = 0;
        price = 0.0;
    }

    /**
        Constructor
        @param des The description of the item
        @param units The number of units on hand
        @param itemPrice The price of the item
     */
    public RetailItem(String des, int units, double itemPrice)
    {
        description = des;
        unitsOnHand = units;
        price = itemPrice;
    }

    /**
        The getDescription method returns the description of an item
        @return The value in the description field
     */
    public String getDescription()
    {
        return description;
    }

    /**
        The getUnitsOnHand method returns the number of units of an
        item that is ready for sales
        @return The value in the unitsOnHand field
     */
    public int getUnitsOnHand()
    {
        return unitsOnHand;
    }

    /**
        The getPrice method returns the price of an item
        @return The value in the price field
     */
    public double getPrice()
    {
        return price;
    }

    /**
        The setDescription method stores a value in the description field
        @param des The description of an item
     */
    public void setDescription(String des)
    {
        description = des;
    }

    /**
        The setUnitsOnHand method stores a value in the unitsOnHand field
        @param unit The number of units of an item
     */
    public void setUnitsOnHand(int unit)
    {
        unitsOnHand = unit;
    }

    /**
        The setPrice method stores a value in the price field
        @param itemPrice The price of an item
     */
    public void setPrice(double itemPrice)
    {
        price = itemPrice;
    }
}